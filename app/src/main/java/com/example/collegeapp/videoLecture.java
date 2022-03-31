package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.collegeapp.databinding.ActivityWebViewBinding;

public class videoLecture extends AppCompatActivity {

    private ActivityWebViewBinding webViewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_lecture);

        webViewBinding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(webViewBinding.getRoot());

        android.webkit.WebView webView = webViewBinding.webView;

        webView.loadUrl("https://www.youtube.com/playlist?list=PLWz5rJ2EKKc_T0fSZc9obnmnWcjvmJdw_");



    }
}