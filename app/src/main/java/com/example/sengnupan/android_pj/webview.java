package com.example.sengnupan.android_pj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class webview extends AppCompatActivity {
    public WebView web;
    public Bundle bdn;
    public String address;
    public String webaddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        web=(WebView)findViewById(R.id.webview);
        bdn=new Bundle();
        bdn=getIntent().getExtras();
        webaddress=bdn.getString("hhh");
        web.getSettings().setJavaScriptEnabled(true);
        if(webaddress.equals("www.martersolutions.com")){
            address="https://www.martersolutions.com";
        }
        else if(webaddress.equals("www.acromyanmar.com")){
            address="https://www.acromyanmar.com";
        }
        else if(webaddress.equals("www.softwaremyanmar.com")){
            address="https://www.softwaremyanmar.com";
        }
        else if(webaddress.equals("www.signalbase.co.jp")){
            address="https://www.signalbase.co.jp";
        }
        else if(webaddress.equals("www.orientitsolution.com")){
            address="https://www.orientitsolution.com";
        }
        else if(webaddress.equals("www.umsqueen.com.mm")){
            address="https://www.umsqueen.com.mm";
        }else if(webaddress.equals("www.gicjp.com")){
            address="https://www.gicjp.com";
        }else if(webaddress.equals("www.tworksystem.com")){
            address="https://www.tworksystem.com";
        }else if(webaddress.equals("www.galaxy.com.mm")){
            address="https://www.galaxy.com.mm";
        }else if(webaddress.equals("www.isgm2.com")){
            address="https://www.isgm2.com";
        }else if(webaddress.equals("www.nex4.net")){
            address="https://www.nex4.net";
        }else if(webaddress.equals("www.hqsco.com")){
            address="https://www.hqsco.com";
        }else if(webaddress.equals("www.myanmardcr.com")){
            address="https://www.myanmardcr.com";
        }else if(webaddress.equals("www.rig-info.com")){
            address="https://www.rig-info.com";
        }else if(webaddress.equals("www.360ed.org")){
            address="https://www.360ed.org";
        }else if(webaddress.equals("www.nttdata.com.mm")){
            address="https://www.nttdata.com.mm";
        }
        else if(webaddress.equals("www.mspiral.com")){
            address="https://www.mspiral.com";
        }
        else if(webaddress.equals("www.ahtaroo.com")){
            address="https://www.ahtaroo.com";
        }
        else if(webaddress.equals("www.asiabrightway.com")){
            address="https://www.asiabrightway.com";
        }

        web.loadUrl(address);
        // web.loadUrl("http://www.google.com");
    }
}
