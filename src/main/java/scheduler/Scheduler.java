package scheduler;

import PropertiesHandlers.PropertiesHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Date;

@Configuration
@EnableScheduling
public class Scheduler {
    static final String PARSER_URL = "http://localhost:8082/parse_all";
    static final String CRON_EXP = "0 0 3 * * ?";

//https://dzone.com/articles/schedulers-in-java-and-spring
    @Scheduled(cron = CRON_EXP)
    public void parserScheduler(){
        //parseSelected();
        System.out.println("Now: " + new Date());
    }
// для тестирования
 //   @Scheduled(fixedRate = 6000)
    public void testScheduler(){
        //parseSelected("https://www.afisha.ru");
        System.out.println("Now: " + new Date());
    }





}


