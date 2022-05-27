package com.emmu.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginCourse extends AppCompatActivity {

    String username="user";
    String password="12345";
    EditText e1,e2;
    Button b1;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_course);
        e1=(EditText) findViewById(R.id.loginedtname);
        e2=(EditText) findViewById(R.id.loginedtpassword);
        b1=(Button) findViewById(R.id.btsigh);
        intent=getIntent();
       String username=intent.getStringExtra("user");
       String password=intent.getStringExtra("pin");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=e1.getText().toString();
                String pword=e2.getText().toString();

                if(uname.equals(username) && pword.equals(password)){
                    Intent intent=new Intent(getApplicationContext(),CardViewExample.class);
                    intent.putExtra("user",uname);
                    startActivity(intent);
                }
            }
        });
    }

    public void createnewaccount(View view) {

        String newaccount=b1.getText().toString();
        Intent i=new Intent(getApplicationContext(),RegisterationCourse.class);
        startActivity(i);
    }

    public void gotofb(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(intent);
    }

    public void gotogoogle(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void gototwitter(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.twitter.com"));
        startActivity(intent);
    }
}