package com.example.paxie.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {

    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TextView mFactLabel;
    private String mFact = mFactBook.mFacts[0];
    private int mColor = Color.parseColor(mColorWheel.mColors[8]);
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare our View variables and assign them the views from the layout file
        mFactLabel = (TextView) findViewById(R.id.facttextView);
        mShowFactButton = (Button) findViewById(R.id.showfactbutton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mFact = mFactBook.getFact();

                //update the label with our dynamic fact

                mFactLabel.setText(mFact);
                mColor = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(mColor);
                mShowFactButton.setTextColor(mColor);
            }
        };
        mShowFactButton.setOnClickListener(listener);


    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFact = savedInstanceState.getString(KEY_FACT);
        mFactLabel.setText(mFact);
        mColor = savedInstanceState.getInt(KEY_COLOR);
        mRelativeLayout.setBackgroundColor(mColor);
        mShowFactButton.setTextColor(mColor);
    }
}
