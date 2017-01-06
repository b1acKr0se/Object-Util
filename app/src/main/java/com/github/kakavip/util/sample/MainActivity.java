package com.github.kakavip.util.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.kakavip.util.ObjectUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check Null
        // Before
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            // Do something
        }

        // After
        if (!ObjectUtil.isNull(intent, intent.getExtras())) {
            // Do something
        }

        // Or
        if (ObjectUtil.nonNull(intent, intent.getExtras())) {
            // Do something
        }


        // To String
        String a = "a";
        Object obj = null;

        // Before
        Log.d("MainActivity",
            "A -> " + (a != null ? a.toString() : "null") + "\n"
                + "obj -> " + (obj != null ? obj.toString() : "null")
        );

        // After
        Log.d("MainActivity", ObjectUtil.toString(a, obj, null));


        // Check empty
        String b = "a";
        String c = "";
        String d = null;
        Log.d("MainActivity", "Have string emptry ? " + ObjectUtil.isEmpty(a, c, d));

    }
}
