package se.fraktservice.freightbill.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.fraktservice.freightbill.Models.FreightBill;
import se.fraktservice.freightbill.Services.ServiceJapserReport;

@RestController
public class ControllerFreightBill {

    @Autowired
   private ServiceJapserReport jasperServiceJapserReport;

    @PostMapping("/pdffreightbill")
   public void makeFreightBill(@RequestBody FreightBill freightBill){

   }

}
