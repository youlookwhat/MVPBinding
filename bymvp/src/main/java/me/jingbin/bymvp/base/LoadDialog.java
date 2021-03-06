package me.jingbin.bymvp.base;

import android.app.Dialog;
import android.content.Context;

import me.jingbin.mvpbinding.R;


/**
 * @author jingbin
 */
public class LoadDialog {

    public static Dialog buildDialog(Context context) {
        Dialog progressDialog = new Dialog(context, R.style.CustomProgressDialog);
        progressDialog.setContentView(R.layout.base_loading_progress);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
