package com.dvlasenko.App.service;

import com.dvlasenko.App.dto.ContactDto;
import com.dvlasenko.App.entity.Contact;

import java.util.List;

public interface ContactService {
    void saveContact(ContactDto contactDto);

    Contact findByEmail(String email);

    List<ContactDto> findAllContacts();
}
