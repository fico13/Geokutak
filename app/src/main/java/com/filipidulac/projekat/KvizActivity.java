package com.filipidulac.projekat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class KvizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;
    private Timer quizTimer;
    private int totalTimeInMins = 1;
    private int seconds = 30;
    private List<Pitanja> pitanja;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kviz);

        final ImageView backBtn=findViewById(R.id.backBtn);
        final TextView timer=findViewById(R.id.timer);
        final TextView selectedTopicName=findViewById(R.id.topicName);

        questions=findViewById(R.id.questions);
        question=findViewById(R.id.question);
        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        nextBtn=findViewById(R.id.nextBtn);


        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopicName);


        pitanja = ListaPitanja.vratiPitanja(getSelectedTopicName);

        startTimer(timer);

        questions.setText(String.valueOf(currentQuestionPosition)+"/"+ pitanja.size());
        question.setText(pitanja.get(0).getQuestion());
        option1.setText(pitanja.get(0).getOption1());
        option2.setText(pitanja.get(0).getOption2());
        option3.setText(pitanja.get(0).getOption3());
        option4.setText(pitanja.get(0).getOption4());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_back_red10);
                    option1.setTextColor(Color.WHITE);

                    revealAnswer();
                    pitanja.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red10);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();
                    pitanja.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red10);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();
                    pitanja.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red10);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();
                    pitanja.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedOptionByUser.isEmpty()) {
                    Toast.makeText(KvizActivity.this, "Molimo unesite odgovor", Toast.LENGTH_SHORT).show();
                }
                else {
                    changeNextQuestion();

                }

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizTimer.purge();
                quizTimer.cancel();
                startActivity(new Intent(KvizActivity.this,GlavniMeni.class));
                finish();
            }
        });
    }

    private void changeNextQuestion(){
        currentQuestionPosition++;
        if((currentQuestionPosition+1) == pitanja.size()) {
            nextBtn.setText("Potvrdi igru");
        }

        if(currentQuestionPosition < pitanja.size()) {
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosition)+"/"+ pitanja.size());
            question.setText(pitanja.get(currentQuestionPosition).getQuestion());
            option1.setText(pitanja.get(currentQuestionPosition).getOption1());
            option2.setText(pitanja.get(currentQuestionPosition).getOption2());
            option3.setText(pitanja.get(currentQuestionPosition).getOption3());
            option4.setText(pitanja.get(currentQuestionPosition).getOption4());
        }
        else {
            quizTimer.purge();
            quizTimer.cancel();
            Intent i = new Intent(KvizActivity.this, RezultatiKviza.class);
            i.putExtra("correct",getCorrectAnswers() + totalTimeInMins * 60 + seconds);
            i.putExtra("incorrect", getInCorrectAnswers());
            startActivity(i);

            finish();
        }
    }

    private void startTimer(TextView timerTextView){
        quizTimer=new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(totalTimeInMins==1 && seconds==0){
                    totalTimeInMins--;
                    seconds=59;
                }
                else if(seconds==0 && totalTimeInMins==0) {
                    quizTimer.purge();
                    quizTimer.cancel();
                    Intent i = new Intent(KvizActivity.this,RezultatiKviza.class);
                    i.putExtra("correct",getCorrectAnswers());
                    i.putExtra("incorrect",getInCorrectAnswers());
                    startActivity(i);
                    finish();
                }
                else {
                    seconds--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes= String.valueOf(totalTimeInMins);
                        String finalSeconds= String.valueOf(seconds);
                        if(finalMinutes.length()==1){
                            finalMinutes="0"+finalMinutes;
                        }
                        if(finalSeconds.length()==1){
                            finalSeconds="0"+finalSeconds;
                        }
                        timerTextView.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        },1000,1000);
    }

    private int getCorrectAnswers(){
        int correctAnswers=0;
        for (int i = 0; i < pitanja.size(); i++) {

            final String getUserSelectedAnswer= pitanja.get(i).getUserSelectedAnswer();
            final String getAnswer= pitanja.get(i).getAnswer();
            if(getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers+=pitanja.get(i).getPoeni();
            }
            
        }
        return correctAnswers;
    }
    private int getInCorrectAnswers(){
        int incorrectAnswers=0;
        for (int i = 0; i < pitanja.size(); i++) {

            final String getUserSelectedAnswer= pitanja.get(i).getUserSelectedAnswer();
            final String getAnswer= pitanja.get(i).getAnswer();
            if(!getUserSelectedAnswer.equals(getAnswer)) {
                incorrectAnswers++;
            }

        }
        return incorrectAnswers;
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();
        startActivity(new Intent(KvizActivity.this,GlavniMeni.class));
        finish();
    }

    private void revealAnswer(){
        final String getAnswer = pitanja.get(currentQuestionPosition).getAnswer();

        if(option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        }
        else if(option2.getText().toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        }
        else if(option3.getText().toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        }
        else {
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }
    }
}