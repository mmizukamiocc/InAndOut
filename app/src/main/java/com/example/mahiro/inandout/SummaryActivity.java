package com.example.mahiro.inandout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends Activity {


    private TextView orderTotalTextView;
    private TextView orderSummaryTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        orderTotalTextView =(TextView) findViewById(R.id.totalOrderTextView);
        orderSummaryTextView =(TextView)findViewById(R.id.summaryTextView);


        Intent intentFromOrderActivity = getIntent();
        String orderTotalText = intentFromOrderActivity.getStringExtra("TotalAmount");
        String orderSummaryText = intentFromOrderActivity.getStringExtra("OrderSummaryText");

        orderTotalTextView.setText(orderTotalText);
        orderSummaryTextView.setText(orderSummaryText);

    }

    public void returnToOrderEntry(View view){this.finish();}
}
