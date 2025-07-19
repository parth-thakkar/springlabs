package org.parth.javaspringweb.springlabs;

import org.parth.javaspringweb.springlabs.services.PropertyServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringlabsApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringlabsApplication.class, args);
        var propertyserv = ctx.getBean("PropertyServices", PropertyServices.class);
        var propertyServices1 = (PropertyServices) ctx.getBean("thisbean");

        System.out.println(propertyserv.getTotalThreads());
        System.out.println(propertyServices1.getTotalThreads());

        assert propertyserv.hashCode() != propertyServices1.hashCode();
        assert propertyserv.getTotalThreads() == propertyServices1.getTotalThreads();
        assert propertyserv != propertyServices1;
        if (propertyserv.hashCode() == propertyServices1.hashCode()) {
            System.out.println("Both are same instance");
        }
        System.out.println(propertyserv.hashCode());
        System.out.println(propertyServices1.hashCode());
    }

    @Bean(name = "thisbean")
    public PropertyServices getPropertyServices() {
        return new PropertyServices();
    }
    
    /*@Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            
            System.out.println("This is commandLine runner");
            System.out.println(ctx.getBeanDefinitionCount());
            System.out.println(ctx.getBeanDefinitionNames());
            Arrays.asList(ctx.getBeanDefinitionNames()).stream().forEach(System.out::println);
        };
    }*/


}
