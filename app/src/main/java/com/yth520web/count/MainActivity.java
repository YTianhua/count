package com.yth520web.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numA = 0;
    int numB = 0;
    String numA_A;
    String numB_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View v) {
        int id = v.getId();
      TextView  countA = (TextView) findViewById(R.id.countA);
      TextView  countB = (TextView) findViewById(R.id.countB);

        switch (id) {
            case R.id.but_1_A:
                numA = numA + 1;
                numA_A=numA+"";
                countA.setText(numA_A);
                break;
            case R.id.but_1_B:
                numB = numB + 1;
                numB_B=numB+"";
                countB.setText(numB_B);
                break;
            case R.id.but_2_A:
                numA = numA + 2;
                numA_A=numA+"";
                countA.setText(numA_A);
                break;
            case R.id.but_2_B:
                numB = numB + 2;
                numB_B=numB+"";
                countB.setText(numB_B);
                break;
            case R.id.but_3_A:
                numA = numA + 3;
                numA_A=numA+"";
                countA.setText(numA_A);
                break;
            case R.id.but_3_B:
                numB = numB + 3;
                numB_B=numB+"";
                countB.setText(numB_B);
                break;
            case R.id.reset:
                numA = 0;
                numB = 0;
                numB_B=numB+"";
                numA_A=numA+"";
                countB.setText(numB_B);
                countA.setText(numA_A);
            default:
                break;
        }
    }
}
