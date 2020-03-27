package com.books.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double num1, num2, result;
    String str = "\u00f7";

    boolean add, sub, mul, div, sin, cos, tan;

    TextView txt_result;
    EditText txt_input;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
    btnNine, btnZero, btnDot, btnAdd, btnSub, btnMul, btnDiv, btnDel, btnSin, btnCos,
    btnTan, btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_result = findViewById(R.id.txt_result);
        txt_input = findViewById(R.id.txt_input);

        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTan = findViewById(R.id.btnTan);
        btnDel = findViewById(R.id.btnDel);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDot = findViewById(R.id.btnDot);
        btnZero = findViewById(R.id.btnZero);
        btnDel = findViewById(R.id.btnDel);
        btnAdd = findViewById(R.id.btnPlus);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnMinus);
        btnDiv = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEquals);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("1");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "1");
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("2");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "2");
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("3");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "3");
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("4");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "4");
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("5");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "5");
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("6");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "6");
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("7");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "7");
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("8");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "8");
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("9");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "9");
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.setText("0");
                }else{
                    txt_input.setText(txt_input.getText().toString() + "0");
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0")){
                    txt_input.append(".");
                }else{
                    txt_input.setText(txt_input.getText().toString()+ ".");
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Del = txt_input.getText().toString();
                if(Del.length() > 1){
                    Del = Del.substring(0, Del.length() - 1);
                    txt_input.setText(Del);
                }else if(Del.length() <= 1){
                    txt_input.setText("");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0") || txt_input.getText().
                toString().equals("")){
                    num1 = result;
                }else{
                    num1 = Double.parseDouble(txt_input.getText().toString());
                }
                txt_input.setText("");
                txt_result.setText(removeZero(""+num1) + " +");
                add = true;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0") || txt_input.getText().
                        toString().equals("")){
                    num1 = result;
                }else{
                    num1 = Double.parseDouble(txt_input.getText().toString());
                }
                txt_input.setText("");
                txt_result.setText(removeZero(""+num1) + " -");
                sub = true;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0") || txt_input.getText().
                        toString().equals("")){
                    num1 = result;
                }else{
                    num1 = Double.parseDouble(txt_input.getText().toString());
                }
                txt_input.setText("");
                txt_result.setText(removeZero(""+num1) + " *");
                mul = true;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_input.getText().toString().equals("0") || txt_input.getText().
                        toString().equals("")){
                    num1 = result;
                }else{
                    num1 = Double.parseDouble(txt_input.getText().toString());
                }
                txt_input.setText("");
                txt_result.setText(removeZero(""+num1) +  str);
                div = true;
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_result.setText("sin");
                sin = true;
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_result.setText("cos");
                cos = true;
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_result.setText("tan");
                tan = true;
            }
        });


        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(txt_input.getText().toString()) || TextUtils.
                        isEmpty(txt_result.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Input field cannot be empty"
                    , Toast.LENGTH_LONG);
                }

                num2 = Double.parseDouble(txt_input.getText().toString());

                if(add == true){
                    txt_input.setText("");
                    result = num1 + num2;
                    txt_result.setText(removeZero(""+result));
                    add = false;
                }

                if(sub == true){
                    txt_input.setText("");
                    result = num1 - num2;
                    txt_result.setText(removeZero(""+result));
                    sub = false;
                }

                if(mul == true){
                    txt_input.setText("");
                    result = num1 * num2;
                    txt_result.setText(removeZero(""+result));
                    mul = false;
                }

                if(div == true){
                    txt_input.setText("");
                    result = num1 / num2;
                    txt_result.setText(removeZero(""+result));
                    div = false;
                }

                if(sin == true){
                    result = Math.sin(Math.toRadians(num2));
                    txt_result.setText(""+result);
                    txt_input.setText("");
                    sin = false;
                }

                if(cos == true){
                    result = Math.cos(Math.toRadians(num2));
                    txt_result.setText(""+result);
                    txt_input.setText("");
                    cos = false;
                }

                if(tan == true){
                    result = Math.tan(Math.toRadians(num2));
                    txt_result.setText(""+result);
                    txt_input.setText("");
                    tan = false;
                }

            }
        });












    }

    private String removeZero(String formatInput){
        if(!formatInput.contains(".")){
            return formatInput;
        }
        int dotPos = formatInput.indexOf(".");
        String newVal = formatInput.substring(dotPos, formatInput.length());
        if(newVal.equals(".0")){
            return formatInput.substring(0, dotPos);
        }
        return formatInput;
    }

}
