package com.example.inclass03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Department extends AppCompatActivity {

    final static public String Entered_Data = "ENTERED DATA";

    RadioGroup radioGroup;
    RadioButton radioButtonCS;
    RadioButton radioButtonSoftware;
    RadioButton radioButtonBio;
    RadioButton radioButtonDS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        setTitle(getResources().getString(R.string.Department));

        radioButtonCS = findViewById(R.id.radioButton_CS);
        radioButtonBio = findViewById(R.id.radioButtonBioInfo);
        radioButtonSoftware = findViewById(R.id.radioButtonSoftware);
        radioButtonDS = findViewById(R.id.radioButtonDS);


        findViewById(R.id.buttonSelect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup = findViewById(R.id.radioGroup);
                int checkedId = radioGroup.getCheckedRadioButtonId();
                Intent intent = new Intent();
                if (checkedId == R.id.radioButton_CS) {
                    String enteredData = radioButtonCS.getText().toString();
                    intent.putExtra(Entered_Data, enteredData);
                    setResult(RESULT_OK, intent);
                    finish();
                } else if (checkedId == R.id.radioButtonSoftware) {
                    String enteredData = radioButtonSoftware.getText().toString();
                    intent.putExtra(Entered_Data, enteredData);
                    setResult(RESULT_OK, intent);
                    finish();
                } else if (checkedId == R.id.radioButtonBioInfo) {
                    String enteredData = radioButtonBio.getText().toString();
                    intent.putExtra(Entered_Data, enteredData);
                    setResult(RESULT_OK, intent);
                    finish();
                } else if (checkedId == R.id.radioButtonDS) {
                    String enteredData = radioButtonDS.getText().toString();
                    intent.putExtra(Entered_Data, enteredData);
                    setResult(RESULT_OK, intent);
                    finish();

                }
            }
        });

        findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}