package com.example.candelario_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;
import static android.content.ContentValues.TAG;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.candelario_wagecalculator.Controller.CalculationRelated;
import com.example.candelario_wagecalculator.Model.WageRelated;
import com.example.candelario_wagecalculator.R;

public class DisplayActivity extends AppCompatActivity {
    WageRelated model;
    CalculationRelated calc;
    TextView totalwage,regwage,otwage,totalhours,othours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        model = (WageRelated) intent.getSerializableExtra("model_class");
        calc = new CalculationRelated(model);
        totalwage = findViewById(R.id.total_wage);
        regwage = findViewById(R.id.reg_wage);
        otwage = findViewById(R.id.ot_wage);
        totalhours = findViewById(R.id.total_hours);
        othours = findViewById(R.id.ot_hours);
        calc.updateUI(totalwage,regwage,otwage,totalhours,othours);
    }
}