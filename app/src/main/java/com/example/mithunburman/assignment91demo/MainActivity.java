package com.example.mithunburman.assignment91demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring variable by Mithun Burman 18.08.2017
    private TextView tetV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tetV = (TextView) findViewById(R.id.TextV);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.red:
                //Here by assigning  the text color to red
                tetV.setTextColor(Color.RED);
                return true;
            case R.id.green:
                //Here by assigning  the text color to green
                tetV.setTextColor(Color.GREEN);
                return true;
            case R.id.blue:
                //Here by assigning the text color to blue
                tetV.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
