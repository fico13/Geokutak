package com.filipidulac.projekat;

import androidx.appcompat.widget.AppCompatButton;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabelaActivity extends ListActivity {
    AppCompatButton pokreniNoviKviz;

    ArrayList<Map<String,?>> stavke;
    ListView lista;

    ArrayList<Igrac> pomocna = new ArrayList<>();
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);

        pokreniNoviKviz = findViewById(R.id.pokreniNoviKviz);

        lista = getListView();

        db = new DBHelper(this);

        final Button obrisi = findViewById(R.id.brisanje);




        pokreniNoviKviz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TabelaActivity.this, GlavniMeni.class));
                finish();
            }

        });

        obrisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.obrisiSve();
                setujListu();
                Toast.makeText(TabelaActivity.this, "Obrisali ste sve podatke iz tabele", Toast.LENGTH_SHORT).show();
            }

        });

    }

    protected void onStart() {
        super.onStart();
        setujListu();
    }

    private ArrayList<Map<String,?>> napuniListu() {

        pomocna = db.prikaziPodatke();
        ArrayList<Map<String, ?>> result = new ArrayList<>();
        for (int i = 0; i < pomocna.size(); i++) {
            Map stavka = new HashMap();
            stavka.put("ime", pomocna.get(i).getIme());
            stavka.put("datum", pomocna.get(i).getDatum());
            stavka.put("brojPoena", pomocna.get(i).getBrojPoena());
            result.add(stavka);
        }
        return result;
    }

    public void setujListu(){
        stavke = napuniListu();
        SimpleAdapter adapter = new SimpleAdapter(this, stavke, R.layout.list_item,
                new String[]{"ime","datum", "brojPoena"},
                new int[]{R.id.textView1,R.id.textView2, R.id.textView3});

        lista.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(TabelaActivity.this, GlavniMeni.class));
        finish();
    }


}