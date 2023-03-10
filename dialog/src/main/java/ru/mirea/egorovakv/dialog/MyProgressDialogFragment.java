package ru.mirea.egorovakv.dialog;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("My Progress Dialog");
        progressDialog.setMessage("Its loading....");
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "Ok",
                new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which){
                ((MainActivity)getActivity()).onProgressOkClicked();
            }
        });

        return progressDialog;
    }
}
