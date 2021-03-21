package se.fraktservice.freightbill.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Configuration
//@ComponentScan
@Component
public class MailProperty {

    public MailProperty() {
    }

    @Bean
    public void setupMainMailServer(){
        if(System.getenv("MAIL_HOST") != null) {
            System.setProperty("spring.mail.host",System.getenv("MAIL_HOST"));
            System.setProperty("spring.mail.port",System.getenv("MAIL_PORT"));
            System.setProperty("spring.mail.username",System.getenv("MAIL_USER"));
            System.setProperty("spring.mail.password",System.getenv("MAIL_PASS"));
            System.setProperty("spring.mail.ssl",System.getenv("MAIL_SSL"));
        }
    }

    @Bean
    @Primary
    public Properties readClassProperties(){
        Properties prop =new Properties();
        try {
            Resource resource = new ClassPathResource("application.properties");
            prop.load(resource.getInputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
