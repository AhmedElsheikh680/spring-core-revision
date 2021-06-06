package cm.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("cm.spring.noxml")
public class SpringConfiguration {

//    @Bean
//    public Master myMaster(){
//        return new MasterImpl(mySport());
//    }
//
//    @Bean
//    public Sport mySport(){
//        return new Football();
//    }
}
