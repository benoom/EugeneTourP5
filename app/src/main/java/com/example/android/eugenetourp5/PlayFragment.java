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
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<>();

        //Create a list of locations
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        locations.add(new Location(R.drawable.mount_pisgah, getString(R.string.mount_pisgah_name),
                getString(R.string.mount_pisgah_address), getString(R.string.mount_pisgah_phone),
                getString(R.string.mount_pisgah_website), getString(R.string.mount_pisgah_details)));
        locations.add(new Location(R.drawable.spencer_butte, getString(R.string.spencer_butte_name),
                getString(R.string.spencer_butte_address), getString(R.string.spencer_butte_phone),
                getString(R.string.spencer_butte_website), getString(R.string.spencer_butte_details)));
        locations.add(new Location(R.drawable.pres_trail,getString(R.string.pres_trail_name),
                getString(R.string.pres_trail_address), getString(R.string.pres_trail_phone),
                getString(R.string.pres_trail_website), getString(R.string.pres_trail_details)));

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

