package com.example.loginandregistrationbasic;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ThirdMain extends AppCompatActivity {
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        edittext1=findViewById(R.id.newuser);
        edittext2=findViewById(R.id.newpass);
        edittext3=findViewById(R.id.confirmpass);

    }



}
