package com.example.android.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String user_name;
    private int cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    private void submitOrder(View view){
        EditText user = findViewById(R.id.usr);
        EditText no = findViewById(R.id.coffee);
        TextView username = findViewById(R.id.textUser);
        TextView tv = findViewById(R.id.textView);
        TextView c = findViewById(R.id.cost);
        TextView tview = findViewById(R.id.textView5);


        user_name = user.getText().toString();
        tv.setText(user_name);
        cost = new Integer(no.getText().toString()).intValue();
        cost = cost *2;
        tview.setText(cost);

    }
}
