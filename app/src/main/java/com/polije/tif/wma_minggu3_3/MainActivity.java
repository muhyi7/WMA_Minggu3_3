package com.polije.tif.wma_minggu3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materialdesign);
    }

    public void btnMaterialDesign(View view) {
        Intent pindahMaterialDesign = new Intent(MainActivity.this, TableLayout.class);
        startActivity(pindahMaterialDesign);
    }
}