package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoalsForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalsForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int foul){
        TextView foulView = (TextView)findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayFoulsForTeamB(int foul){
        TextView foulView = (TextView)findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }
    public void goalTeamA(View v){
        scoreTeamA += 1;
        displayGoalsForTeamA(scoreTeamA);
    }

    public void goalTeamB(View v){
        scoreTeamB += 1;
        displayGoalsForTeamB(scoreTeamB);
    }

    public void foulTeamA(View v){
        foulsTeamA += 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    public void foulTeamB(View v){
        foulsTeamB += 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        displayGoalsForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayGoalsForTeamB(scoreTeamB);
        foulsTeamA = 0;
        displayFoulsForTeamA(foulsTeamA);
        foulsTeamB = 0;
        displayFoulsForTeamB(foulsTeamB);
    }
}
