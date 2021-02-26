package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;
    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType)
    {
        Context context = viewGroup.getContext();
        int layoutIdForListItems = R.layout.forecat_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean ShouldAttachToParentImmedietly = false;

        View view = inflater.inflate(layoutIdForListItems, viewGroup, ShouldAttachToParentImmedietly);

        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position)
    {
        String weatherForThisDay = mWeatherData[position];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null){
            return 0;
        }
        return mWeatherData.length;
    }


    // TODO (18) Create a public final TextView variable called mWeatherTextView
    // TODO (19) Create a constructor for this class that accepts a View as a parameter
    // TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
    // TODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);

        }
    }

    public void setWeatherData(String[] weatherData){
        mWeatherData =weatherData;
        notifyDataSetChanged();
    }
}