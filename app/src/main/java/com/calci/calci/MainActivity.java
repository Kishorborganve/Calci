package com.calci.calci;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etFirstvalue, etSecondvalue;
    TextView etAns;
    Button add, substract, multiply, divide;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstvalue = findViewById(R.id.etFirstvalue);
        etSecondvalue = findViewById(R.id.etSecondvalue);

        etAns = findViewById(R.id.etAns);
        add = findViewById(R.id.addBtn);
        substract = findViewById(R.id.subBtn);
        multiply = findViewById(R.id.mulBtn);
        divide = findViewById(R.id.divbtn);

        add.setOnClickListener(view -> {
            int  firstvalue, secondvalue, ans;
            firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
            secondvalue = Integer.parseInt(etSecondvalue.getText().toString());

            ans = firstvalue + secondvalue;

            etAns.setText("ans is "+ans);
        });
        substract.setOnClickListener(view -> {
            int  firstvalue, secondvalue, ans;
            firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
            secondvalue = Integer.parseInt(etSecondvalue.getText().toString());

            ans = firstvalue - secondvalue;

            etAns.setText("ans is "+ans);
        });
        multiply.setOnClickListener(view -> {
            int  firstvalue, secondvalue, ans;
            firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
            secondvalue = Integer.parseInt(etSecondvalue.getText().toString());

            ans = firstvalue * secondvalue;

            etAns.setText("ans is "+ans);
        });
        divide.setOnClickListener(view -> {
            int  firstvalue, secondvalue, ans;
            firstvalue = Integer.parseInt(etFirstvalue.getText().toString());
            secondvalue = Integer.parseInt(etSecondvalue.getText().toString());

            ans = firstvalue / secondvalue;

            etAns.setText("ans is "+ans);
        });
    }
}