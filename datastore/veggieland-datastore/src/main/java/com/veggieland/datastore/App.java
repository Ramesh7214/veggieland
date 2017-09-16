package com.veggieland.datastore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.veggieland.datasource.service.UserService;
import com.veggieland.datastore.config.DatabaseConfig;
import com.veggieland.datastore.model.User;


/**
 * Hello world!
 *
 */
public class App 
{
	
	/*
	 * JUnit not yet implemented
	 * just for local testing
	 */
	
    public static void main( String[] args ) {
    AnnotationConfigApplicationContext context = 
    new AnnotationConfigApplicationContext(DatabaseConfig.class);
    
    User user = new User();
    user.setEmilId("ramesh7214@gmail.com");
    user.setFirstName("Ramesh");
    user.setLastName("Gadenaboina");
    user.setPassword("ramesh");
    user.setPhoneNumber("9291247623");
    user.setStatus("1");
    user.setUerType("1");
    user.setUserName("ramesh");

    UserService employeeService = context.getBean(UserService.class);
    System.out.println(employeeService.createUser(user));
    
    }
}
