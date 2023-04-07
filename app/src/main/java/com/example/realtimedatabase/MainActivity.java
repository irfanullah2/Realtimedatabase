package com.example.realtimedatabase;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import com.google.firebase.database.FirebaseDatabase;



public class MainActivity extends AppCompatActivity {

    EditText name, email, phoneNo, Address;

    Button submitBtn;
    
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);

        email = findViewById(R.id.email);

        phoneNo = findViewById(R.id.phone);

        Address = findViewById(R.id.address);

        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {

            @Override

            
            public void onClick(View v) {


                String nameSender=name.getText().toString();

                String emailSender=email.getText().toString();

                String phoneSender=phoneNo.getText().toString();

                String addressSender=Address.getText().toString();


                FirebaseDatabase database=FirebaseDatabase.getInstance();

                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                
                DatabaseReference ref=database.getReference("MyDataBase");

                Model model=new Model(nameSender,emailSender,phoneSender,addressSender);

                ref.setValue(model);

                Toast.makeText(MainActivity.this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();

            }

        });

    }



}