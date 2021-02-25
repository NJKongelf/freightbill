package se.fraktservice.freightbill.Controllers;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.fraktservice.freightbill.Models.IncommingRequestDataJsonFreight;
import se.fraktservice.freightbill.Models.Model;
import se.fraktservice.freightbill.Services.ServiceJapserReport;
import java.io.FileNotFoundException;

@RestController
public class ControllerFreightBill {

    @Autowired
   private ServiceJapserReport jasperServiceJapserReport;

    @PostMapping(value = "/pdffreightbill")
   public void makeFreightBill( @RequestBody IncommingRequestDataJsonFreight injson) throws FileNotFoundException, JRException {
        String path = "C:\\dd\\";
        Model model= injson.getModel();
        JasperExportManager.exportReportToPdfFile(jasperServiceJapserReport.makePDF(model),path+"testbill.pdf");

   }

}
