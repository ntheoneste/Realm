package com.example.realmtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class Baho extends AppCompatActivity {
    ListView lvbaho;
    ArrayList<String> baho;
    ArrayAdapter adapter;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baho);
        lvbaho=(ListView) findViewById(R.id.baho);
        realm=Realm.getDefaultInstance();
        RealmHelper helper=new RealmHelper(realm);
        baho=helper.retrieve();
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,baho);
        lvbaho.setAdapter(adapter);
    }
}
