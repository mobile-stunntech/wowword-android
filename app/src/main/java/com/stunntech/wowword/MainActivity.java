package com.stunntech.wowword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView buttonSettings;
    private ImageView buttonArchive;
    private CustomDialogForArchive mCustomDialogForArchive;
    private CustomDialogForSettings mCustomDialogForSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mCustomDialogForArchive = new CustomDialogForArchive(MainActivity.this);
        mCustomDialogForSettings = new CustomDialogForSettings(MainActivity.this);
        buttonSettings = (ImageView) findViewById(R.id.button_settings);
        buttonArchive = (ImageView) findViewById(R.id.button_archive);
        buttonSettings.setOnClickListener(this);
        buttonArchive.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button_settings:
                mCustomDialogForSettings.show();
                break;
            case R.id.button_archive:
                mCustomDialogForArchive.show();
                break;
        }

    }
}
