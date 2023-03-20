package com.example.cardpokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Bulbasaur = findViewById(R.id.Bulbasaur);
        ImageView charman = findViewById(R.id.Charmander);

        Bulbasaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.image1);
                intent.putExtra("imageUri", imageUri);
                String desc = "Height : 2' 04 / Weight : 15.2 / Category : Seed";
                intent.putExtra("desc",desc);
                startActivity(intent);

            }
        });

        charman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.image2);
                intent.putExtra("imageUri2", imageUri);
                String desc = "Height : 2' 00 / Weight : 18.7 / Category : Lizard";
                intent.putExtra("desc",desc);
                startActivity(intent);
            }
        });

        ImageView edit3 = findViewById(R.id.tortle);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Uri imageUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.image3);
                intent.putExtra("imageUri3", imageUri);
                String desc = "Height : 3' 03 / Weight : 49.6 / Category : Turtle";
                intent.putExtra("desc",desc);
                startActivity(intent);
            }
        });




    }
}