package com.example.backroundlocationoreo.location;

import android.content.Context;
import android.location.Location;
import android.preference.PreferenceManager;

import com.example.backroundlocationoreo.R;

import java.util.List;


public class LocationResultHelper {

    public final static String KEY_LOCATION_UPDATES_RESULT = "location_result";


    private Context mContext;
    private List<Location> mLocations;

    public LocationResultHelper(Context context, List<Location> locations) {
        mContext = context;
        mLocations = locations;
    }


    private String getLocationResultText() {
        if (mLocations.isEmpty()) {
            return mContext.getString(R.string.unknown_location);
        }
        StringBuilder sb = new StringBuilder();
        if (mLocations.size() >= 1){
            sb.append(mLocations.get(0).getLatitude());
            sb.append(",");
            sb.append(mLocations.get(0).getLongitude());
        }
        return sb.toString();
    }

    public void saveResults() {
        PreferenceManager.getDefaultSharedPreferences(mContext)
                .edit()
                .putString(KEY_LOCATION_UPDATES_RESULT, getLocationResultText())
                .apply();
    }

    public static String getSavedLocationResult(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(KEY_LOCATION_UPDATES_RESULT, "");
    }
}
