package com.hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

 

//@Configuration
//@EnableAutoConfiguration
//@SpringBootApplication
//@ComponentScan("com.hotel") 


//@EnableJpaRepositories(basePackages = { "com.hotel" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class// 指定自己的工厂类
//)


@SpringBootApplication
@RestController  
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}
}
