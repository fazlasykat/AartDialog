package com.example.laptop.aartdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.exitButtonId);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setPositiveButton(R.string.positive_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();

            }
        });

        alertDialogBuilder.setNegativeButton(R.string.negative_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this,"You have clicked Negative Button",Toast.LENGTH_SHORT).show();

            }
        });

        alertDialogBuilder.setMessage(R.string.massage_text);
        alertDialogBuilder.setNeutralButton(R.string.newtral_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this,"You have Clicked Neutral Button",Toast.LENGTH_SHORT).show();


            }
        });

        alertDialogBuilder.setIcon(R.drawable.alarm);

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
