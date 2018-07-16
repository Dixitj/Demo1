package com.example.dixitjain.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class HomePage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Text
        final EditText valueText = findViewById(R.id.editText);

        // Buttons
        Button addButton = findViewById(R.id.addbutton);
        Button searchButton = findViewById(R.id.searchbutton);
        Button selectButton = findViewById(R.id.primebutton);





         // Event to perform Binary add;
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Text Input reading and Conversion
                String addNumber = valueText.getText().toString();
                int numberToAdd = Integer.parseInt(addNumber);

                // Class Instance
                FindPrimeNumber fpn = new FindPrimeNumber();
                fpn.binaryAddAlgo(numberToAdd);


                /* Toast */
                Toast.makeText(getApplicationContext(), "Element" + numberToAdd + "Added",
                                Toast.LENGTH_LONG).show();

                valueText.setText("");

            }
        });



        // Event to perform Binary Search
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String toastString ;

                // Text Input reading and Conversion
                String seachValue = valueText.getText().toString();
                int valueToSearch = Integer.parseInt(seachValue);

                // Class Instance
                FindPrimeNumber fpn = new FindPrimeNumber();
                int response = fpn.binarySearchAlgo(valueToSearch);

                if ( response != -1 ) {
                    response = response + 1 ;
                    toastString = "Element found at position" + response;
                } else
                    toastString = "Element not found ";


                    Toast.makeText(getApplicationContext(), toastString
                            , Toast.LENGTH_LONG).show();

                valueText.setText("");

            }
        });



        // Button to Perform switch between Activities
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Segue between Views
                startActivity(new Intent(HomePage.this, MainActivity.class));

            }
        });




    }
}


