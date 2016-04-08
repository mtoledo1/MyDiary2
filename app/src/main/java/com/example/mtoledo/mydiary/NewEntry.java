package com.example.mtoledo.mydiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class NewEntry extends AppCompatActivity {
    public String Entry;
    EditText txtPassword;
    private String diaryPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
        txtPassword = (EditText) findViewById(R.id.txtFldEntry);
        diaryPass = getIntent().getStringExtra("Password");
    }
    public void GoToDiary(){
        Entry = txtPassword.getText().toString();

    }
}
