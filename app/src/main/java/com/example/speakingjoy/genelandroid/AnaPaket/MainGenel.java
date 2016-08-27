package com.example.speakingjoy.genelandroid.AnaPaket;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.speakingjoy.genelandroid.BluetoothAyar.BlueTooth;
import com.example.speakingjoy.genelandroid.Fener.Fener;
import com.example.speakingjoy.genelandroid.MediaPlayer.Music;
import com.example.speakingjoy.genelandroid.Php.PhpMysql;
import com.example.speakingjoy.genelandroid.SairlerSiirler.SairGiris;
import com.example.speakingjoy.genelandroid.WebkitBrowser.Webkit;

import com.example.speakingjoy.genelandroid.R;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

public class MainGenel extends AppCompatActivity {
    Button bluetooth,phpmysql,webkitBtn;
    ListView liste;
    public String calisma[]={"Bluetooth Çalışması","PhpMysql Bağlantısı","Webkit Çalışması","Media Player",
            "Sairler ve Şiirleri","El Feneri","Yemek Tarifleri","Yunus Emre'den Kesitler"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_genel);
        liste=(ListView)findViewById(R.id.anaList);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_activated_1,android.R.id.text1,calisma)
        {
            //Listview İçindeki yazı rengini değiştirmek için kullanılıyor
            @Override
            public View getView(int position, View convertView, ViewGroup parent){

                View view = super.getView(position, convertView, parent);

                TextView ListItemShow = (TextView) view.findViewById(android.R.id.text1);

                ListItemShow.setTextColor(Color.parseColor("#fe00fb"));

                return view;
            }

        };

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){

                    case 0:
                        intent=new Intent(MainGenel.this, BlueTooth.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent=new Intent(MainGenel.this,PhpMysql.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(MainGenel.this,Webkit.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(MainGenel.this, Music.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(MainGenel.this, SairGiris.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(MainGenel.this, Fener.class);
                        startActivity(intent);
                        break;
                }
            }
        });
        liste.setAdapter(adapter);


    }
}
