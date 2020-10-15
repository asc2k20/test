package com.example.randomname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView)findViewById(R.id.name_textview1);
        final Button button1 =  (Button)findViewById(R.id.button_send);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String[] strings =  {"cr7", "gamma", "hitesh", "naman", "vivek","soviet","mountain"};
                Random rand = new Random();
                int n;
                n = rand.nextInt(strings.length -1);
                textView.setText(strings[n]);

            }         });s

    }
}