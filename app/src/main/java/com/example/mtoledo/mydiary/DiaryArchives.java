package com.example.mtoledo.mydiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DiaryArchives extends AppCompatActivity {
    private String DiaryEntry;
    private String IncomingEntry;
    private int logNum;
    public EditText edtxtGetPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_archives);
    }
}
