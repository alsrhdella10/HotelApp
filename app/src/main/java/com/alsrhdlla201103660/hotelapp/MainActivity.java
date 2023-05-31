package com.alsrhdlla201103660.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://www.pegipegi.com/travel/wp-content/uploads/2020/10/10-hotel-dekat-pantai-selatan-Jawa.png";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}