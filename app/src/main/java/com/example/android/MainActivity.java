package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;

    public void resetScores(View v)
    {
        scoreA = scoreB = 0;
        displayForTeamA();
        displayForTeamB();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void add3toA(View view)
    {
        scoreA += 3;
        displayForTeamA();
    }
    public void add2toA(View view)
    {
        scoreA += 2;
        displayForTeamA();
    }
    public void add1toA(View view)
    {
        ++scoreA;
        displayForTeamA();
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void add3toB(View view)
    {
        scoreB += 3;
        displayForTeamB();
    }
    public void add2toB(View view)
    {
        scoreB += 2;
        displayForTeamB();
    }
    public void add1toB(View view)
    {
        ++scoreB;
        displayForTeamB();
    }
}