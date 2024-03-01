package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v) {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);
        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double ressum = num1 + num2;
        resText.setText(Double.toString(ressum));
    }

    public void onButtonClick2(View r)
    {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);
        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double ressum = num1 - num2;
        resText.setText(Double.toString(ressum));
    }
    public void onButtonClick3 (View v)
    {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);
        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double ressum = num1* num2;
        resText.setText(Double.toString(ressum));
    }
    public void onButtonClick4(View v)
    {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);
        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double ressum = num1 / num2;
        resText.setText(Double.toString(ressum));
    }
}