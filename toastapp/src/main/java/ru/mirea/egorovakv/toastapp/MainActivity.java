package ru.mirea.egorovakv.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowToastButtonClick(View view){
        editText = findViewById(R.id.editText);
        int count = editText.getText().length();

        Toast toast = Toast.makeText(getApplicationContext(),
                String.format("СТУДЕНТ No 11 ГРУППА БСБО-01-20 Количество символов - %s", count),
                Toast.LENGTH_SHORT);
        toast.show();
    }




}