package com.example.scoreboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int a=0;
    int b=0;
    TextView textView1;
    TextView textView2;
    Button button1;
    Button button2;
    Button button3;
    Button b121;
    Button b122;
    Button b123;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.b11);
        button2=findViewById(R.id.b12);
        button3=findViewById(R.id.b13);
        b121=findViewById(R.id.b21);
        b122=findViewById(R.id.b22);
        b123=findViewById(R.id.b23);
        textView1=findViewById(R.id.textv12);
        textView2=findViewById(R.id.textv22);
        button1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        a+=3;
                                        textView1.setText(""+a);
                                    }
                                }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        a+=2;
                                        textView1.setText(""+a);
                                    }
                                }
        );
        button3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        a++;
                                        textView1.setText(""+a);
                                    }
                                }
        );
        b121.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        b+=3;
                                        textView2.setText(""+b);
                                    }
                                }
        );
        b122.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        b+=2;
                                        textView2.setText(""+b);
                                    }
                                }
        );
        b123.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Action
                                        b++;
                                        textView2.setText(""+b);
                                    }
                                }
        );

        if(savedInstanceState!=null)
        {
            String s1=savedInstanceState.getString("kar1");
            a= Integer.parseInt(s1);
            textView1.setText(""+a);
        }
        if(savedInstanceState!=null)
        {
            String s2=savedInstanceState.getString("kar2");
            a= Integer.parseInt(s2);
            textView2.setText(""+b);
        }
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("kar1",textView1.getText().toString());
        outState.putString("kar2",textView2.getText().toString());
    }
}