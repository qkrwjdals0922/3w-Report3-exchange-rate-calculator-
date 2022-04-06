package com.pjm0922;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    InputMethodManager manager;
    EditText hy;
    EditText gy;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        hy = (EditText) findViewById(R.id.Edit1);
        gy = (EditText) findViewById(R.id.Edit2);
        bt = (Button) findViewById(R.id.button1);
        TextView result11 = findViewById(R.id.result1);
        TextView result22 = findViewById(R.id.result2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.hideSoftInputFromWindow(hy.getWindowToken(), 0);
                String hy1 = hy.getText().toString();
                String gy1 = gy.getText().toString();

                if (hy1.equals("") || gy1.equals("")) {
                    Toast.makeText(MainActivity.this, "데이터를 입력", Toast.LENGTH_SHORT).show();
                } else {
                    double hy2 = Integer.parseInt(hy1);
                    int gy2 = Integer.parseInt(gy1);

                    int result = (int) Integer.parseInt(gy1) / Integer.parseInt(hy1);
                    result11.setText("환전 금액: " + result + " Dollar");
                }
            }
        });
    }
}