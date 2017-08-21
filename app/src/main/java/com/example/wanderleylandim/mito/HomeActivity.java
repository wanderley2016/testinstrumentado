package com.example.wanderleylandim.mito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void mostrarImagem(View view) {
        findViewById(R.id.action_image).setVisibility(View.VISIBLE);
    }

    public void ocultarImagem(View view) {
      findViewById(R.id.action_image).setVisibility(View.INVISIBLE);
    }
}
