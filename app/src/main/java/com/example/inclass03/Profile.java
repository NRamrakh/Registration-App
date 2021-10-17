package com.example.inclass03;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    TextView textViewfinalName;
    TextView textViewfinalEmail;
    TextView textViewUserId;
    TextView textViewDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle(getResources().getString(R.string.Profile));

        textViewfinalName = findViewById(R.id.textViewfinalName);
        textViewfinalEmail = findViewById(R.id.textViewEmail);
        textViewUserId = findViewById(R.id.textViewUserId);
        textViewDept = findViewById(R.id.textViewDept);

        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(MainActivity.USER_KEY)) {
            User user = (User) getIntent().getSerializableExtra(MainActivity.USER_KEY);
            textViewfinalName.setText(user.name);
            textViewfinalEmail.setText(user.emailId);
            textViewUserId.setText(user.user_id + "");
            textViewDept.setText(user.dept);
        }
    }
}