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
public class StayFragment extends Fragment {

    public StayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Location> locations = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create a list of locations
        locations.add(new Location(R.drawable.valley_river_inn, getString(R.string.valley_river_name),
                getString(R.string.valley_river_address), getString(R.string.valley_river_phone),
                getString(R.string.valley_river_website), getString(R.string.valley_river_details)));
        locations.add(new Location(R.drawable.inn_at_fifth, getString(R.string.inn_at_5th_name),
                getString(R.string.inn_at_5th_address), getString(R.string.inn_at_5th_phone),
                getString(R.string.inn_at_5th_website), getString(R.string.inn_at_5th_details)));
        locations.add(new Location(R.drawable.campbell_house_inn,
                getString(R.string.campbell_house_name), getString(R.string.campbell_house_address),
                getString(R.string.campbell_house_phone), getString(R.string.campbell_house_website),
                getString(R.string.campbell_house_details)));

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

