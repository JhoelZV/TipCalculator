package com.example.jhoel.myapplication;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.RadioGroup;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public final int SLICES_PER_PIZZA = 8;

    private EditText mNumBillEditText;
    private TextView mNumTipTextView;
    private EditText mNumTipEditText;
    private TextView mNumTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the widgets to class variables
        mNumBillEditText = (EditText) findViewById(R.id.billEditText);
        mNumTipTextView = (TextView) findViewById(R.id.tipTextView);
        mNumTipEditText = (EditText) findViewById(R.id.tipEditText);
        mNumTotalTextView = (TextView) findViewById(R.id.totalTextView);
    }

    public void calculateClick(View view) {

        String numBillStr = mNumBillEditText.getText().toString();
        String numTipStr = mNumTipEditText.getText().toString();


        if (numBillStr.isEmpty() || numTipStr.isEmpty()){
            Toast.makeText(this, "Enter numbers for bill and tip percent.", Toast.LENGTH_SHORT).show();
        }
        else {
            float numBill = Float.parseFloat(numBillStr);
            float numTip = Float.parseFloat(numTipStr);
            NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

            float tipAmountCalc = (float) (numBill * (numTip * 0.01));
            String tipAmount = moneyFormat.format(tipAmountCalc);

            float totalAmount = numBill + tipAmountCalc;
            String billAmount = moneyFormat.format(totalAmount);

            mNumTipTextView.setText(tipAmount);
            mNumTotalTextView.setText(billAmount);
        }
    }
}
