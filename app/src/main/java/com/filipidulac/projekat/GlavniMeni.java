package com.filipidulac.projekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class GlavniMeni extends AppCompatActivity {
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavni_meni);

        final LinearLayout zastave = findViewById(R.id.zastaveLayout);
        final LinearLayout gradovi = findViewById(R.id.gradoviLayout);
        final LinearLayout stanovnistvo = findViewById(R.id.stanovnistvoLayout);
        final LinearLayout cuda = findViewById(R.id.cudaLayout);

        final Button startBtn = findViewById(R.id.startKvizBtn);

        zastave.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {

                    selectedTopicName = "Zastave";
                    zastave.setBackgroundResource(R.drawable.round_back_white_stroke10);
                    gradovi.setBackgroundResource(R.drawable.round_back_white_10);
                    stanovnistvo.setBackgroundResource(R.drawable.round_back_white_10);
                    cuda.setBackgroundResource(R.drawable.round_back_white_10);
        }
        });

        gradovi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                selectedTopicName = "Glavni gradovi";
                zastave.setBackgroundResource(R.drawable.round_back_white_10);
                gradovi.setBackgroundResource(R.drawable.round_back_white_stroke10);
                stanovnistvo.setBackgroundResource(R.drawable.round_back_white_10);
                cuda.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        stanovnistvo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                selectedTopicName = "Stanovnistvo";
                zastave.setBackgroundResource(R.drawable.round_back_white_10);
                gradovi.setBackgroundResource(R.drawable.round_back_white_10);
                stanovnistvo.setBackgroundResource(R.drawable.round_back_white_stroke10);
                cuda.setBackgroundResource(R.drawable.round_back_white_10);
            }
        });

        cuda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                selectedTopicName = "Svetska cuda";
                zastave.setBackgroundResource(R.drawable.round_back_white_10);
                gradovi.setBackgroundResource(R.drawable.round_back_white_10);
                stanovnistvo.setBackgroundResource(R.drawable.round_back_white_10);
                cuda.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(GlavniMeni.this, "Niste odabrali nijednu igru", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i=new Intent(GlavniMeni.this, KvizActivity.class);
                    i.putExtra("selectedTopic",selectedTopicName);
                    startActivity(i);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
    }
}