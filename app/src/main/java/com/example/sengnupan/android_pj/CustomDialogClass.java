package com.example.sengnupan.android_pj;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CustomDialogClass extends Dialog implements android.view.View.OnClickListener {
    public AppCompatActivity c;
    public Dialog d;
    public Button set, change;
    public EditText username;
    public RadioButton male, female;

    public CustomDialogClass(AppCompatActivity a) {
        super(a);
        this.c = a;

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.profile);
        set = (Button) findViewById(R.id.set);
        change = (Button) findViewById(R.id.change);
        username = (EditText) findViewById(R.id.username);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);

        set.setOnClickListener(this);
        change.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.set:
             //   if()
                    break;
            case R.id.change:
            dismiss();

                break;
            default:
                break;
        }
        dismiss();
    }
}