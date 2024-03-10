package com.nirajbava.inews.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.nirajbava.inews.R;
import com.nirajbava.inews.WebViewController;


public class NDTVFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_n_d_t_v, container, false);
        WebView webView = root.findViewById(R.id.webViewNDTV);
        webView.loadUrl("https://ndtv.in");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}