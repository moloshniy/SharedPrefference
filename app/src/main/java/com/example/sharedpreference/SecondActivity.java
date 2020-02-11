package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sharedpreference.Model.UserEntity;

public class SecondActivity extends AppCompatActivity {
    public static final String INTENT_KEY = "INTENT_KEY";

    private TextView ageTextView;
    private TextView nameTextView;
    private TextView emailTextView;
    private TextView phoneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ageTextView = findViewById(R.id.textview_age);
        nameTextView = findViewById(R.id.textview_name);
        emailTextView = findViewById(R.id.textview_email);
        phoneTextView = findViewById(R.id.textview_phone);

        if (getIntent().getParcelableExtra(INTENT_KEY) == null ) return;
        UserEntity user = getIntent().getParcelableExtra(INTENT_KEY);
        ageTextView.setText(Integer.toString(user.getProfile().getAge()));
        nameTextView.setText(user.getProfile().getName());

        emailTextView.setText(user.getContactInfo().getEmail());
        phoneTextView.setText(user.getContactInfo().getPhone());
    }

}
