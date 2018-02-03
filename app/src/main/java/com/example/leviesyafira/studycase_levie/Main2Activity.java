package com.example.leviesyafira.studycase_levie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView p,q,r,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        p = (TextView) findViewById(R.id.restaurant);
        q = (TextView) findViewById(R.id.makanan);
        r = (TextView) findViewById(R.id.jumlah);
        s = (TextView) findViewById(R.id.total);

        if (getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            p.setText(bundle.getString("restaurant"));
            q.setText(bundle.getString("makanan"));
            r.setText(bundle.getString("jumlah"));
            s.setText(bundle.getString("total"));
        }
        else{
            p.setText(getIntent().getStringExtra("restaurant"));
            q.setText(getIntent().getStringExtra("makanan"));
            r.setText(getIntent().getStringExtra("jumlah"));
            s.setText(getIntent().getStringExtra("total"));
        }

    }
}
