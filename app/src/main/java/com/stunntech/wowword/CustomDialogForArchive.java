package com.stunntech.wowword;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by sasank on 14/8/18.
 */

public class CustomDialogForArchive extends AppCompatDialog implements View.OnClickListener {

    public Activity activity;
    private ImageView imageWindowClose;


    public CustomDialogForArchive(Activity activity) {
        super(activity);
        this.activity = activity;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_custom_dialog_archive);
        imageWindowClose = (ImageView) findViewById(R.id.button_close);
        imageWindowClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_close:
                dismiss();
                break;
        }
    }


}

