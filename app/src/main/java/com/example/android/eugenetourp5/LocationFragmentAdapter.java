package com.example.android.eugenetourp5;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LocationFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    LocationFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * @param position of fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StayFragment();
        } else if (position == 1) {
            return new PlayFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new ArtsFragment();
        }
    }

    /**
     * @param position of fragment
     * @return page title
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_stay);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_play);
        } else if (position == 2) {
            return mContext.getString(R.string.fragment_eat);
        } else {
            return mContext.getString(R.string.fragment_arts);
        }
    }

    /**
     * @return number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }
}
