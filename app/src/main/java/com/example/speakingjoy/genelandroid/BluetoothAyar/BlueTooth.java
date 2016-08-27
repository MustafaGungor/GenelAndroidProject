package com.example.speakingjoy.genelandroid.BluetoothAyar;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.speakingjoy.genelandroid.R;

/**
 * Created by speakingJoy on 22.08.2016.
 */
public class BlueTooth extends Activity{
    Button ac,gorunurYap,kapat;
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.bluetooth);
        ac=(Button)findViewById(R.id.btnAc);
        gorunurYap=(Button)findViewById(R.id.btnGor);
        kapat=(Button)findViewById(R.id.btnKapat);
        final BluetoothAdapter bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bluetoothAdapter==null){
                    Toast.makeText(getApplicationContext(),"Bluetooth Aygıtı bulunamadı",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(!bluetoothAdapter.isEnabled()){
                        Intent bluetoothBaslat=new Intent(bluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(bluetoothBaslat,1);
                        Toast.makeText(getApplicationContext(),"Bluetooth Açıldı",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        gorunurYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gorunurYap = new Intent (bluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);

                startActivityForResult(gorunurYap,1);
                Toast.makeText(getApplicationContext(),"Bluettoh cihazı görünür hale getirildi.",Toast.LENGTH_SHORT).show();

            }
        });
        kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bluetoothAdapter.isEnabled()){
                    bluetoothAdapter.disable();
                    Toast.makeText(getApplicationContext(),"Bluetooth Aygıtı Kapatıldı",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}
