package com.example.firebaseexample;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserDao {
    private DatabaseReference databaseReference;

    public UserDao() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(User.class.getSimpleName());
    }

    public Task<Void> add(User u) {
        return databaseReference.push().setValue(u);

    }
}

