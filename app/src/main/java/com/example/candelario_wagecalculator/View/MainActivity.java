package com.example.candelario_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;
import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.candelario_wagecalculator.Controller.CalculationRelated;
import com.example.candelario_wagecalculator.Model.WageRelated;
import com.example.candelario_wagecalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Name, Type, Hours;
    Button Calc;
    ImageView wrong1, wrong2, wrong3;
    WageRelated model;
    CalculationRelated calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new WageRelated();
        calc= new CalculationRelated(model);

        Name = findViewById(R.id.Name);
        Type = findViewById(R.id.Type);
        Hours = findViewById(R.id.Hours);
        Calc = findViewById(R.id.button);
        Calc.setOnClickListener(this);
        wrong1 = findViewById(R.id.NameWrong);
        wrong2 = findViewById(R.id.TypeWrong);
        wrong3 = findViewById(R.id.NumWrong);

    }

    @Override
    public void onClick(View view) {
        try{
            model.setHours(Integer.parseInt(Hours.getText().toString()));
        } catch(NumberFormatException ex){
            Hours.setText("0");
            wrong3.setVisibility(View.VISIBLE);
        }
        calc.checkHours(model.getHours(),wrong3, Hours);
        model.setName(Name.getText().toString());
        calc.checkName(model.getName(), wrong1);
        model.setType(Type.getText().toString());
        calc.checkType(model.getType(), wrong2);
        calc.checkWrong(wrong1, wrong2,wrong3, model.getHours(), model.getType(),model,this,calc);
    }



}