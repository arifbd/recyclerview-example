package com.ennoblesoft.recyclerviewexample;

class Contact {

    private String name;
    private String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }
}
