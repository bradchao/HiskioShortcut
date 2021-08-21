package com.bradchao.hiskioshortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.TreeSet;

public class Lottery2Activity extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery2);

        result = findViewById(R.id.lottery2_result);
        result.setText(createLottery2());
    }

    private String createLottery2() {
        TreeSet<Integer> lottery1 = new TreeSet<>();
        while (lottery1.size() < 6){
            lottery1.add((int)(Math.random()*38)+1);
        }

        int lottery2 = (int)(Math.random()*8+1);
        return  lottery1.toString() + "特別號:" + lottery2;
    }
}