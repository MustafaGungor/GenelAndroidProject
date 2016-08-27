package com.example.speakingjoy.genelandroid.WebkitBrowser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.example.speakingjoy.genelandroid.R;

/**
 * Created by speakingJoy on 22.08.2016.
 */
public class Webkit extends Activity{

    WebView webView;

    public void onCreate(Bundle web){
        super.onCreate(web);
        setContentView(R.layout.webkit);

        webView=(WebView)findViewById(R.id.webview1);
        webView.loadUrl("http:www.mustafagungor.xyz");
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
