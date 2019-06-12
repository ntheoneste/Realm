package com.example.realmtn;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {
    Realm realm;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

    public ArrayList<String> retrieve() {
        ArrayList<String> objFirstName = new ArrayList<>();
        RealmResults<Student> objects = realm.where(Student.class).findAll();
        for (Student obj: objects) {
            objFirstName.add(obj.getFirstName());

        }
return objFirstName;

    }
}
