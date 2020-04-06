package com.example.eva2_5_contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Intent inContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void onClick(View v){
        String myData = "content://contacts/people/";
         inContact = new Intent(Intent.ACTION_VIEW, Uri.parse(myData));
         startActivity(inContact);

     }
}
