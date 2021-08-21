package com.bradchao.hiskioshortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LuckyActivity extends AppCompatActivity {
    private TextView luckyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);

        int luckyNumber = getIntent().getIntExtra("luckyNumber", -1);
        luckyText = findViewById(R.id.luckyNumber);
        luckyText.setText("" + luckyNumber);
    }
}