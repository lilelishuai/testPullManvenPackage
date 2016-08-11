package com.simen.mavenpackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simen.localrepo.MainAcitivy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = MainAcitivy.username;



    }
}
