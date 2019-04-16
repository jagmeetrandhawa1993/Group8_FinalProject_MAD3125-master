package com.example.group8_finalproject_w2019_mad3125;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.group8_finalproject_w2019_mad3125.Modal.Customer;

import java.util.Random;

public class Signup extends AppCompatActivity {

    Customer customer=Customer.getInstance();

    private EditText editTextname;
    private EditText editTextemail;
    private EditText editTextpassword;
    private EditText editTextaddress;
    private EditText editTextCardInfo;
    private Button   btnsignup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        editTextname = findViewById(R.id.edtName);
        editTextemail = findViewById(R.id.editemail);
        editTextpassword = findViewById(R.id.edtPassword);
        editTextaddress = findViewById(R.id.editAddress);
        editTextCardInfo = findViewById(R.id.editcard);

        btnsignup = findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int r= random.nextInt(10);
                //Customer cust=new Customer(r,editTextname.getText().toString(),editTextpassword.getText().toString() ,editTextaddress.getText().toString(),editTextemail.getText().toString(),editTextCardInfo.getText().toString());
                //customer.register(cust);
                Intent LoginIntent = new Intent(Signup.this, Login.class);
                startActivity(LoginIntent);

            }
        });


    }
}

