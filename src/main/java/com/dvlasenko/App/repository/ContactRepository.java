package com.dvlasenko.App.repository;

import com.dvlasenko.App.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findByEmail(String email);
}
