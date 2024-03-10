package com.nirajbava.inews.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.nirajbava.inews.R;
import com.nirajbava.inews.WebViewController;
import com.nirajbava.inews.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_gallery, container, false);
        WebView webView = root.findViewById(R.id.webViewABPMAJHA);
        webView.loadUrl("https://marathi.abplive.com");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}