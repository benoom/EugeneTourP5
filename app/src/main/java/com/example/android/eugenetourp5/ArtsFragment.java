package com.example.android.eugenetourp5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtsFragment extends Fragment {

    public ArtsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.hult_center, getString(R.string.hult_center_name),
                getString(R.string.hult_center_address), getString(R.string.hult_center_phone),
                getString(R.string.hult_center_website), getString(R.string.hult_center_details)));
        locations.add(new Location(R.drawable.the_shedd, getString(R.string.the_shedd_name),
                getString(R.string.the_shedd_address), getString(R.string.the_shedd_phone),
                getString(R.string.the_shedd_website), getString(R.string.the_shedd_details)));
        locations.add(new Location(R.drawable.museum_natural_history, getString(R.string.museum_name),
                getString(R.string.museum_address), getString(R.string.museum_phone),
                getString(R.string.museum_website), getString(R.string.museum_description)));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}

