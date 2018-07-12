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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        locations.add(new Location(R.drawable.the_bier_stein, getString(R.string.bier_stein_name),
                getString(R.string.bier_stein_address), getString(R.string.bier_stein_phone),
                getString(R.string.bier_stein_website), getString(R.string.bier_stein_details)));
        locations.add(new Location(R.drawable.cafe_440, getString(R.string.cafe_440_name),
                getString(R.string.cafe_440_address), getString(R.string.cafe_440_phone),
                getString(R.string.cafe_440_website), getString(R.string.cafe_440_details)));
        locations.add(new Location(R.drawable.beppe_and_giannis, getString(R.string.beppe_name),
                getString(R.string.beppe_address), getString(R.string.beppe_phone),
                getString(R.string.beppe_website), getString(R.string.beppe_detail)));

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

