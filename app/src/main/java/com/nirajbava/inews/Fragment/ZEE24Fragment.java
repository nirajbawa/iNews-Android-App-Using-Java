package com.nirajbava.inews.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.nirajbava.inews.R;
import com.nirajbava.inews.WebViewController;

public class ZEE24Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_zee, container, false);
        WebView webView = root.findViewById(R.id.webViewZEE24);
        webView.loadUrl("https://zeenews.india.com/marathi");
        webView.setWebViewClient(new WebViewController());
        return  root;
    }
}