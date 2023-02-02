package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, plusButton, minusButton, multiplyButton, divideButton, clearButton, equalButton;

    Calculator calculator = new Calculator();

    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.display);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        multiplyButton = findViewById(R.id.multiply);
        divideButton = findViewById(R.id.divide);
        clearButton = findViewById(R.id.clear);
        equalButton = findViewById(R.id.equals);
        button0.setOnClickListener(view -> {
            calculator.push("0");
            textView.setText(calculator.toString());
        });

        button1.setOnClickListener(view -> {
            calculator.push("1");
            textView.setText(calculator.toString());
        });

        button2.setOnClickListener(view -> {
            calculator.push("2");
            textView.setText(calculator.toString());
        });

        button3.setOnClickListener(view -> {
            calculator.push("3");
            textView.setText(calculator.toString());
        });

        button4.setOnClickListener(view -> {
            calculator.push("4");
            textView.setText(calculator.toString());
        });

        button5.setOnClickListener(view -> {
            calculator.push("5");
            textView.setText(calculator.toString());
        });

        button6.setOnClickListener(view -> {
            calculator.push("6");
            textView.setText(calculator.toString());
        });

        button7.setOnClickListener(view -> {
            calculator.push("7");
            textView.setText(calculator.toString());
        });

        button8.setOnClickListener(view -> {
            calculator.push("8");
            textView.setText(calculator.toString());
        });

        button9.setOnClickListener(view -> {
            calculator.push("9");
            textView.setText(calculator.toString());
        });

        plusButton.setOnClickListener(view -> {
            calculator.push("+");
            textView.setText(calculator.toString());
        });

        minusButton.setOnClickListener(view -> {
            calculator.push("-");
            textView.setText(calculator.toString());
        });

        multiplyButton.setOnClickListener(view -> {
            calculator.push("*");
            textView.setText(calculator.toString());
        });

        divideButton.setOnClickListener(view -> {
            calculator.push("/");
            textView.setText(calculator.toString());
        });

        clearButton.setOnClickListener(view -> {
            calculator.clear();
            textView.setText(calculator.toString());
        });

        equalButton.setOnClickListener(view -> {
            if (calculator.checkOperationsValidation()) {
                calculator.calculate();
                textView.setText(calculator.calculateAnswer());
            } else {
                textView.setText("Error!");
            }
        });
    }

}
