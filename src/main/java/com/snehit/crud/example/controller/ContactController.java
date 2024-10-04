package com.snehit.crud.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snehit.crud.example.entity.contact;
import com.snehit.crud.example.service.ContactService;

@RequestMapping("/contact")
@RestController
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/add")
    ResponseEntity<contact> addContact(@RequestBody contact contact) {
        this.contactService.setUserContact(contact);
        return ResponseEntity.ok(contact);
    }

    @GetMapping("/get")
    List<contact> getContacts() {
        return this.contactService.getUsersContact();
    }

    @GetMapping("/delete")
    ResponseEntity<String> getContacts(@RequestParam String name) {
        this.contactService.deleteContact(name);
        return ResponseEntity.ok(name);
    }

}
