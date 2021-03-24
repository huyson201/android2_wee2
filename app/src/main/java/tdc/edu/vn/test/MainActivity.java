package tdc.edu.vn.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float num1, num2,kq,temp;
    private char operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView sreen = findViewById(R.id.txt_result_sreen);
        num1 = 0;
        num2 =0;
        kq = 0;
        temp = 0;
        operator = ' ';
        Button btn_1 = findViewById(R.id.num1);
        Button btn_2 = findViewById(R.id.num2);
        Button btn_3 = findViewById(R.id.num3);
        Button btn_4 = findViewById(R.id.num4);
        Button btn_5 = findViewById(R.id.num5);
        Button btn_6 = findViewById(R.id.num6);
        Button btn_7 = findViewById(R.id.num7);
        Button btn_8 = findViewById(R.id.num8);
        Button btn_9 = findViewById(R.id.num9);
        Button btn_0 = findViewById(R.id.num0);
        Button btn_c = findViewById(R.id.btn_c);
        Button btn_cong = findViewById(R.id.btn_cong);
        Button btn_tru = findViewById(R.id.btn_tru);
        Button btn_nhan = findViewById(R.id.btn_nhan);
        Button btn_chia = findViewById(R.id.btn_chia);
        Button btn_bang = findViewById(R.id.btn_bang);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"7");
            }
        });btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText(sreen.getText() +"9");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sreen.setText("0");
                num1 =num2 = 0;
                operator = ' ';
            }
        });
        btn_bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (operator =='+')
               {
                   kq= num1+num2;
                   sreen.setText( kq +"");
                   num1 = kq;
                   num2 =0;
               }else  if (operator =='-')
               {
                   kq= num1-num2;
                   sreen.setText( kq +"");
                   num1 = kq;
                   num2 =0;
               }
               else  if (operator =='*')
               {
                   kq= num1*num2;
                   sreen.setText( kq +"");
                   num1 = kq;
                   num2 =0;
               }
               else  if (operator =='/')
               {
                   kq= num1/num2;
                   sreen.setText( kq +"");
                   num1 = kq;
                   num2 =0;
               }
            }
        });




    }
}
