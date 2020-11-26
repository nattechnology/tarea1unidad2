package com.example.widgetweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView url;
    EditText tur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (WebView) findViewById(R.id.WebUrl);
        tur = (EditText) findViewById(R.id.txtUrl);
    }

    public void buscar (View view){
        String ur = tur.getText().toString();
        url.loadUrl(ur);
        tur.setText(" ");
    }
}