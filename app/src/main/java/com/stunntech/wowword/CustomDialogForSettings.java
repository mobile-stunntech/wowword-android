package com.stunntech.wowword;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by sasank on 19/1/18.
 */

public class CustomDialogForSettings extends AppCompatDialog implements View.OnClickListener {

    public Activity activity;
    private ImageView imageSocial;
    private ImageView imageHelp;
    private ImageView imageWebsite;
    private ImageView imageVoiceOver;
    private ImageView imageEmail;
    private ImageView imageWindowClose;
    private CustomDialogForSocialMedia mCustomDialogForSocialMedia;


    public CustomDialogForSettings(Activity activity) {
        super(activity);
        this.activity = activity;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_custom_dialog_settings);
        mCustomDialogForSocialMedia = new CustomDialogForSocialMedia(activity);

        imageHelp = (ImageView) findViewById(R.id.icon_help);
        imageWebsite = (ImageView) findViewById(R.id.icon_website);
        imageSocial = (ImageView) findViewById(R.id.icon_social);
        imageVoiceOver = (ImageView) findViewById(R.id.icon_voice_over);
        imageEmail = (ImageView) findViewById(R.id.icon_email);
        imageWindowClose = (ImageView) findViewById(R.id.button_close);
        imageSocial.setOnClickListener(this);
        imageWindowClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.icon_social:
                mCustomDialogForSocialMedia.show();
                dismiss();
                break;
            case R.id.button_close:
                dismiss();
                break;

        }
    }


}


