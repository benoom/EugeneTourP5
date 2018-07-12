package com.example.android.eugenetourp5;

//Location represents a place that the user might want to visit. It contains an image, name,
//address, link to the website and some details
public class Location {

    //image for the location
    private int mImageResourceId;

    //name of the location
    private String mName;

    //address of the location
    private String mAddress;

    //phone number for the location
    private String mPhone;

    //web address/hyperlink for the location
    private String mWebsite;

    //short description of the location
    private String mDetails;

    /**
     *Create a new Location object.
     *
     * @param imageResourceId an image representing the location the user is viewing
     *
     * @param name is the name of the location the user is viewing
     *
     * @param address is the address of the location the user is
     *
     * @param phone is the phone number of the location
     *
     * @param website is the website address of the location the user is viewing
     *
     * @param details is a short description of the location the user is viewing
     */
    public Location(int imageResourceId, String name, String address, String phone, String website,
                    String details) {
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mPhone = phone;
        mWebsite = website;
        mDetails = details;
    }

    //Get the image resource id for the location
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get the name of the location
    public String getName() {
        return mName;
    }

    //Get the address for the location
    public String getAddress() {
        return mAddress;
    }

    //Get the phone number for the location
    public String getPhone(){return mPhone;}

    //Get the website for the location
    public String getWebsite() {
        return mWebsite;
    }

    //Get the details for the location
    public String getDetails() {
        return mDetails;
    }
}
