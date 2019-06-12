package com.example.realmtn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    EditText etReg,etFirstName,etLastName;
    Button bSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etReg =(EditText) findViewById(R.id.etReg);
        etFirstName =(EditText) findViewById(R.id.etFirstName);
        etLastName =(EditText) findViewById(R.id.etLastName);

        bSave =(Button)findViewById(R.id.bSave);

        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Realm realm=Realm.getDefaultInstance();

                Integer Reg= Integer.valueOf(etReg.getText().toString());
                String FirstName=etFirstName.getText().toString();
                String  LastName=etLastName.getText().toString();


                realm.beginTransaction();
            Student obj=realm.createObject(Student.class);
            obj.setReg(Reg);
            obj.setFirstName(FirstName);
            obj.setLastName(LastName);
            realm.commitTransaction();

            Toast.makeText(getApplicationContext(),"You are successful saved",Toast.LENGTH_LONG).show();
            }

        });
    }
    public void show(View view){
        Intent in=new Intent(this,Baho.class);
        startActivity(in);

    }
}
