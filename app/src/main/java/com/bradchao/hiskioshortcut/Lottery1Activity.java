package com.bradchao.hiskioshortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lottery1Activity extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery1);

        result = findViewById(R.id.lottery1_result);
        result.setText(createLottery1());
    }

    private String createLottery1(){
        TreeSet<Integer> lottery = new TreeSet<>();
        while (lottery.size() < 6){
            lottery.add((int)(Math.random()*49)+1);
        }
        return lottery.toString();
    }

}