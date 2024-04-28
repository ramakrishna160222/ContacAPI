package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

	Contact findByName(String name);

	Contact findByMobile(Long mobile);

}
