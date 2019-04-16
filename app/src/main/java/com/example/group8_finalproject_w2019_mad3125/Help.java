package com.example.group8_finalproject_w2019_mad3125;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.view.View;
import android.webkit.WebViewClient;

import java.io.IOException;
import java.io.InputStream;

public class Help extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        webView = findViewById(R.id.webView);

        WebViewClient mWebViewClient = new WebViewClient();

        AssetManager mAssetManager = this.getAssets();
        try
        {
            InputStream mInputStream = mAssetManager.open("Help.html");
            int size = mInputStream.available();
            byte[] buffer = new byte[size];
            mInputStream.read(buffer);
            mInputStream.close();
            String content = new String(buffer, "UTF-8");

            Log.d("DATA", content);
            webView.loadData(content, "text/html", "utf-8");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
