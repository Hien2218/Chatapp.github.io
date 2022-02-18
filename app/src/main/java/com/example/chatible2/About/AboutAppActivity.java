package com.example.chatible2.About;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chatible2.R;

import javax.security.auth.callback.Callback;

public class AboutAppActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    LinearLayout avt_hien, avt_hoai, avt_hoang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);

        // Set Home Activity Toolbar Name
        mToolbar = findViewById(R.id.about_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Thông tin về App");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        avt_hien = findViewById(R.id.avt_hienn);
        avt_hoai = findViewById(R.id.avt_hoaii);
        avt_hoang = findViewById(R.id.avt_hoangg);


        avt_hien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView myWebView = (WebView) findViewById(R.id.webview);
                myWebView.loadUrl("http://www.example.com");
            }


        });

        avt_hoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // gotoURL("https://www.facebook.com/congai.tinhyeu.52");
            }


        });

        avt_hoang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gotoURL("https://www.facebook.com/profile.php?id=100009640504363");
            }


        });
    }


}
