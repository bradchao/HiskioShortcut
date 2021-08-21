package com.bradchao.hiskioshortcut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

        Intent intentS1 = new Intent(this, Lottery1Activity.class);
        intentS1.setAction(Intent.ACTION_VIEW);
        ShortcutInfo shortcutInfo1 = new ShortcutInfo.Builder(this, "id1")
                .setShortLabel("大樂透")
                .setLongLabel("大樂透中大獎")
                .setIcon(Icon.createWithResource(this, R.drawable.lottery1))
                .setIntent(intentS1)
                .setRank(1)
                .build();

        Intent intentS2 = new Intent(this, Lottery2Activity.class);
        intentS2.setAction(Intent.ACTION_VIEW);
        ShortcutInfo shortcutInfo2 = new ShortcutInfo.Builder(this, "id2")
                .setShortLabel("威力彩")
                .setLongLabel("威力彩中大獎")
                .setIcon(Icon.createWithResource(this, R.drawable.lottery2))
                .setIntent(intentS2)
                .setRank(5)
                .build();

        Intent intentS3 = new Intent(this, LuckyActivity.class);
        int luckyNumber = (int)(Math.random()*10);
        intentS3.putExtra("luckyNumber", luckyNumber);
        intentS3.setAction(Intent.ACTION_VIEW);
        ShortcutInfo shortcutInfo3 = new ShortcutInfo.Builder(this, "id3")
                .setShortLabel("幸運號")
                .setLongLabel("幸運號:" + luckyNumber)
                .setIcon(Icon.createWithResource(this, R.drawable.icon2))
                .setIntent(intentS3)
                .build();


        shortcutManager.setDynamicShortcuts(Arrays.asList(shortcutInfo1, shortcutInfo2, shortcutInfo3));
    }

    public void gotoLottery1(View view) {
        Intent intent = new Intent(this, Lottery1Activity.class);
        startActivity(intent);
    }

    public void gotoLottery2(View view) {
        Intent intent = new Intent(this, Lottery2Activity.class);
        startActivity(intent);
    }
}