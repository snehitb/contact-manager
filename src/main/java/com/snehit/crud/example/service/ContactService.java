package com.snehit.crud.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.snehit.crud.example.entity.contact;
import com.snehit.crud.example.entity.user;
import com.snehit.crud.example.repository.userRepo;

public class ContactService {
    private final userRepo userRepository;


    //looking database again and again would be costly for 
    private user contactCache;


    public ContactService(userRepo userRepo) {
        this.userRepository = userRepo;
    }

    public List<contact> getUsersContact() {
        if (contactCache == null)
            contactCache = setCache();
        return contactCache.getContacts();
    }

    public void setUserContact(contact contact) {
        if (contactCache == null)
            contactCache = setCache();
        contactCache.getContacts().add(contact);
        userRepository.save(contactCache);
    }

    public void deleteContact(String contactName) {
        contactCache.getContacts().removeIf(contact -> contact.getContactName().equalsIgnoreCase(contactName));
        userRepository.save(contactCache);
    }

    public user setCache() {
        String username = getUsername();
        Optional<user> user = this.userRepository.findByEmail(username);
        if (user.get() == null)
            throw new IllegalStateException("User not found with email: " + username);
        return user.get();
    }

    String getUsername() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            Object principal = authentication.getPrincipal();
            return ((UserDetails) principal).getUsername(); // This will return the username
        }

        return null;
    }
}
