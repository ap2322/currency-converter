package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        EditText dollarsEditText = (EditText) findViewById(R.id.dollarsEditText);
        Double dollarsDbl = Double.parseDouble(dollarsEditText.getText().toString());
        Double poundsDbl = dollarsDbl * .81;
        String poundsStr = String.format("%.2f", poundsDbl);

        Toast.makeText(this, poundsStr, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
