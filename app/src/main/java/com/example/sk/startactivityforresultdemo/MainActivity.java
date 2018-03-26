package com.example.sk.startactivityforresultdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData = (TextView) findViewById(R.id.txtData);
    }

    public void getData(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,999);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 999) && (resultCode == RESULT_OK)) {
            Bundle bundle = data.getExtras();
            String data1 = bundle.getString("data_key");
            txtData.setText(data1);
        }
    }
}
