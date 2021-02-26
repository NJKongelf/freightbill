package se.fraktservice.freightbill.Controllers;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import se.fraktservice.freightbill.Models.IncommingRequestDataJsonFreight;
import se.fraktservice.freightbill.Models.Model;
import se.fraktservice.freightbill.Services.Mailservice;
import se.fraktservice.freightbill.Services.ServiceJapserReport;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class ControllerFreightBill {

    @Autowired
   private ServiceJapserReport jasperServiceJapserReport;

    @Autowired
    private Mailservice mail;

    @PostMapping(value = "/pdffreightbill")
   public void makeFreightBill( @RequestBody IncommingRequestDataJsonFreight injson) throws IOException, JRException, MessagingException {


        Model model= injson.getModel();

        byte[] file = JasperExportManager.exportReportToPdf(jasperServiceJapserReport.makePDF(model));
        mail.sendEmail(model.getSendFreightBillToEmail(), model.getFreightBillNumber()+".PDF"," ", model.getFreightBillNumber(),file);
   }

}
