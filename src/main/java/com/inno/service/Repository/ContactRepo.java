package com.inno.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inno.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
	

}
