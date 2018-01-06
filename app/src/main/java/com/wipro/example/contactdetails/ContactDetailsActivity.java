package com.wipro.example.contactdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ContactDetailsActivity extends AppCompatActivity {
    TextView name , phoneNumber , company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
      Contacts contact = (Contacts)getIntent().getSerializableExtra("contact");
        name = (TextView) findViewById(R.id.displayName);
        phoneNumber = (TextView) findViewById(R.id.email);
        company = (TextView) findViewById(R.id.companyName);
        name.setText(contact.FirstName);
        phoneNumber.setText(contact.PhoneNumber);
        company.setText(contact.Company);
    }
}
