package com.example.mymap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng hse = new LatLng(56.317492, 44.067198);
        mMap.addMarker(new MarkerOptions().position(hse).title("Rodionova"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hse));
        LatLng hse1= new LatLng(56.325110, 44.021366);
        mMap.addMarker(new MarkerOptions().position(hse1).title("Pecherskaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hse1));
        LatLng hse2 = new LatLng(56.268496, 43.877779);
        mMap.addMarker(new MarkerOptions().position(hse2).title("Lvovskaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hse2));
        LatLng hse3 = new LatLng(56.335026, 43.888092);
        mMap.addMarker(new MarkerOptions().position(hse3).title("Sormovo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hse3));

    }
}
