package com.example.loginandregistrationbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
{

    EditText editTextt1;
    EditText editText2;
    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextt1=findViewById(R.id.user);
        editText2=findViewById(R.id.pass);
        login= findViewById(R.id.login);
        register=findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });
    }
    public void openactivity2(){
       Intent intent1= new Intent(MainActivity.this,SecondActivity.class);
       startActivity(intent1);
    }

    public void openactivity3(){
        Intent intent2= new Intent(MainActivity.this, ThirdMain.class);
        startActivity(intent2);
    }

}
