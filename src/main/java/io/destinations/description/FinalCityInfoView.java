package io.destinations.description;

import java.util.ArrayList;


interface FinalCityInfoView {
    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void showProgress();

    void parseResult(String iconUrl,
                     int code,
                     String temp,
                     String humidity,
                     String weatherInfo);

    void parseInfoResult(String latitude,
                         String longitude,
                         Boolean isCityVisited,
                         ArrayList<String> imagesArray);

    void networkError();
}
