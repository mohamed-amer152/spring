package com.luv2code.springdemo.springjpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springdemo.springjpademo.entiy.Customer;

public interface customerrepository extends JpaRepository<Customer, Integer> {

}
