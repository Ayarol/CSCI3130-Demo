package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String Message ="Hello World~";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void EditMessage (View view){
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
