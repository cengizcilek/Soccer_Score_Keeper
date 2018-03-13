package com.example.cengizcilek.soccer_score_keeper;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.app.Activity;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    /**
     * Team A Variables.
     */
    int scoreTeamA=0;
    int teamAyellow=0;
    int teamAred=0;

    /**
     * Team B Variables.
     */
    int scoreTeamB=0;
    int teamByellow=0;
    int teamBred=0;
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        ((Button) findViewById(R.id.start_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.stop_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.reset_button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.start_button:
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                break;
            case R.id.stop_button:
                chronometer.stop();
                break;
            case R.id.reset_button:
                chronometer.setBase(SystemClock.elapsedRealtime());
        }
    }

    /**
     * Displays Beginning Value for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays A Yellow Card
     */
    public void displayAyellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays A Red Card
     */
    public void displayAred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_redcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Beginning Value for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays B Yellow Card
     */
    public void displayByellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays B Red Card
     */
    public void displayBred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_redcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Score Team A.
     */
    public void scoreForTeamA(View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays Yellow Card for Team A.
     */
    public void displayAyellow(View v) {
        teamAyellow=teamAyellow+1;
        displayAyellow(teamAyellow);
    }

    /**
     * Displays Red Card for Team A.
     */
    public void displayAred(View v) {
        teamAred=teamAred+1;
        displayAred(teamAred);
    }

    /**
     * Displays Score Team B.
     */
    public void scoreForTeamB(View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays Yellow Card for Team B.
     */
    public void displayByellow(View v) {
        teamByellow=teamByellow+1;
        displayByellow(teamByellow);
    }

    /**
     * Displays Red Card for Team A.
     */
    public void displayBred(View v) {
        teamBred=teamBred+1;
        displayBred(teamBred);
    }

    /**
     * Resets Everything
     */
    public void reset(View v) {
        scoreTeamA=0;
        teamAyellow=0;
        teamAred=0;
        scoreTeamB=0;
        teamByellow=0;
        teamBred=0;
        displayForTeamA(scoreTeamA);
        displayAyellow(teamAyellow);
        displayAred(teamAred);
        displayForTeamB(scoreTeamB);
        displayByellow(teamByellow);
        displayBred(teamBred);
        chronometer.setBase(SystemClock.elapsedRealtime());
    }

}