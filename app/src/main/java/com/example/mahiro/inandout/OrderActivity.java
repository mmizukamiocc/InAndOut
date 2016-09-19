package com.example.mahiro.inandout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class OrderActivity extends Activity {

    private EditText doubleDoubleEditText;
    private EditText cheeseburgerEditText;
    private  EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallDrinkEditText;
    private EditText mediumDrinkEditText;
    private EditText largeDrinkEditText;

    private Order currentOrder = new Order();

    private String orderTotalText;
    private String orderSummaryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        doubleDoubleEditText = (EditText)findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText =(EditText)findViewById(R.id.cheeseburgerEditText);
        frenchFriesEditText = (EditText)findViewById(R.id.frenchFriesEditText);
        shakesEditText = (EditText)findViewById(R.id.shakesEditText);
        smallDrinkEditText = (EditText)findViewById(R.id.smallDrinkEditText);
        mediumDrinkEditText =(EditText)findViewById(R.id.mediumDrinkEditText);
        largeDrinkEditText = (EditText)findViewById(R.id.largeDrinkEditText);



    }

    public void activateOrder(View view){

        int doubleDouble;
        int cheeseburger;
        int frenchFries;
        int shakes;
        int smallDrink;
        int mediumDrink;
        int largeDrink;



        double taxAmount;
        double totalAmount;

        try{
            doubleDouble = Integer.parseInt(doubleDoubleEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
            doubleDouble = 0;
        }
        try{
            cheeseburger = Integer.parseInt(cheeseburgerEditText.getText().toString());
        }
         catch (NumberFormatException e)
         {
         cheeseburger = 0;
         }

        try{
            frenchFries = Integer.parseInt(frenchFriesEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
            frenchFries= 0;
        }

        try{
            shakes = Integer.parseInt(shakesEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
           shakes = 0;
        }

        try{
            smallDrink = Integer.parseInt(smallDrinkEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
           smallDrink = 0;
        }
        try{
            mediumDrink = Integer.parseInt(mediumDrinkEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
          mediumDrink  = 0;
        }
        try{
            largeDrink = Integer.parseInt(largeDrinkEditText.getText().toString());
        }
        catch (NumberFormatException e)
        {
          largeDrink  = 0;
        }

        currentOrder.setDoubleDouble(doubleDouble);
        currentOrder.setCheeseburger(cheeseburger);
        currentOrder.setFrenchFries(frenchFries);
        currentOrder.setShakes(shakes);
        currentOrder.setSmallDrink(smallDrink);
        currentOrder.setMediumDrink(mediumDrink);
        currentOrder.setLargeDrink(largeDrink);

        currentOrder.recalculate();
        taxAmount = currentOrder.getTax();
        totalAmount = currentOrder.getTotal();

        currentOrder.setTax(taxAmount);
        currentOrder.setTotal(totalAmount);


        constructOrderSummaryText();

        Intent orderSummaryIntent = new Intent(this, SummaryActivity.class);
        orderSummaryIntent.putExtra("TotalAmount",orderTotalText);
        orderSummaryIntent.putExtra("OrderSummaryText",orderSummaryText);

        startActivity(orderSummaryIntent);
    }
    private void constructOrderSummaryText(){

        orderTotalText = getString(R.string.summaryLine1) + String.format("%.2f",currentOrder.getTotal());


        orderSummaryText = getString(R.string.summaryLine2) + currentOrder.getTotalItems()
                + getString(R.string.summaryLine3) + String.format("%.2f",currentOrder.getSubtotal()) +getString(R.string.summaryLine4)
                + String.format("%.2f",currentOrder.getTax());

    }
}
