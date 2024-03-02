package org.example.server.entity;

public class Contact {
    private final Integer id;
    private final String name;
    private final String phone;

    public Contact(Integer id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", " + this.getName() +
                ", phone: " + this.getPhone() + "\n";
    }
}
