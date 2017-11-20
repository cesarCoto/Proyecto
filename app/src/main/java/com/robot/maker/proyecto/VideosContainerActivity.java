package com.robot.maker.proyecto;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;
/*CREADO POR CESAR COTO, JOSE COUTIÑO*/
public class VideosContainerActivity extends AppCompatActivity {

    WebView webViewVideos;
    ImageView imageViewNoConexicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_container);

        webViewVideos =findViewById(R.id.webview_videos_container);
        imageViewNoConexicon = findViewById(R.id.imageView_videos_no_conexion);

        //boton ir atras
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //se verifica la conexicion
        ConnectivityManager connectivityManager =(ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (networkInfo.isConnected()){
            Bundle bundle = getIntent().getExtras();
            String data = bundle.getString("page");
            webViewVideos.setWebViewClient(new WebViewClient());
            WebSettings webSettings = webViewVideos.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webViewVideos.loadUrl(data);
        }else{
            webViewVideos.setVisibility(View.GONE);
            imageViewNoConexicon.setVisibility(View.VISIBLE);
            Toast.makeText(this, getString(R.string.no_hay_conexcion), Toast.LENGTH_SHORT).show();
        }


    }
}
