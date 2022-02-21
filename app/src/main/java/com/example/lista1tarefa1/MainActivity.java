package com.example.lista1tarefa1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btsend;
    private EditText edit;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btsend = (Button) findViewById(R.id.btsend);
        edit = (EditText) findViewById(R.id.user);
        txt = (TextView) findViewById(R.id.text);


        btsend.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                String a = edit.getText().toString();
                txt.setText(a);

                Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();
            }
        });

        getSupportActionBar().setTitle("Login");
    }
}