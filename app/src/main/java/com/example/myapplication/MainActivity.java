package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        BlankFragment1 fragment1 = new BlankFragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment1);
        ft.commit();
    }

    public void onClick2(View view) {
        BlankFragment2 fragment2 = new BlankFragment2();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment2);
        ft.commit();
    }

    public void onClick3(View view) {
        BlankFragment3 fragment3 = new BlankFragment3();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment3);
        ft.commit();
    }

    public void onClick4(View view) {
        BlankFragment4 fragment4 = new BlankFragment4();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment4);
        ft.commit();
    }
}