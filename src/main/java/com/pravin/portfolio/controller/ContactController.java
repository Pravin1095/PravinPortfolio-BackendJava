package com.pravin.portfolio.controller;


import com.pravin.portfolio.model.ContactDetailsModel;
import com.pravin.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContactController {

    @Autowired
    ContactService service;

    @PostMapping(path = "contact", consumes={"application/json"})
    public String addContact(@RequestBody ContactDetailsModel contactDetails){
service.addContact(contactDetails);
return "Success";
    }
}
