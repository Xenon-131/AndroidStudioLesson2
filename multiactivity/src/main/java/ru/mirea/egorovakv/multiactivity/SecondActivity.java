package ru.mirea.egorovakv.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private String TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = (String) getIntent().getSerializableExtra("key");
        textView = findViewById(R.id.textView);
        textView.setText(text);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Invoke onStart method (secondActivity)");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Invoke onRestoreInstanceState method (secondActivity)");
        //String text = savedInstanceState.getString("data_value");
        //editText.setText(text);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "Invoke onPostCreate method (secondActivity)");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Invoke onResume method (secondActivity)");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "Invoke onPostResume method (secondActivity)");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "Invoke onAttachedToWindow method (secondActivity)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Invoke onPause method (secondActivity)");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Invoke onSaveInstanceState method (secondActivity)");
        //outState.putString("data_value", editText.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Invoke onStop method (secondActivity)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Invoke onDestroy method (secondActivity)");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "Invoke onDetachedFromWindow method (secondActivity)");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Invoke onRestart method (secondActivity)");
    }
}