package com.emmu.courseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class CardViewExample extends AppCompatActivity {
    //Menu m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_example);
      //  m1=(Menu) findViewById(R.id.helpp);
      //  m2=(Menu) findViewById(R.id.exitt);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.helpp:
                AlertDialog.Builder builder=new AlertDialog.Builder(CardViewExample.this);
                builder.setMessage("Do You Want Help From us ?");
                builder.setTitle("Alert!");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
              //  helpp();
                return true;
            case R.id.exitt:
                //exit();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}