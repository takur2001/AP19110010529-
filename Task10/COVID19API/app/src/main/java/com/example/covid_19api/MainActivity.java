package com.example.covid_19api;

//Asynctask application of covid-19 app.

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclers_View;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclers_View=findViewById(R.id.recycler);
        b1 = findViewById(R.id.refresh);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                view.animate();
                view.findFocus();
                onRestart();
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Covid_task taskq =  new Covid_task(this,recyclers_View);
        taskq.execute();
    }


}