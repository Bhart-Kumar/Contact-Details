package com.wipro.example.contactdetails;

import java.io.Serializable;

import static android.R.attr.name;

/**
 * Created by Hp on 31-12-2017.
 */
@SuppressWarnings("serial")
public class Contacts implements Serializable{

        public String ContactID;
        public String FirstName;
        public String LastName;
        public String PhoneNumber;
        public String Company;

        public Contacts( String ContactID, String FirstName, String LastName, String PhoneNumber, String Company) {
            this.ContactID = ContactID;
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.PhoneNumber = PhoneNumber;
            this.Company = Company;
        }

}
