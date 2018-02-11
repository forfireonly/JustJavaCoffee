package com.example.anna.justjavacoffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.os.Build.ID;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int quantity = 0;

    TextView quantityTextView;
    TextView priceTextView;
    Button b1;
    ImageView iw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);;

        iw = (ImageView) findViewById(R.id.coffeeneed);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        int price1 = 5;
        quantity = quantity + 1;
        price1 = price1 * quantity;
        quantityTextView.setText(String.valueOf(quantity));
        priceTextView.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(price1)));
    }

    public void decriment(View view) {
        int price1 = 5;
        quantity = quantity - 1;
        if (quantity <= 0) {
            quantity = 0;
        }

        price1 = price1 * quantity;
        quantityTextView.setText(String.valueOf(quantity));
        priceTextView.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(price1)));
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v == b1)
        {
            iw.setImageResource(R.drawable.yourorder);
        }
}}
