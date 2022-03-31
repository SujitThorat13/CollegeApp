package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.collegeapp.databinding.ActivityWebViewBinding;


public class WebView extends AppCompatActivity {

    private ActivityWebViewBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        dataBinding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(dataBinding.getRoot());

        android.webkit.WebView webView = dataBinding.webView;

        webView.loadUrl("https://www.mctrgit.ac.in/");
    }
}