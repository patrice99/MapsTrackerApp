package com.example.mapdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomWindowAdapter implements GoogleMap.InfoWindowAdapter {
    LayoutInflater mInflater;

    //constructor
    public CustomWindowAdapter(LayoutInflater i){
        mInflater = i;
    }


    //This defines the contents within the info window based on the marker
    @Override
    public View getInfoContents(Marker marker) {
        //Getting the view from the layout file
        View view = mInflater.inflate(R.layout.custom_info_window, null);

        //Populate fields
        TextView title = (TextView) view.findViewById(R.id.tv_info_window_title);
        title.setText(marker.getTitle());

        TextView description = (TextView) view.findViewById(R.id.tv_info_window_description);
        description.setText(marker.getSnippet());

        //Return info window contents
        return view;
    }

    //This changes the frame of the info window, returning null uses the default frame
    //This is just the border and arrow surrounding the contents specified above
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
}
