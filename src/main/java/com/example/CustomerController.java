package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Controller("/customer")
public class CustomerController {

    @Inject
    CustomerRepository customerRepository;

    @Get("/")
    public Iterable<Customer> index() {
        return customerRepository.findAll() ;
    }

    @PostConstruct
    public void postSample() {
        customerRepository.save(new Customer("hello", "world"));
        customerRepository.save(new Customer("john", "bull"));
    }

    @Post("/")
    public Customer create(Customer customer) {
        return customerRepository.save(customer) ;
    }
}
