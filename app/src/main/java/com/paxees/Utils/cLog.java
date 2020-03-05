package com.paxees.Utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

import com.google.android.material.snackbar.Snackbar;


public class cLog {
    public static void Logs(Context context, String error, boolean isNoException, boolean isAlertBoxDialogBox, boolean isSnackBar) {
        //Todo: if there is no exception no alertbox show
        if (!isSnackBar && !isAlertBoxDialogBox && isNoException) {
            Log.d("ErrorException", " " + context.getClass().getSimpleName() + " = " +error);
        } else if (isAlertBoxDialogBox && !isNoException) {
            //Todo: if there is an exception & alertbox show
            Log.e("ErrorException", " " + context.getClass().getSimpleName() + " = " + error);
            showDialogBox(error, context);
        } else if (isSnackBar && !isNoException) {
            //Todo: if there is an exception & snackBar show
            Log.e("ErrorException", " " + context.getClass().getSimpleName() + " = " + error);
            showSnackBar(error, context);
        } else {
            //Todo: if there is an exception & only Log cat Show
            Log.e("ErrorException", " " + context.getClass().getSimpleName() + " = " + error);
        }
    }

    private static void showSnackBar(String msg, Context context) {
        Snackbar.make(((Activity) context).findViewById(android.R.id.content), msg + "\n" + " Something went worng, Please try again later", 5000).show();
    }

    private static void showDialogBox(String msg, Context context) {
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
