package cm.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("cm.spring.noxml")
public class SpringConfiguration {

    @Bean
    public Master myMaster(){
        return new MasterImpl(mySport());
    }

    @Bean
    public Sport mySport(){
        return new Football();
    }
}
