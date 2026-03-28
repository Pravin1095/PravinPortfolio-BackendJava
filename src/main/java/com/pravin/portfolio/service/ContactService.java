package com.pravin.portfolio.service;

import com.pravin.portfolio.model.ContactDetailsModel;
import com.pravin.portfolio.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ContactService {

    @Autowired
    ContactRepo repo;

    public void addContact(ContactDetailsModel contactDetails) {
        Random random = new Random();
        int randomId = 100000 + random.nextInt(900000);
        contactDetails.setContactId(randomId);
repo.save(contactDetails);
    }
}
