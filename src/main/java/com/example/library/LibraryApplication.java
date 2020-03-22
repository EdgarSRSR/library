package com.example.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LibraryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}

/*
@Component
class  EmployeesLister implements ApplicationRunner{

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final EmployeesRepository employees;

    EmployeesLister(EmployeesRepository employees){
        this.employees = employees;
    }

    @Override
    public  void  run(ApplicationArguments args){
        employees.findAll().forEach(employees -> logger.info("{}", employees));

    }

}*/
