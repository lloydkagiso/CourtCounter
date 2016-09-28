package com.example.user18.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        dispalyForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        dispalyForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        dispalyForTeamA(scoreTeamA);
    }



    public void addThreeForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        dispalyForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        dispalyForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 1;
        dispalyForTeamB(scoreTeamB);
    }

    public void restScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        dispalyForTeamA(scoreTeamA);
        dispalyForTeamB(scoreTeamB);
    }

    public void dispalyForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void dispalyForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
