package com.ox.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ox.bank.entity.Officer;

public interface OfficerRepository extends JpaRepository<Officer, Long> {

	
}
