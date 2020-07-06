package com.example.countapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    int i=0;
    int temp=i;
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);
        button1=findViewById(R.id.b1);
        button2=findViewById(R.id.b2);
        button3=findViewById(R.id.b3);
        button4=findViewById(R.id.b4);

        button1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                //Action
                i++;
                textView.setText("" + i);


            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                //Action
                i--;
                textView.setText("" + i);


            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                //Action
                i=temp;
                temp=i;
                textView.setText("" + i);


            }
        });
        if (savedInstanceState!=null){
            String s=savedInstanceState.getString("kar");
            i= Integer.parseInt(s);
            textView.setText(""+i);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("kar",textView.getText().toString());
    }

    public void display(View view){
        //Action
        Toast.makeText(this,"Your count is: "+i,Toast.LENGTH_SHORT).show();

    }
}