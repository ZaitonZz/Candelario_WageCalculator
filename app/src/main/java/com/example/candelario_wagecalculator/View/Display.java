package com.example.candelario_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;
import static android.content.ContentValues.TAG;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.candelario_wagecalculator.Controller.CalculationRelated;
import com.example.candelario_wagecalculator.Model.WageRelated;
import com.example.candelario_wagecalculator.R;

public class Display extends AppCompatActivity {
    CalculationRelated calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        calc = (CalculationRelated) intent.getSerializableExtra("calc_class");
        calc.updateUI();
        Log.d(TAG, "onCreate: working1");
    }
}