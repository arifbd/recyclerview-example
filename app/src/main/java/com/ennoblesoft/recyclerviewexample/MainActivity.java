package com.ennoblesoft.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvContact;
    ContactAdapter adapter;
    List<Contact> contactList;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateContactList();
        rvContact = findViewById(R.id.rvContact);
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        adapter = new ContactAdapter(this, contactList);
        rvContact.setLayoutManager(layoutManager);
        rvContact.setAdapter(adapter);
    }

    private void populateContactList() {
        contactList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Contact contact = new Contact("A" + i, "016854204" + ((i < 10) ? "0" + i : i));
            contactList.add(contact);
        }
    }
}
