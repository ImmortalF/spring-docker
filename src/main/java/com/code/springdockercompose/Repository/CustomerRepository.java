package com.code.springdockercompose.Repository;

import com.code.springdockercompose.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
