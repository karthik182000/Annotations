package org.bean.config;

import org.bean.Vodafone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    Vodafone vodafone(){
        Vodafone vodafone=new Vodafone("78437587");
        return vodafone;

    }
    @Primary
    @Bean
     Vodafone vodafone1() {
        Vodafone vodafone = new Vodafone("123456");
        return vodafone;
    }
}
