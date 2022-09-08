package com.filipidulac.projekat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RezultatiKviza extends AppCompatActivity {

    DBHelper db;
    EditText imeIgraca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultati_kviza);

        final AppCompatButton pogledNaTabelu = findViewById(R.id.pogledNaTabelu);
        final TextView tacniOdgovori = findViewById(R.id.tacniOdgovori);
        final TextView netacniOdgovori = findViewById(R.id.netacniOdgovori);
        final TextView ukupnoPoena = findViewById(R.id.ukupnoPoena);
        imeIgraca = findViewById(R.id.imeIgraca);

        final int vratiBrojTacnihOdgovora = getIntent().getIntExtra("correct",0);
        final int vratiBrojNetacnihOdgovora = getIntent().getIntExtra("incorrect",0);
        final int poeni = vratiBrojTacnihOdgovora - vratiBrojNetacnihOdgovora;

        tacniOdgovori.setText("Broj poena ostvaren na tačnim pitanjima "+String.valueOf(vratiBrojTacnihOdgovora));
        netacniOdgovori.setText("Broj netacnih odgovora je "+String.valueOf(vratiBrojNetacnihOdgovora));
        ukupnoPoena.setText("Ukupan broj ostvarenih poena je "+String.valueOf(poeni));

        db = new DBHelper(this);




        pogledNaTabelu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imeIgraca.getText().toString().isEmpty()) {
                    Toast.makeText(RezultatiKviza.this, "Niste uneli ime igraca", Toast.LENGTH_SHORT).show();
                }
                else {
                    db.dodajRed(imeIgraca.getText().toString(),poeni);

                    startActivity(new Intent(RezultatiKviza.this, TabelaActivity.class));
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(RezultatiKviza.this, GlavniMeni.class));
        finish();
    }


}