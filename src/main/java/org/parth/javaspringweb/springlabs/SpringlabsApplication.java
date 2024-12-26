package org.parth.javaspringweb.springlabs;

import org.parth.javaspringweb.springlabs.services.FileOps.FileIterationServices;
import org.parth.javaspringweb.springlabs.services.PropertyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class SpringlabsApplication {

    @Autowired
    FileIterationServices fileIterationServices;

    public static void main(String[] args) {
        Class<SpringlabsApplication> cfg = SpringlabsApplication.class;
        try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(cfg)) {
            var propertyserv = ctx.getBean("PropertyServices", PropertyServices.class);
            var propertyServices1 = (PropertyServices) ctx.getBean("thisbean");

            System.out.println(propertyserv.getTotalThreads());
            System.out.println(propertyServices1.getTotalThreads());

            //assert propertyserv.equals(ctx) : "Objects are not equal";
            assert propertyserv.hashCode() != propertyServices1.hashCode();
            assert propertyserv.getTotalThreads() == propertyServices1.getTotalThreads();
            assert propertyserv != propertyServices1;
            if (propertyserv.hashCode() == propertyServices1.hashCode()) {
                System.out.println("Both are same instance");
            }
            System.out.println(propertyserv.hashCode());
            System.out.println(propertyServices1.hashCode());
        }
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
