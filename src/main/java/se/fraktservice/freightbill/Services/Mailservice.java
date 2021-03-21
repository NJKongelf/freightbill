package se.fraktservice.freightbill.Services;
import com.sun.mail.smtp.SMTPTransport;
import org.apache.commons.io.FileUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.fraktservice.freightbill.Config.MailProperty;
import se.fraktservice.freightbill.Models.CustomProperties;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.*;
import java.util.Optional;
import java.util.Properties;

@Service
public class Mailservice {
    private  String SMTP_SERVER ;
    private  String USERNAME ;
    private  String PASSWORD ;
    private  String PORT;
    private  String SSL;
    private  String EMAIL_FROM;

   Logger logger =LoggerFactory.getLogger(Mailservice.class);



    @Autowired
    private MailProperty props;

    public Mailservice() {

    }

    public Mailservice(String SMTP_SERVER, String USERNAME, String PASSWORD,String EMAIL_FROM,byte[] pdffile) {
        this.SMTP_SERVER = SMTP_SERVER;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.EMAIL_FROM =EMAIL_FROM;
    }
    public void init(){
//        if(System.getProperty("spring.mail.host")==null) {
//            Properties prop = props.readClassProperties();
//            this.SMTP_SERVER = prop.getProperty("spring.mail.host");
//            this.USERNAME = prop.getProperty("spring.mail.username");
//            this.PASSWORD = prop.getProperty("spring.mail.password");
//            this.PORT = prop.getProperty("spring.mail.port");
//            this.EMAIL_FROM = this.USERNAME;
//        }else {
            this.SMTP_SERVER = System.getProperty("spring.mail.host");
            this.USERNAME = System.getProperty("spring.mail.username");
            this.PASSWORD = System.getProperty("spring.mail.password");
            this.PORT = System.getProperty("spring.mail.port");
            this.SSL = System.getProperty("spring.mail.ssl");
            this.EMAIL_FROM = this.USERNAME;
 //       }
    }

    public void setMailserver(CustomProperties props){
        Optional<String> opCP = Optional.of(props.getMailSSL());
        this.SMTP_SERVER = props.getMailHost();
        this.USERNAME = props.getMailUser();
        this.EMAIL_FROM = props.getMailUser();
        this.PASSWORD = props.getMailPass();
        this.PORT = props.getMailPort();
        if (opCP.isPresent())
            this.SSL = props.getMailSSL();
        else
            this.SSL= "false";
    }

    public void sendEmail(String EMAIL_TO,String EMAIL_SUBJECT,String EMAIL_TEXT,String Freightno,byte[] pdf_file){
        Properties prop = System.getProperties();
        prop.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {

            msg.setFrom(new InternetAddress(EMAIL_FROM));

            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(EMAIL_TO, false));

            msg.setSubject(EMAIL_SUBJECT);

            // text
            MimeBodyPart p1 = new MimeBodyPart();
            p1.setText(EMAIL_TEXT);

            // file
            MimeBodyPart p2 = new MimeBodyPart();
            File file = new File(Freightno+".pdf");
            FileUtils.writeByteArrayToFile(file,pdf_file);
            p2.attachFile(file);
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(p1);
            mp.addBodyPart(p2);

            msg.setContent(mp);
            SMTPTransport t = null;

            if (SSL.equalsIgnoreCase("true")) {
                 t = (SMTPTransport) session.getTransport("smtps");
            }else{
                 t = (SMTPTransport) session.getTransport("smtp");
            }



            // connect
            if(PORT !=null)
                t.connect(SMTP_SERVER, Integer.parseInt(PORT),USERNAME, PASSWORD);
            else
                t.connect(SMTP_SERVER,USERNAME, PASSWORD);
            // send
            t.sendMessage(msg, msg.getAllRecipients());

            //System.out.println("Response: " + t.getLastServerResponse());
            logger.info("Response: " + t.getLastServerResponse()+"\nSent to: "+EMAIL_TO);
            t.close();
            file.delete();

        } catch (MessagingException | IOException e) {
            logger.error(e.toString());
        }

    }
}


