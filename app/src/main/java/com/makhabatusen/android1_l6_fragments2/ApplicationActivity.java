package com.makhabatusen.android1_l6_fragments2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ApplicationActivity extends AppCompatActivity {

    private EditText etTitle;
    private EditText etDesc;
    private Button btnSave;


    static final String KEY = "key1";
    static final String KEY2 = "key2";
    static final String KEY3 = "key3";

    // with Image



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        init();
    }

    private void init() {
        etTitle = findViewById(R.id.et_title);
        etDesc = findViewById(R.id.et_desc);
        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(view -> {
         Intent intent = new Intent(ApplicationActivity.this, MainActivity.class);
         intent.putExtra(KEY, etTitle.getText().toString());
         intent.putExtra(KEY2, etDesc.getText().toString());
         intent.putExtra(KEY3, R.drawable.ic_baseline_account_circle_24);
         startActivity(intent);
        });
    }

}