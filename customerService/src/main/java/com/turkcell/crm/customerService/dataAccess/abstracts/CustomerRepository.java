package com.turkcell.crm.customerService.dataAccess.abstracts;

import com.turkcell.crm.customerService.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
