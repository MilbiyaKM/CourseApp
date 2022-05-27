package com.emmu.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterationCourse extends AppCompatActivity {

    EditText e1n,e2p,e3m;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_course);

        e1n=(EditText) findViewById(R.id.uname);
        e2p=(EditText) findViewById(R.id.passwordedtr);
        e3m=(EditText) findViewById(R.id.edtemail);
        b1=(Button) findViewById(R.id.btngetstarted);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=e1n.getText().toString();
                String pin=e2p.getText().toString();
                Intent intent=new Intent(getApplicationContext(),LoginCourse.class);
                intent.putExtra("user",name);
                intent.putExtra("pin",pin);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"registeration successfull",Toast.LENGTH_LONG).show();
            }
        });
    }
}