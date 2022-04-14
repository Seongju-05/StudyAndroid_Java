package com.hs.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String[] items = {"망고 주스", "토마토 주스", "딸기 주스"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listButton = (Button) findViewById(R.id.listButton);
    }
}