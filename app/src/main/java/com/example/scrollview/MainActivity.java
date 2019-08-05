package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplayText = findViewById(R.id.tv_display_text);

        StringBuilder stringBuilder = new StringBuilder();

        String message = "This is a message I am writing to append";

        for (int i = 0; i < 300; i++){

            stringBuilder.append(message);
        }
        tvDisplayText.setText(stringBuilder.toString());
    }
}
