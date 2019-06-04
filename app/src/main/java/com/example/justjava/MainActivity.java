package com.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int Team_a = 0;
    public int Team_b = 0;

    public void reset_all(View view){
        Team_a = 0;
        Team_b = 0;
        display_a(Team_a);
        display_b(Team_b);
    }

    public void max_points_team_a(View view){
        Team_a = Team_a + 3;
        display_a(Team_a);
    }

    public void two_points_team_a(View view){
        Team_a = Team_a + 2;
        display_a(Team_a);
    }
    public void free_throw_team_a(View view){
        Team_a = Team_a + 1;
        display_a(Team_a);
    }
    private void display_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view_a);
        quantityTextView.setText("" + number);
    }

    public void max_points_team_b(View view){
        Team_b = Team_b + 3;
        display_b(Team_b);
    }

    public void two_points_team_b(View view){
        Team_b = Team_b + 2;
        display_b(Team_b);
    }
    public void free_throw_team_b(View view){
        Team_b = Team_b + 1;
        display_b(Team_b);
    }
    private void display_b(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view_b);
        quantityTextView.setText("" + number);
    }


    /**
    int numberOfCoffee = 1;

     * This method is called when the order button is clicked.


    public void submitOrder(View view) {
        numberOfCoffee = numberOfCoffee * 2;
        displayPrice(numberOfCoffee);
        numberOfCoffee = numberOfCoffee / 2;
    }
    public void increment(View view){
        numberOfCoffee = numberOfCoffee + 1;
        display(numberOfCoffee);
    }

    public void decrement(View view){
        numberOfCoffee = numberOfCoffee - 1;
        display(numberOfCoffee);
    }
/**
    private void displayPrice(int number) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/
    /**
     * This method displays the given quantity value on the screen.

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
     */
}