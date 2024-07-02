package com.bindu.tcpc;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebViewController extends WebViewClient
{

    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String url = view.getContext().getString(R.string.web_url);
        if(url.equals(request.getUrl().getHost()))
        {
            return false;
        }
        if(request.getUrl().toString().contains("gmail"))
        {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, request.getUrl());
        view.getContext().startActivity(intent);
        return true;
    }
}
