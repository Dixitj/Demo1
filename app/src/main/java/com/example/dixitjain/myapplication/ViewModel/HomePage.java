package com.example.dixitjain.myapplication.ViewModel;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dixitjain.myapplication.Model.FindPrimeNumber;
import com.example.dixitjain.myapplication.R;
import com.example.dixitjain.myapplication.databinding.ActivityHomePageBinding;


public class HomePage extends AppCompatActivity {

 private ActivityHomePageBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home_page);


         // Event to perform Binary add;
        binding.addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addButtonHandler();

            }
        });


        // Event to perform Binary Search
        binding.searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                searchButtonHandler();

            }
        });




        // Button to Perform switch between Activities
        binding.primebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                primeScreenSwitch();

            }
        });



    }










   private void addButtonHandler(){

            // Text Input reading and Conversion
            String addNumber = binding.editText.getText().toString();
            int numberToAdd = Integer.parseInt(addNumber);

            // Class Instance
            FindPrimeNumber fpn = new FindPrimeNumber();
            fpn.binaryAddAlgo(numberToAdd);


            /* Toast */
            Toast.makeText(getApplicationContext(), "Element" + numberToAdd + "Added",
                    Toast.LENGTH_LONG).show();

        }


    private void searchButtonHandler(){
            String toastString ;

            // Text Input reading and Conversion
            String seachValue = binding.editText.getText().toString();
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

        }


    private void primeScreenSwitch(){

            // Segue between Views
            startActivity(new Intent(HomePage.this, MainActivity.class));

        }


}


