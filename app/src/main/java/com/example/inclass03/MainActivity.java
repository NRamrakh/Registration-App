/*
 Assignment: In Class Assignment Number 3
 File Name: MainActivity.java
 Group Number 19
 Full Name:
 Nisha Ramrakhyani
 Punit Mashruwala
*/

package com.example.inclass03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    final static public int REQ_CODE = 1;
    EditText name;
    EditText email_id_from_text;
    EditText user_id_from_text;
    TextView textViewDept_from_text;
    final static public String USER_KEY = "USER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.Registration));
        
        name = findViewById(R.id.editTextNameInput);
        email_id_from_text = findViewById(R.id.editTextEmailInput);
        user_id_from_text = findViewById(R.id.editTextIdInput);
        textViewDept_from_text = findViewById(R.id.textViewDeptInput);

        findViewById(R.id.selectButton).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Department.class);
            startActivityForResult(intent, REQ_CODE);

        });

        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = name.getText().toString();
                String user_email = email_id_from_text.getText().toString();
                String user_dept = textViewDept_from_text.getText().toString();
                String userIDText = user_id_from_text.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\.+[a-zA-Z]+";
                String namePattern = "[a-zA-Z]";

                if (user_name.isEmpty() || user_email.isEmpty() || user_dept.isEmpty() || userIDText.isEmpty()) {
                    Toast.makeText(MainActivity.this, getResources().getString(R.string.Error), Toast.LENGTH_LONG).show();
                } else {
//                    if (user_name.matches(namePattern)) {
                        if (user_email.matches(emailPattern)) {
                            int user_id = parseInt(userIDText);
                            Intent intent = new Intent(MainActivity.this, Profile.class);
                            intent.putExtra(USER_KEY, new User(user_name, user_email, user_id, user_dept));
                            startActivity(intent);
                        } else {
                            Toast.makeText(MainActivity.this, getResources().getString(R.string.ErrorEmail), Toast.LENGTH_LONG).show();
                        }
//                    } else {
//                        Toast.makeText(MainActivity.this, getResources().getString(R.string.ErrorName), Toast.LENGTH_LONG).show();
//                    }
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (data != null && data.hasExtra(Department.Entered_Data)) {
                textViewDept_from_text.setText(data.getStringExtra(Department.Entered_Data));
            }
        } else if (resultCode == RESULT_CANCELED) {
            String user_dept = textViewDept_from_text.getText().toString();
            if(user_dept.isEmpty()){
                Toast.makeText(MainActivity.this, getResources().getString(R.string.CancelToast), Toast.LENGTH_LONG).show();
            }
        }
    }


}