package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contact
    List<Contact> contacts = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 1311L),
            new Contact(2L, "anil@gmail.com", "Anil", 1311L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1313L),
            new Contact(5L, "ravi@gmail.com", "Rai", 1315L),
            new Contact(6L, "veer@gmail.com", "Veer", 1314L),
            new Contact(7L, "aman@gmail.com", "Aman", 1315L),
            new Contact(8L, "ankit@gmail.com", "Ankit", 1311L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
