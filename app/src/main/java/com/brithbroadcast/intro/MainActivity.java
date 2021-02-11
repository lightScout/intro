package com.brithbroadcast.intro;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView mainTextView;

    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = findViewById(R.id.solution_textview);
        mainTextView.setText(number + "");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addition_button:
                System.out.println("addition");
                break;
            case R.id.subtraction_button:
                System.out.println("subtraction");
                break;
            case R.id.multiplication_button:
                System.out.println("multiplication");
                break;
            case R.id.division_button:
                System.out.println("division");
                break;
            case R.id.equals_button:
                System.out.println("equal");
                break;
            case R.id.one_button:
                if (number > 0)
                    number = Integer.parseInt(mainTextView.getText().toString() + 1);
                else
                    number = 1;
                mainTextView.setText(number + "");
                break;
            case R.id.two_button:
                System.out.println("two");
                break;
            case R.id.three_button:
                System.out.println("three");
                break;
            case R.id.four_button:
                System.out.println("four");
                break;
            case R.id.five_button:
                System.out.println("five");
                break;
            case R.id.six_button:
                System.out.println("six");
                break;
            case R.id.seven_button:
                System.out.println("seven");
                break;
            case R.id.eight_button:
                System.out.println("eight");
                break;
            case R.id.nine_button:
                System.out.println("nine");
                break;
            default:

        }
    }

}