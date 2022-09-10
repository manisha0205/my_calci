package com.example.my_calci;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
EditText e1,e2;
TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        t1 = findViewById(R.id.text1);
        b1 = findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = new String();
                s = e1.getText().toString();
                String m = new String();
                m=e2.getText().toString();
                int n = Integer.parseInt(s) + Integer.parseInt(m);
                t1.setText("Answer: " + n );

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = new String();
                a = e1.getText().toString();
                String b= new String();
                b=e2.getText().toString();
                int m = Integer.parseInt(a) - Integer.parseInt(b);
                t1.setText("Answer: " + m);
            }
        });

      b3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String p = new String();
              p = e1.getText().toString();
              String q= new String();
              q=e2.getText().toString();
              int o = Integer.parseInt(p) * Integer.parseInt(q);
              t1.setText("Answer: " + o );
          }
      });

      b4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String e = new String();
              e= e1.getText().toString();
              String f = new String();
              f=e2.getText().toString();
              int g = Integer.parseInt(e) / Integer.parseInt(f);
              t1.setText("Answer: " + g );
          }
      });
    }

}

