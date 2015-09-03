package com.josephmakokha.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
    }
        @Override
         public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            String[] data = {
                    "Mon 8/30 - Sunny - 63/78",
                    "Tue 9/1 - Foggy - 60/68",
                    "Wed 9/2 - Rainy - 67/72",
                    "Thur 9/3 - Foggy - 55/67",
                    "Fri 9/4 - Sunny - 69/88",
                    "Sat 9/5 - Trapped in Weatherstation - 48/58",
                    "Sun 9/6 - Foggy - 79/84",
            };

            List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
}
