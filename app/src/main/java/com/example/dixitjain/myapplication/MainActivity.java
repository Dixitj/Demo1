package com.example.dixitjain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText
        final EditText primeNumberText = findViewById(R.id.number_Text);

        // Button
        Button findButton = findViewById(R.id.find_button);
        Button binaryButton = findViewById(R.id.binarybutton);




        // Event when Find Button is Clicked
        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // FindPrimeNumber class declaration and set EditText
                String number = primeNumberText.getText().toString();
                FindPrimeNumber primeNumber = new FindPrimeNumber();
                primeNumberText.setText(primeNumber.primeNumberCal(number));

                primeNumberText.setText("");

            }
        });


        // Segue between two events
        binaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, HomePage.class));
            }
        });



    }
}
