package com.example.extra1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAge;
    private Button buttonDisplayAge;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAge = findViewById(R.id.editTextAge);
        buttonDisplayAge = findViewById(R.id.buttonDisplayAge);
        textViewResult = findViewById(R.id.textViewResult);

        buttonDisplayAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageStr = editTextAge.getText().toString();
                if (!ageStr.isEmpty()) {
                    int age = Integer.parseInt(ageStr);
                    Women women = new Women(age);
                    textViewResult.setText("Возраст женщины: " + women.getAge());
                } else {
                    textViewResult.setText("Введите возраст.");
                }
            }
        });
    }
}