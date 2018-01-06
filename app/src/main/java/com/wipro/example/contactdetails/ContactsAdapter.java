package com.wipro.example.contactdetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by Hp on 31-12-2017.
 */

public class ContactsAdapter extends ArrayAdapter<Contacts> {
    public ContactsAdapter(Context context, ArrayList<Contacts> contacts){
        super(context,0,contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Contacts contact = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact_list, parent, false);
        }
        TextView firstName = (TextView) convertView.findViewById(R.id.firstName);
        TextView contactID = (TextView) convertView.findViewById(R.id.contactId);
        firstName.setText(contact.FirstName);
        contactID.setText(contact.ContactID);
        return convertView;
    }
}
