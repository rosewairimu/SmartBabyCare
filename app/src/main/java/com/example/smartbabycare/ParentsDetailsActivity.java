package com.example.smartbabycare;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ParentsDetailsActivity extends AppCompatActivity {

    EditText et_Name,et_email,etPhone_Number,etDoB;
    Button btnSubmit;

    private DatabaseReference mDatabase;

    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String userid = user.getUid();

    int TAKE_IMAGE_CODE = 10001;
    private FirebaseAuth mAuth;
    public String mName, mEmail, lastName, mPhonenumber, mDoB;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_parents_details);

        et_Name = findViewById(R.id.et_Name);
        et_email = findViewById(R.id.et_email);
        etPhone_Number = findViewById(R.id.etPhone_Number);
        etDoB = findViewById(R.id.etDoB);
        btnSubmit = findViewById(R.id.btnSubmit);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("registration").child(userid);

        mDatabase.orderByChild("phoneNumber").equalTo(mPhonenumber).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                mPhonenumber = snapshot.child("phoneNumber").getValue().toString();
                etPhone_Number.setText(mPhonenumber);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saveParentsDetails();

            }
        });



    }

    private void saveParentsDetails() {

        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                final String mName = et_Name.getText().toString();
                final String mEmail = et_email.getText().toString();
                final  String DoB = etDoB.getText().toString();
                final  String mPhonenumber = etPhone_Number.getText().toString();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
