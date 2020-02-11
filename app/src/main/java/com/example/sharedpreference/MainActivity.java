package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sharedpreference.Model.UserEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataProvider dataProvider = new DataProvider();
        UserEntity user = dataProvider.getUser();

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle args = new Bundle();
        args.putSerializable(SecondActivity.INTENT_KEY,user);
        intent.putExtras(args);
        startActivity(intent);
    }
}
