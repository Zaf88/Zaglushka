package com.example.zaglushka

import androidx.appcompat.app.AppCompatActivity

import android.webkit.WebSettings
import android.webkit.WebView




class MainActivity : AppCompatActivity() {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webView = (WebView) findViewById (R.id.webView);


//    WebView.setWebViewClient(new WebViewClient ())
//    WebSettings webSettings = webView . getSettings ();
//    webSettings.setJavaScriptEnabled(true);
//    WebView.loadUrl();

//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        webView = (WebView) findViewById (R.id.webView);
//
//
//    }
//}