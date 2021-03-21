package se.fraktservice.freightbill.Services;


import net.sf.jasperreports.engine.*;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import se.fraktservice.freightbill.Models.Model;

import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;


@Service
public class ServiceJapserReport {

    private ResourceLoader resourceLoader;

    @Inject
    public ServiceJapserReport(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public JasperPrint makePDF(Model model) throws JRException, IOException {

        Map<String,Object> parameters =model.getParameters();
        parameters.put("DS1",model.getFreightBillRows());
        //BufferedReader txtReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("freightbill.jrxml")));
        Resource resource = new ClassPathResource("freightbill.jrxml");


        //File file = ResourceUtils.getFile("freightbill.jrxml");
        //Resource resource = new ClassPathResource("freightbill.jrxml");

        //File file=resource.getFile();
        JasperReport jasperReport = JasperCompileManager.compileReport(resource.getInputStream());
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, parameters,new JREmptyDataSource());
        return jasperPrint;
    }
}
