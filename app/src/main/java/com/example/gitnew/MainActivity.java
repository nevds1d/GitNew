package com.example.gitnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public static int multi() {
        int mul = 5 * 5;
        return mul;
    }

    public static int div() {
        int div = 4 / 2;
        return div;
    }
}