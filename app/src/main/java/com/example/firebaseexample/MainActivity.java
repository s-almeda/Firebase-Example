package com.example.firebaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nameField = findViewById(R.id.editAnimal);
        final EditText animalField = findViewById(R.id.editName);
        Button submit = findViewById(R.id.submitButton);

        UserDao dao = new UserDao();


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                User user = new User(nameField.getText().toString(),
                        animalField.getText().toString());
                dao.add(user).addOnSuccessListener(suc -> //add a success message
                {
                    Toast.makeText(getApplicationContext(), "Record inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er -> //add an error message
                {
                    Toast.makeText(getApplicationContext(), "Error: " + er.getMessage(), Toast.LENGTH_SHORT).show();
                });
            }
        });
    }
}