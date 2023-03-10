package ru.mirea.egorovakv.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    View thisView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }



    public void showSnackbar(View view, String text){
        Snackbar mySnackbar = Snackbar.make(view, text, Snackbar.LENGTH_SHORT);
        mySnackbar.show();
    }

    public void onClickShowTimePickerDialog(View view) {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
        timeDialogFragment.show(getSupportFragmentManager(), "timePickerDialog");
    }
    public void onTimeOkClicked(int hour) {
        String text = String.format("You have picked this hour:  %s.", hour);
        showSnackbar(findViewById(android.R.id.content), text);
    }

    public void onClickShowDatePickerDialog(View view) {
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "datePickerDialog");
    }
    public void onDateOkClicked(int year, int month, int day) {
        String text = String.format("You have picked this date:  %1$s. %2$s. %3$s.", year, month+1, day);
        showSnackbar(findViewById(android.R.id.content), text);
    }

    public void onClickShowProgressDialog(View view) {
        MyProgressDialogFragment progressDialogFragment = new MyProgressDialogFragment();
        progressDialogFragment.show(getSupportFragmentManager(), "progressDialog");
    }

    public void onProgressOkClicked() {
        String text = "You have clicked Ok button inside ProgressDialog";
        showSnackbar(findViewById(android.R.id.content), text);
    }

}