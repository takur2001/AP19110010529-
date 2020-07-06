package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText Rollno,Name,Phone,Emailid,Password;
    Button submit1;
    Spinner department1;
    RadioButton male1,female1,trans1;
    String last;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rollno=findViewById(R.id.rollno);
        Name=findViewById(R.id.name);
        Phone=findViewById(R.id.phoneno);
        Emailid=findViewById(R.id.emailid);
        Password=findViewById(R.id.password);

        submit1=findViewById(R.id.submit);

        department1=findViewById(R.id.department);
        male1=findViewById(R.id.male);
        female1=findViewById(R.id.female);
        trans1=findViewById(R.id.trans);
        ArrayAdapter<CharSequence> department_adapter = ArrayAdapter.createFromResource(this,
                R.array.Department, android.R.layout.simple_spinner_item);
        department1.setAdapter(department_adapter);

        department1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==-1 | i==0 )
                {
                    Toast.makeText(MainActivity.this, "Please select the Branch", Toast.LENGTH_SHORT).show();

                }

                if(i==1)
                {
                    ArrayAdapter<CharSequence> atp_department= ArrayAdapter.createFromResource(MainActivity.this,R.array.Department,
                            android.R.layout.simple_spinner_item);
                    department1.setAdapter(atp_department);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rollnum= Rollno.getText().toString();
                String name= Name.getText().toString();
                String phonenum= Phone.getText().toString();
                String emailid= Emailid.getText().toString();
                String password= Password.getText().toString();
                if (male1.isChecked())
                {
                    gender = male1.getText().toString();
                }
                if (female1.isChecked())
                {
                    gender = female1.getText().toString();
                }
                if (trans1.isChecked())
                {
                    gender = trans1.getText().toString();
                }


                String department= department1.getSelectedItem().toString();
                if (rollnum.isEmpty() | name.isEmpty() | emailid.isEmpty() | phonenum.isEmpty() | password.isEmpty() | department.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter all the details...",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, Second_activity.class);
                    i.putExtra("my data",rollnum+"\n"+name+"\n"+phonenum+"\n"+emailid+"\n"+password+"\n"+gender+"\n"+department);
                    startActivity(i);
                }
            }

        });

    }
}