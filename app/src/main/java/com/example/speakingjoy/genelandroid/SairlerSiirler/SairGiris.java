package com.example.speakingjoy.genelandroid.SairlerSiirler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.speakingjoy.genelandroid.R;
import com.example.speakingjoy.genelandroid.SairlerSiirler.SairSiirler;

/**
 * Created by speakingJoy on 23.08.2016.
 */
public class SairGiris extends Activity {
    ListView list;
    final String[] Sairler={"Ahmet Arif","Cemal Süreya","Turgut Uyar","Özdemir Asaf","Arif Nihat Asya",
            "Cahit Sıtkı Tarancı","Mehmet Akif Ersoy","Yılmaz Güney","Orhan Seyfi Orhon","Orhan Veli Kanık","Karacaoğlan",
            "Aşık Veysel","Fuzuli","Nedim","Sabahattin Ali"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sair_giris);
        list = (ListView) findViewById(R.id.liste);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, Sairler);
        Intent intent;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Ahmet Arif
                        intent.putExtra("id", "0");
                        intent.putExtra("isim", "Ahmet Arif");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Cemal Süreya
                        intent.putExtra("id", "1");
                        intent.putExtra("isim", "Cemal Süreya");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Turgut Uyar
                        intent.putExtra("id", "1");
                        intent.putExtra("isim", "Turgut Uyar");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Özdemir Asaf
                        intent.putExtra("id", "3");
                        intent.putExtra("isim", "Özdemir Asaf");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Arif Nihat Asya
                        intent.putExtra("id", "4");
                        intent.putExtra("isim", "Arif Nihat Asya");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Cahit Sıtkı Tarancı
                        intent.putExtra("id", "5");
                        intent.putExtra("isim", "Cahit Sıtkı Tarancı");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Mehmet Akif Ersoy
                        intent.putExtra("id", "6");
                        intent.putExtra("isim", "Mehmet Akif Ersoy");
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Yılmaz Güney
                        intent.putExtra("id", "7");
                        intent.putExtra("isim", "Yılmaz Güney");
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Orhan Seyfi Orhon
                        intent.putExtra("id", "8");
                        intent.putExtra("isim", "Orhan Seyfi Orhon");
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Orhan Veli Kanık
                        intent.putExtra("id", "9");
                        intent.putExtra("isim", "Orhan Veli Kanık");
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Karacaoğlan
                        intent.putExtra("id", "10");
                        intent.putExtra("isim", "Karacaoğlan");
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Aşık Veyse
                        intent.putExtra("id", "11");
                        intent.putExtra("isim", "Aşık Veysel");
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Fuzuli
                        intent.putExtra("id", "12");
                        intent.putExtra("isim", "Fuzuli");
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Nedim
                        intent.putExtra("id", "13");
                        intent.putExtra("isim", "Nedim");
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(SairGiris.this, SairSiirler.class);//Sabahattin Ali
                        intent.putExtra("id", "14");
                        intent.putExtra("isim", "Sabahattin Ali");
                        startActivity(intent);
                        break;
                }
            }
        });
        list.setAdapter(adapter);

    }

    }
