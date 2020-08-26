package com.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository ("customerDS")
public interface CustomerRepository
        extends CrudRepository<Customer, Long> {
}