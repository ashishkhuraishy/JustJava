package com.example.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int quantity = 2;

    private int calculatePrice(int quantity, int price) {
        int Price = quantity * price;
        return Price;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayQuantity(quantity);
        int price = calculatePrice(quantity, 5);
        createOrderSummary(quantity, price);



    }

    private void createOrderSummary(int quantity, int price) {
        TextView displayText = (TextView) findViewById(R.id.order_summary_text_view);
        displayText.setText("Name : Ashsh Khuraishy\nQuantity : " + quantity + "\nTotal : $" + price + ".00\nThank You!");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view) {

        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(View view) {

        quantity--;
        displayQuantity(quantity);
    }



}