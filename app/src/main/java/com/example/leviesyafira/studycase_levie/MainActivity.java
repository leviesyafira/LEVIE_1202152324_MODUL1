package com.example.leviesyafira.studycase_levie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText daftarmenu,jumlahpesan;
    private Button restaurant1, restauran2;
    private TextView pilihtempat;

    private int uang = 65500;
    private int jumlahuang,hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daftarmenu = (EditText) findViewById(R.id.list);
        jumlahpesan = (EditText) findViewById(R.id.jumlah);

        restaurant1 = (Button) findViewById(R.id.eatbus);
        restauran2 = (Button) findViewById(R.id.abnormal);
    }
    public void launcheatbus (View view){
        String menu = daftarmenu.getText().toString();
        String jumlah = jumlahpesan.getText().toString();
        jumlahuang = Integer.parseInt(jumlah.trim());

        hasil = jumlahuang * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu",menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(hasil));
        bundle.putString("Restaurant","Eatbus");
        Intent a = new Intent(this,Main2Activity.class);
        a.putExtras(bundle);
        startActivity(a);

        if (hasil > uang){
            Toast.makeText(this,"Uang kamu tidak cukup. Ganti Restaurant",Toast.LENGTH_LONG).show();
        }

    }
    public void launchabnormal(View view){
        String menu = daftarmenu.getText().toString();
        String jumlah = jumlahpesan.getText().toString();
        jumlahuang = Integer.parseInt(jumlah.trim());

        hasil = jumlahuang * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu",menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(hasil));
        bundle.putString("Restaurant","Abnormal");
        Intent a = new Intent(this,Main2Activity.class);
        a.putExtras(bundle);
        startActivity(a);

        if (hasil < uang){
            Toast.makeText(this,"Uang kamu cukup, bisa makan di restaurant ini",Toast.LENGTH_LONG).show();
        }

    }
}
