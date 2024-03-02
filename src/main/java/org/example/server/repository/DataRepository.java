package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.List;
import java.util.ArrayList;

public class DataRepository {
    public List<Contact> fetchData() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "Denis", "333 2222-211"));
        contacts.add(new Contact(2, "Anna", "777 1233-121"));
        contacts.add(new Contact(3, "Tom", "213 1234-566"));
        return contacts;
    }

}
