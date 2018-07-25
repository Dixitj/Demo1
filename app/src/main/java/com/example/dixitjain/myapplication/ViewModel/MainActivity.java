package com.example.dixitjain.myapplication.ViewModel;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.dixitjain.myapplication.Model.FindPrimeNumber;
import com.example.dixitjain.myapplication.R;
import com.example.dixitjain.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        // Event to Handle Find Button Click
        binding.findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                findClickHandler();
            }
        });


        //Event to Handle Binary Button Click
        binding.binarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchBinary();
            }
        });


    }





















    private void findClickHandler(){


        FindPrimeNumber primeNumber = new FindPrimeNumber();
        binding.numberText.setText(primeNumber.primeNumberCal(
                binding.numberText.getText().toString()));


    }

    private void switchBinary(){

        startActivity(new Intent(MainActivity.this, HomePage.class));

    }


}
