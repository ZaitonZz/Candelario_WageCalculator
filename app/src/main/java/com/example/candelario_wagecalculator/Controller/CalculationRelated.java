package com.example.candelario_wagecalculator.Controller;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.candelario_wagecalculator.Model.WageRelated;

import java.io.Serializable;

public class CalculationRelated implements Serializable{
    WageRelated w;
    public CalculationRelated(WageRelated model){
        w=model;
    }

    public void checkWrong(ImageView wrong1, ImageView wrong2, ImageView wrong3,int hours, String type, WageRelated model, Context context, CalculationRelated z) {
        if (wrong1.getVisibility()== View.VISIBLE||wrong2.getVisibility()==View.VISIBLE||wrong3.getVisibility()==View.VISIBLE) {
            Log.d(TAG, "checkWrong: stop1");
        } else{
            calcWage(hours, type, model);
            Intent intent = new Intent(context, Display.class);
            intent.putExtra("calc_class", z);
            context.startActivity(intent);
            Log.d(TAG, "checkWrong: Intent1");
        }
    }

    public void checkType(String type, ImageView wrong2){
        wrong2.setVisibility(View.VISIBLE);
        switch(type) {
            case ("Regular"):
            case ("regular"):
            case ("REGULAR"):
            case ("Probationary"):
            case ("probationary"):
            case ("PROBATIONARY"):
            case ("Part-Time"):
            case ("part-time"):
            case ("PART-TIME"):{
                wrong2.setVisibility(View.INVISIBLE);
                break;
            }
        }
    }

    public void checkName(String name, ImageView wrong1) {
        if (name==null|| name.equals("")){
            wrong1.setVisibility(View.VISIBLE);
        } else{
            wrong1.setVisibility(View.INVISIBLE);
        }
    }

    public void checkHours(int hours, ImageView wrong3, EditText Hours) {
        if (hours >= 20 || hours < 1){
            Hours.setText("0");
            wrong3.setVisibility(View.VISIBLE);
            Log.d(TAG, "onClick: less than 20");
        } else{
            wrong3.setVisibility(View.INVISIBLE);
            Log.d(TAG, "onClick: don't mind me");
        }
    }
    public void calcWage(int hours, String type, WageRelated model){
        if (type.equals("regular")||type.equals("Regular")||type.equals("REGULAR")){
            if (hours>8){
                model.setOThours(hours-8);
                model.setWage(800);
                model.setOTwage(model.getOTwage()*115);
                model.setTotalwage(model.getWage()+ model.getOTwage());
                model.setTotalhours(hours);
            } else{
                model.setWage(hours * 100);
                model.setTotalwage(model.getWage());
            }
        } else if (type.equals("probationary")||type.equals("Probationary")||type.equals("PROBATIONARY")){
            if (hours>8){
                model.setOThours(hours-8);
                model.setWage(720);
                model.setOTwage(model.getOTwage()*100);
                model.setTotalwage(model.getWage()+ model.getOTwage());
                model.setTotalhours(hours);
            } else{
                model.setWage(hours * 90);
                model.setTotalwage(model.getWage());
            }
        } else{
            if (hours>8){
                model.setOThours(hours-8);
                model.setWage(600);
                model.setOTwage(model.getOTwage()*90);
                model.setTotalwage(model.getWage()+ model.getOTwage());
                model.setTotalhours(hours);
            } else{
                model.setWage(hours * 75);
                model.setTotalwage(model.getWage());
            }
        }
    }
    public void updateUI(){
        Log.d(TAG, "updateUI: working1");
        //if (w.getOThours()==0){}
    }
}
