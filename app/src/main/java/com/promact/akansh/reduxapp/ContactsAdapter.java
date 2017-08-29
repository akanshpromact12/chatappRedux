package com.promact.akansh.reduxapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Akansh on 29-08-2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    private List<ContactsBean> contacts;
    private Context context;

    ContactsAdapter(List<ContactsBean> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @Override
    public ContactsAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_contact, null);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);

        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactsAdapter.ContactViewHolder holder, int position) {
        ContactsBean contactsBean = contacts.get(position);
        holder.contactName.setText(contactsBean.getContactName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        CircleImageView contactImage;
        TextView contactName;

        public ContactViewHolder(View itemView) {
            super(itemView);

            contactImage = (CircleImageView) itemView.findViewById(R.id.contact_image);
            contactName = (TextView) itemView.findViewById(R.id.contact_name);
        }
    }
}
