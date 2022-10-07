package com.code.springdockercompose;

import com.code.springdockercompose.Entity.Customer;
import com.code.springdockercompose.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringDockerComposeApplication {

    public static Logger logger = Logger.getGlobal();

    @Autowired
    private CustomerRepository customerRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringDockerComposeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup(){
        List allCustomers = this.customerRepository.findAll();
        logger.info("Number of customers: "+ allCustomers.size());

        Customer customer = new Customer("John", "Doe");
        logger.info("Saving new customer");
        this.customerRepository.save(customer);

        allCustomers = this.customerRepository.findAll();
        logger.info("Number of customers: "+ allCustomers.size());



    }
}
