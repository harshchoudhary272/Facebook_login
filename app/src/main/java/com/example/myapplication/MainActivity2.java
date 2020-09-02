package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    private WebView WebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView = (WebView) findViewById(R.id.webview);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://www.google.com");
        WebSettings WebSettings = WebView.getSettings();
        WebSettings.getJavaScriptEnabled(true);



    }

    @Override
    public void onBackPressed() {
        if(WebView.canGoBack()){
            WebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}