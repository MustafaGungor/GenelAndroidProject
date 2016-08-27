package com.example.speakingjoy.genelandroid.SairlerSiirler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.speakingjoy.genelandroid.R;
import com.example.speakingjoy.genelandroid.SairlerSiirler.SairSiir;

import java.util.ArrayList;

/**
 * Created by speakingJoy on 23.08.2016.
 */
public class SairSiirler extends Activity {
    ListView lise;
    final String[][] SairSiir_liste = {
            {"0", "Hasretinden Prangalar Eskittim"},   //0:Ahmet Arif
            {"0", "Karanfil Sokağı"},                  //1:Cemal Süreya
            {"0", "Akşam Erken İner Mahpushaneye"},    //2:Turgut Uyar
            {"0", "Anadolu"},                          //3:Özdemir Asaf
            {"0", "OtuzÜç Kurşun"},                    //4:Arif Nihat Asya
            {"0", "Ağlamak"},                          //5:Cahit Sıtkı Tarancı
            {"0","Ay Karanlık"},                       //6:Mehmet Akif Ersoy
            {"0", "Haberin Var mı?"},                  //7:Yılmaz Güney
            {"0", "Tutuklu"},                          //8:Orhan Seyfi Orhon
            {"0", "Unutamadığım"},                     //9:Orhan Veli Kanık
            {"1","Kesik"},                             //10:Karacaoğlan
            {"1","Çekirge Bulutu"},                    //11:Aşık Veysel
            {"1","Az Yaşadıksak da"},                  //12:Fuzuli
            {"1", "Aşk"},                              //13:Nedim
            {"1", "Balzamin"},                         //14:Sabahattin Ali
            {"1", "Yazmam Daha Aşk Şiiri"},
            {"1", "Camdan"},
            {"1", "Afrika"},
            {"1", "Gül"},
            {"1", "Turgut Uyar"},
            {"2", "Acıyor"},
            {"2", "Palyaço"},
            {"2", "Senfoni"},
            {"2", "Baharı Bekleyene"},
            {"2", "Hızla Gelişecek Kalbimiz"},
            {"2", "Akşam Üstü Rüyası"},
            {"2", "Arz-ı Hal"},
            {"2", "Binlerce"},
            {"2", "Kan Uyku"},
            {"3", "Bir Şeyin Adı"},
            {"3", "Düello"},
            {"3", "Duygusal"},
            {"3", "An"},
            {"3", "Durak"},
            {"3", "Mum Alevi ile Oynayan Kedinin Öyküsü"},
            {"3", "Masa"},
            {"3", "Kelimeler"},
            {"4", "Bayrak"},
            {"4", "Fetih Marşı"},
            {"4", "Seni"},
            {"4", "Dağlar"},
            {"4", "Kanatlar"},
            {"4", "Mavi"},
            {"4", "Tanrıya Sesleniş"},
            {"4", "Ağıt"},
            {"4", "Tanımadı"},
            {"5", "Abbas"},
            {"5", "Otuz Beş Yaş"},
            {"5", "Desem ki"},
            {"5", "Memleket İsterim"},
            {"5","Bir Umut"},
            {"5", "Karasevda"},
            {"5", "Yalnızlık"},
            {"5", "Esmer Güzeli Yarim"},
            {"5", "İnsanoğlu"},
            {"5", "Her gecemi bir Uykusuzluk"},
            {"6", "Ey Yolcu"},
            {"6", "Zulmü Alkışlayamam"},
            {"6", "Kıssadan Hisse"},
            {"6", "Çanakkale Şehitlerine"},
            {"6", "Mahalle Kahvesi"},
            {"6", "Bülbül"},
            {"6", "Cenk Marşı"},
            {"6", "Şeytan"},
            {"6", "Hüsran"},
            {"7", "Mutlu Olma Şansı"},
            {"7", "Canım, Sevdiğim, Yüreğim"},
            {"7", "Canım"},
            {"7", "Köprü"},
            {"7", "Bir Gün"},
            {"7", "Eskiden Bilmezdim Yalnızlığı"},
            {"8", "Gönlüm"},
            {"8", "Diyorlar"},
            {"8", "O Beyaz Bir Kuştu"},
            {"8", "Vedaa"},
            {"8", "Annemle Hasbihal"},
            {"8", "Maniler"},
            {"9", "Dağ Başı"},
            {"9", "Ah! Neydi Benim Gençliğim"},
            {"9", "Baharın İlk Sabahları"},
            {"9", "Derdim Başka"},
            {"10", "İncecikten Bir Kar Yağar"},
            {"10", "Kadir Mevlam Senden Bir Dileğim Var"},
            {"10", "Bir Ayrılık Bir Yoksulluk Bir Ölüm"},
            {"10", "Nazlı Yardan Geldi Bana Bir Name"},
            {"10", "Yeşil Başlı Gövel Ördek"},
            {"10", "Viran Oldum mor Sümbüllü Bağ İken"},
            {"10", "Yürü Bre Yalan Dünya"},
            {"10", "Aşam Dedim Karlı Dağlar Başından"},
            {"10", "Ala Gözlerini Sevdiğim Dilber"},
            {"11", "Kara Toprak"},
            {"11", "Ağlar Veysel Çıkmaz Sesi"},
            {"11", "Deli Gönül Deyme Canda Bulunmaz"},
            {"11", "Sen Bir Çiçek Olsan Ben Bir Yaz Olsam"},
            {"11", "Memlekete Destan Oldum"},
            {"11", "Gönül Sana Nasihatım"},
            {"11", "Dalgın Dalgın Seyreyledim Alemi"},
            {"11", "Mecnun gibi dolanıyorum çöllerde"},
            {"11", "İşde Hiyle Sözde Yalan Olmasa"},
            {"11", "Beni Hor Görme Kasrdeşim"},
            {"12", "Canı Kim Cananı Kim"},
            {"12", "Su Kasidesi"},
            {"12", "Beni Candan Usandırdı"},
            {"12", "Gazel1"},
            {"13", "Bercesteler"},
            {"13", "Rubai"},
            {"13", "İstanbul Kasidesi"},
            {"13", "Tahammül Mülkünü Yıktın"},
            {"13", "Müstezad"},
            {"13", "Haddeden Geçmiş Nezaket"},
            {"14", "Acaba"},
            {"14", "Hapishane Şarkısı"},
            {"14", "Çakır"},
            {"14", "Öyle Günler Gördüm ki"}


    };
    Button buton;
    protected void onCreate(Bundle savedInstanceState){
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sair_siirler);
            lise = (ListView) findViewById(R.id.liste_siirler);
            String gelenid = getIntent().getExtras().getString("id");
            int gelenn = Integer.valueOf(gelenid); //intentten gelen putextra alındı
            String butonbaslik=getIntent().getExtras().getString("isim");
            final ArrayList<String> asd=new ArrayList<>(); //ArrayList tanımlanarak yeni bir dizi oluşturuldu
            for (int i = 0; i < SairSiir_liste.length; i++) {
                int s = Integer.valueOf(SairSiir_liste[i][0]);  //String ifade integer a çevrilerek karşılaştırılma yapıldı
                if (s == gelenn) {
                    asd.add(SairSiir_liste[i][1]);   //ArrayList asd dizisine karşılaştırılan elemanlar eklendi
                    //// sonuc[i] = SairSiir_liste[i][1];
                }
            }
            buton=(Button)findViewById(R.id.butonust);
            buton.setText(butonbaslik);

            final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, asd);//ArrayAdapter a asd ArrayList eklendi


            lise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent;
                    switch (i) {
                        case 0:
                            intent = new Intent(SairSiirler.this, SairSiir.class); //Şiirler asd.get(i) olarak gönderildi
                            intent.putExtra("id", asd.get(i));
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 3:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 4:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 6:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;
                        case 7:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;
                        case 8:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;
                        case 9:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;
                        case 10:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;
                        case 11:
                            intent = new Intent(SairSiirler.this, SairSiir.class);
                            intent.putExtra("id",asd.get(i));
                            startActivity(intent);
                            break;

                    }
                }
            });
            lise.setAdapter(adapter1); //Adapter set edilerek listelendi


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
