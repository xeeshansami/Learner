package com.paxees.Utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.Toast;

public class cLog {
    public static void Logs(Context context,String msg,Boolean isAlertDiaglogBoxShow){
        Log.e("ExceptionError"," "+context.getClass().getSimpleName()+" = "+msg);
        if(isAlertDiaglogBoxShow){
            showDialogBox(msg,context);
        }
    }

    private static void showDialogBox(String msg,Context context) {
        new AlertDialog.Builder(context)
                .setCancelable(false)
                .setTitle("Error")
                .setMessage(msg)

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton("Send Feeback", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

}
