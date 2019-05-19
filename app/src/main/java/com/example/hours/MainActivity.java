package com.example.hours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText data;
    Button insert;
    String tmpString=".";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insert = (Button)findViewById(R.id.insbtn);
    }

    public void tryingmethor(View view) {
        data = (EditText)findViewById(R.id.ed1);
        tmpString = data.getText().toString();
        Toast.makeText(this, tmpString, Toast.LENGTH_SHORT).show();
    }
}