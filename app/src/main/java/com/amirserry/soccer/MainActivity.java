package com.amirserry.soccer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamOneScore;
    private int teamOneFouls;
    private int teamTwoScore;
    private int teamTwoFouls;

    private TextView txtTeamOneScore;
    private TextView txtTeamOneFouls;
    private TextView txtTeamTwoScore;
    private TextView txtTeamtwoFouls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTeamOneScore = findViewById(R.id.team_1_score);
        txtTeamOneFouls = findViewById(R.id.team_1_foul);
        txtTeamTwoScore = findViewById(R.id.team_2_score);
        txtTeamtwoFouls = findViewById(R.id.team_2_foul);
        resetTextViews();


    }

    public void reset(View view) {
        teamOneScore = 0;
        teamOneFouls = 0;
        teamTwoScore = 0;
        teamTwoFouls = 0;
        resetTextViews();

    }

    public void addGoalForTeam1(View view) {
        teamOneScore++;
        txtTeamOneScore.setText(String.valueOf(teamOneScore));
    }

    public void addFoulForTeam1(View view) {
        teamOneFouls++;
        txtTeamOneFouls.setText(String.valueOf(teamOneFouls));
    }

    public void addGoalForTeam2(View view) {
        teamTwoScore++;
        txtTeamTwoScore.setText(String.valueOf(teamTwoScore));
    }

    public void addFoulForTeam2(View view) {
        teamTwoFouls++;
        txtTeamtwoFouls.setText(String.valueOf(teamTwoFouls));
    }

    private void resetTextViews() {
        txtTeamOneScore.setText(String.valueOf(teamOneScore));
        txtTeamOneFouls.setText(String.valueOf(teamOneFouls));
        txtTeamTwoScore.setText(String.valueOf(teamTwoScore));
        txtTeamtwoFouls.setText(String.valueOf(teamTwoFouls));
    }
}
