package com.example.finalclc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Bpoint,Bequ,Badd,Bsub,Bmul,Bdiv,Bmod,BAC,BDEL,Broot;
    boolean add,sub,mul,div,mod;
    double var1,var2;
    TextView ans,ans2;
    String del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
