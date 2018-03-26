package com.example.sk.startactivityforresultdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by SK on 3/23/2018.
 */

public class SecondActivity extends AppCompatActivity {
    private EditText edtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtData = (EditText) findViewById(R.id.edtData);
    }

    public void sendData(View view) {
        String data = edtData.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra("data_key", data);
        setResult(RESULT_OK, intent);
        finish();
    }
}
