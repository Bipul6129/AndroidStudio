package com.android.asianpay.frags;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialgoC extends DialogFragment {
    public static final String TAG = "DialgoC";
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext()).setMessage("Hello").setPositiveButton("Ok",((dialogInterface, i) -> {})).create();
    }
}
