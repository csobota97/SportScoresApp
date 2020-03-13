package com.android.sportsscores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button mNcaaFootballButton;
    private Button mNcaaBasketballButton;
    private Button mNcaaBaseballButton;
    private Button mMlbButton;
    private Button mNbaButton;
    private Button mNflButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNcaaFootballButton = (Button) findViewById(R.id.football);
        mNcaaFootballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NCAA Football Button
            }
        });

        mNcaaBasketballButton = (Button) findViewById(R.id.basketball);
        mNcaaBasketballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NCAA Basketball Button
                Intent intent = new Intent(MainActivity.this, NCAABasketballActivity.class);
                startActivity(intent);
            }
        });

        mNcaaBaseballButton = (Button) findViewById(R.id.baseball);
        mNcaaBaseballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NCAA Baseball Button
                Intent intent = new Intent(MainActivity.this, NCAABaseballActivity.class);
                startActivity(intent);
            }
        });

        mMlbButton = (Button) findViewById(R.id.mlb);
        mMlbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MLB Button
                Intent intent = new Intent(MainActivity.this, MLBActivity.class);
                startActivity(intent);
            }
        });

        mNbaButton = (Button) findViewById(R.id.nba);
        mNbaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NBA Button
                Intent intent = new Intent(MainActivity.this, NBAActivity.class);
                startActivity(intent);
            }
        });

        mNflButton = (Button) findViewById(R.id.nfl);
        mNflButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NFL Button
                Intent intent = new Intent(MainActivity.this, NFLActivity.class);
                startActivity(intent);
            }
        });
    }
}
