package com.example.backroundlocationoreo.utilities;

public class Constants {

    public static final long UPDATE_INTERVAL = 10 * 1000;

    /**
     * The fastest rate for active location updates. Updates will never be more frequent
     * than this value, but they may be less frequent.
     */
    public static final long FASTEST_UPDATE_INTERVAL = UPDATE_INTERVAL / 2;

    /**
     * The max time before batched results are delivered by location services. Results may be
     * delivered sooner than this interval.
     */
    public static final long MAX_WAIT_TIME = UPDATE_INTERVAL * 3;
	
	
	
}
