package com.city.coding.restaurant3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signUp_entry extends AppCompatActivity {
    private Button signIn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_entry);
        signIn = findViewById(R.id.signIn_id);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUp_entry.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
