package com.example.controldestock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accederPrincipal(View view) {

        Intent acceder_principal= new Intent(this,PrincipalActivity.class);
        startActivity(acceder_principal);



    }
}