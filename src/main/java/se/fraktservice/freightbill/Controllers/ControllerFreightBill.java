package se.fraktservice.freightbill.Controllers;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import se.fraktservice.freightbill.Models.CustomProperties;
import se.fraktservice.freightbill.Models.IncommingRequestDataJsonFreight;
import se.fraktservice.freightbill.Models.Model;
import se.fraktservice.freightbill.Services.KeyCheckService;
import se.fraktservice.freightbill.Services.Mailservice;
import se.fraktservice.freightbill.Services.ServiceJapserReport;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
public class ControllerFreightBill {

    @Autowired
   private ServiceJapserReport jasperServiceJapserReport;

   @Autowired
   private KeyCheckService keycheck;

    @Autowired
    private Mailservice mail;

    Logger logger = LoggerFactory.getLogger(Mailservice.class);

    @PostMapping(value = "/pdffreightbill")
   public void makeFreightBill( @RequestBody IncommingRequestDataJsonFreight injson) throws IOException, JRException, MessagingException {
        if(keycheck.keyEvaluator(injson.getCustomProperties())) {
            checkMailDiffrentoption(injson.getCustomProperties());
            Model model = injson.getModel();
            byte[] file = JasperExportManager.exportReportToPdf(jasperServiceJapserReport.makePDF(model));
            mail.sendEmail(model.getSendFreightBillToEmail(), model.getFreightBillNumber() + ".PDF", " ", model.getFreightBillNumber(), file);
        }
        else {
        logger.error("Key not same");
        }
   }

   private void checkMailDiffrentoption(CustomProperties customProperties){
       if(customProperties.getMailHost() !=null&&customProperties.getMailUser() !=null)
           mail.setMailserver(customProperties);
       else
           mail.init();
   }
}
