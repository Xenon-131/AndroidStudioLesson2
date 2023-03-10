package ru.mirea.egorovakv.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendDataToSecondActivity(View view){
        Intent secondIntent = new Intent(MainActivity.this, SecondActivity.class);
        secondIntent.putExtra("key", "MIREA - Егорова Ксения Витальевна");
        startActivity(secondIntent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Invoke onStart method");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Invoke onRestoreInstanceState method");
        //String text = savedInstanceState.getString("data_value");
        //editText.setText(text);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "Invoke onPostCreate method");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Invoke onResume method");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "Invoke onPostResume method");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "Invoke onAttachedToWindow method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Invoke onPause method");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Invoke onSaveInstanceState method");
        //outState.putString("data_value", editText.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Invoke onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Invoke onDestroy method");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "Invoke onDetachedFromWindow method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Invoke onRestart method");
    }

}