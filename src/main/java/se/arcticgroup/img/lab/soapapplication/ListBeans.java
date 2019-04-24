package se.arcticgroup.img.lab.soapapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class ListBeans {
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }

    }
}
