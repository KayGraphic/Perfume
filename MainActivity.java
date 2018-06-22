package com.example.android.rentalproperties;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Property;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<PerfumeClass> perfume = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perfume.add(
                new PerfumeClass("Summer Collection", "dry, smoky, warm", 12,"Caledonia","c1",175.50));
        perfume.add(
                new PerfumeClass("Summer Collection", "vanilla, tonka bean, flowers and herb", 12,"Anhedonia","c2",123.50));
        perfume.add(
                new PerfumeClass("Summer Collection", "citrus top note and a mossy base", 12,"Sadhedonia","c3",134.50));
        perfume.add(
                new PerfumeClass("Summer Collection", "woodsy, with floral notes", 12,"Boohedonia","c4",163.50));
        perfume.add(
                new PerfumeClass("Summer Collection", " exotic, spicy and dark, musky ", 12,"Jamhedonia","c5",151.50));
    }
}


//https://www.sitepoint.com/custom-data-layouts-with-your-own-android-arrayadapter/