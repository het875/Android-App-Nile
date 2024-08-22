//package com.example.myapplication.ui.request_summary;
//
//import androidx.lifecycle.ViewModelProvider;
//
//import android.os.Bundle;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.myapplication.R;
//
//public class request_summary extends Fragment {
//
//    private RequestSummaryViewModel mViewModel;
//
//    public static request_summary newInstance() {
//        return new request_summary();
//    }
//
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_request_summary, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(RequestSummaryViewModel.class);
//        // TODO: Use the ViewModel
//    }
//
//}

package com.example.myapplication.ui.request_summary;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.databinding.FragmentSlideshowBinding;


public class Request_Summary_Fragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RequestSummaryViewModel requestSummaryViewModel =
                new ViewModelProvider(this).get(RequestSummaryViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Setup the TextView with the ViewModel

        // Setup the WebView
        WebView webView = binding.webView;
        webView.setWebViewClient(new WebViewClient()); // To open links in the WebView itself
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if needed
//        webView.loadUrl("https://www.google.co.in/");
        webView.loadUrl("file:///android_asset/index.html");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

