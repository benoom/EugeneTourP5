package com.example.android.eugenetourp5;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the currentLocation object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the ImageView in the list_item.xml layout file with the ID image
        //Display the provided image based on the resource ID
        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentLocation.getImageResourceId());

        //Find the TextView in the list_item.xml layout file with the ID name
        //Set this text on the name TextView
        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentLocation.getName());

        //Find the TextView in the list_item.xml layout file with the ID address
        //Set this text on the address TextView
        TextView address = listItemView.findViewById(R.id.address);
        address.setText(currentLocation.getAddress());

        //Find the Textview in the list_item.xml layout file with the ID phone
        //Set this text on the phone Textview
        TextView phone = listItemView.findViewById(R.id.phone);
        phone.setText(currentLocation.getPhone());

        //Find the TextView in the list_item.xml layout file with the iD website
        //Set this text on the website TextView
        TextView website = listItemView.findViewById(R.id.website);
        website.setText(currentLocation.getWebsite());

        //Find the TextView in the list_item.xml layout file with the iD details
        //Set this text on the details TextView
        TextView details = listItemView.findViewById(R.id.details);
        details.setText(currentLocation.getDetails());

        return listItemView;
    }
}

