package com.example.sutiwar.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public EditText number;
    public Button guess;
    int randomNumber;
    public void makeText(String string)
    {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
    public void guess (View view){

       Integer digit = Integer.parseInt(number.getText().toString());

       if(digit>randomNumber)
       {
           makeText("Lower!!");
       }
       else if (digit<randomNumber)
       {
           Toast.makeText(this, "Higher!!", Toast.LENGTH_LONG).show();
       }
       else{
           Random ran = new Random();
           randomNumber = ran.nextInt(20)+1;
           Toast.makeText(this, "Congratulations! You've guessed the correct number !!", Toast.LENGTH_LONG).show();
                   }


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         number = (EditText)findViewById(R.id.et_number);
         guess = (Button)findViewById(R.id.btn_guess);
        Random ran = new Random();
        randomNumber = ran.nextInt(20)+1;

    }
}
