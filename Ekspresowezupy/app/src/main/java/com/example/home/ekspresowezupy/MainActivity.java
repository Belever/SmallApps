package com.example.home.ekspresowezupy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showRecipePumpkin (View view)
    {
        Intent intentPumpkin = new Intent(this, PumpkinReciptActivity.class);
        startActivity(intentPumpkin);


    }
    public  void showRecipeCucumber ( View view)
    {
        Intent intent = new Intent (this, CucumberSoupRiceRecipeActivity.class);
        startActivity(intent);
    }
    public void showBeanRecipe (View view)
    {
        Intent intent = new Intent(this, BeanSoupRecipeActivity.class);
        startActivity(intent);
    }




}
