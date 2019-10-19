package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Random random = new Random();
    int secret = new Random().nextInt(50)+1;
    private EditText num;
    private TextView hint;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.ed_num);
        hint = findViewById(R.id.te_hint);
        Log.d(TAG,"Secret:" +secret);
    }


    public void guess(View view){
        int number = Integer.parseInt(num.getText().toString());
        if (number > secret){
            hint.setText("Smaller");
        }else if (number < secret){
            hint.setText("Bigger" );
        }else {
            hint.setText("Bingo" );
        }
    }
}
