package se.fraktservice.freightbill.Services;

import org.springframework.stereotype.Service;
import se.fraktservice.freightbill.Models.CustomProperties;

@Service
public class KeyCheckService {

    public boolean keyEvaluator(CustomProperties key){
        return System.getenv("API_KEY").equals(key.getApiKey());
    }
}
