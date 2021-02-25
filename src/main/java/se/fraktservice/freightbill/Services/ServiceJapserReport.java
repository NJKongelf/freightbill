package se.fraktservice.freightbill.Services;


import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import se.fraktservice.freightbill.Models.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;


@Service
public class ServiceJapserReport {

    public JasperPrint makePDF(Model model) throws JRException, FileNotFoundException {

        Map<String,Object> parameters =model.getParameters();
        parameters.put("DS1",model.getFreightBillRows());

        File file = ResourceUtils.getFile("classpath:freightbill.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, parameters,new JREmptyDataSource());
        return jasperPrint;
    }
}
