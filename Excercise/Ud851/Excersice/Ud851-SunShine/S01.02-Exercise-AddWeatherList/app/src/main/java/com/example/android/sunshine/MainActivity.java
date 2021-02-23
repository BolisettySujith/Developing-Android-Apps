/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
private TextView mWeatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView=(TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] WetherData = {
                "Today, Tenali - Feb 21 - Cloudy - 19C / 15C",
                "Tomorrow, Tenali -  Feb 22 - Rainy - 20C / 15C",
                "Monday, Tenali -Feb 23 -  Partly Cloudy - 15°C / 10°C",
                "Tue, Tenali -  Feb 24 - Meatballs - 16°C / 18°C",
                "Wed, Tenali -  Feb 25 - Cloudy - 19°C / 15°C",
                "Thu, Tenali -  Feb 26 - Stormy - 30°C / 11°C",
                "Fri, Tenali -  Feb 27 - Hurricane - 21°C / 9°C",
                "Sat, Tenali -  Feb 28 - Meteors - 16°C / 7°C",
                "Sun, Tenali -  Feb 29 - Apocalypse - 16°C / 8°C",
                "Mon, Tenali -  Feb 30 - Post Apocalypse - 15°C / 10°C"
        };
        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String WetherDay : WetherData)
        {
            mWeatherTextView.append(WetherDay + "\n\n\n");
        }
    }
}