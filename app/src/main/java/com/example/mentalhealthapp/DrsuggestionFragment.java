package com.example.mentalhealthapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DrsuggestionFragment extends Fragment {

    WebView wv;
    private String webUrl="https://www.google.co.in/maps/search/mental+health+doctors/";

    public DrsuggestionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_drsuggestion, container, false);

        wv=(WebView)v.findViewById(R.id.wvvideo);
        wv.loadUrl(webUrl);
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });


        return v;
    }
}