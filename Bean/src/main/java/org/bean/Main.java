package org.bean;

import org.bean.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vodafone sim1=new Vodafone("235782438");
        sim1.call();
        sim1.data();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vodafone sim2=context.getBean(Vodafone.class);
        sim2.call();
        sim2.data();
    }
}