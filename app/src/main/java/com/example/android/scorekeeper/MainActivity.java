package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String savedTeamA = "scoreTeamA";
    static final String savedTeamB = "scoreTeamB";
    static final String savedYellowCardTeamA = "yellowCardTeamA";
    static final String savedYellowCardTeamB = "yellowCardTeamB";
    static final String savedRedCardTeamA = "redCardTeamA";
    static final String savedRedCardTeamB = "redCardTeamB";
    static final String savedShotTeamA = "shotTeamA";
    static final String savedShotTeamB = "shotTeamB";
    static final String savedFoulsTeamA = "foulsTeamA";
    static final String savedFoulsTeamB = "foulsTeamB";
    // Tracking Score for Team A and B
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    // Tracking Yellow Cards for Team A and B
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    // Tracking Red Cards for Team A and B
    int redCardTeamA = 0;
    int redCardTeamB = 0;
    int shotTeamA = 0;
    int shotTeamB = 0;
    // Tracking Fouls for Team A and B
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param savedInstanceState Saving Variables
     *                           More reading https://developer.android.com/guide/components/activities/activity-lifecycle.html
     */
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //Saving Score
        savedInstanceState.putInt(savedTeamA, scoreTeamA);
        savedInstanceState.putInt(savedTeamB, scoreTeamB);

        //Saving Yellow Cards
        savedInstanceState.putInt(savedYellowCardTeamA, yellowCardTeamA);
        savedInstanceState.putInt(savedYellowCardTeamB, yellowCardTeamB);

        //Saving Red Cards
        savedInstanceState.putInt(savedRedCardTeamA, redCardTeamA);
        savedInstanceState.putInt(savedRedCardTeamB, redCardTeamB);


        //Saving Shots
        savedInstanceState.putInt(savedShotTeamA, shotTeamA);
        savedInstanceState.putInt(savedShotTeamB, shotTeamB);


        //Saving Fouls
        savedInstanceState.putInt(savedFoulsTeamA, foulsTeamA);
        savedInstanceState.putInt(savedFoulsTeamB, foulsTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * @param savedInstanceState Restoring Variables
     * More reading https://developer.android.com/guide/components/activities/activity-lifecycle.html
     */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //Score
        scoreTeamA = savedInstanceState.getInt(savedTeamA);
        scoreTeamB = savedInstanceState.getInt(savedTeamB);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        //Yellow Card
        yellowCardTeamA = savedInstanceState.getInt(savedYellowCardTeamA);
        yellowCardTeamB = savedInstanceState.getInt(savedYellowCardTeamB);

        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);

        //Red Card
        redCardTeamA = savedInstanceState.getInt(savedRedCardTeamA);
        redCardTeamB = savedInstanceState.getInt(savedRedCardTeamB);

        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);

        //Shot
        shotTeamA = savedInstanceState.getInt(savedShotTeamA);
        shotTeamB = savedInstanceState.getInt(savedShotTeamB);

        displayShotsForTeamA(shotTeamA);
        displayShotsForTeamB(shotTeamB);

        //Fouls
        foulsTeamA = savedInstanceState.getInt(savedFoulsTeamA);
        foulsTeamB = savedInstanceState.getInt(savedFoulsTeamB);

        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);

    }


    //TEAM A

    /**
     * Score board increase by 1 unit in Team A.
     */
    public void addOneForTeamA(View v) {
        ++scoreTeamA;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Yellow Cards stats increase by 1 unit in Team A.
     */
    public void addOneYellowCardForTeamA(View v) {
        ++yellowCardTeamA;
        displayYellowCardForTeamA(yellowCardTeamA);
    }


    /**
     * Red Cards stats increase by 1 unit in Team A.
     */
    public void addOneRedCardForTeamA(View v) {
        ++redCardTeamA;
        displayRedCardForTeamA(redCardTeamA);
    }


    /**
     * Displays the shots stats for Team A.
     */
    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_card_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shots stats increase by 1 unit in Team A.
     */
    public void addOneShotForTeamA(View v) {
        ++shotTeamA;
        displayShotsForTeamA(shotTeamA);
    }


    /**
     * Fouls stats increase by 1 unit in Team A.
     */
    public void addOneFoulForTeamA(View v) {
        ++foulsTeamA;
        displayFoulsForTeamA(foulsTeamA);
    }


    //TEAM B

    /**
     * Score board increase by 1 unit in Team B.
     */
    public void addOneForTeamB(View v) {
        ++scoreTeamB;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Yellow Cards stats increase by 1 unit in Team B.
     */
    public void addOneYellowCardForTeamB(View v) {
        ++yellowCardTeamB;
        displayYellowCardForTeamB(yellowCardTeamB);
    }


    /**
     * Red Cards stats increase by 1 unit in Team B.
     */
    public void addOneRedCardForTeamB(View v) {
        ++redCardTeamB;
        displayRedCardForTeamB(redCardTeamB);
    }


    /**
     * Displays the shots stats for Team B.
     */
    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shot_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Shots stats increase by 1 unit in Team B.
     */
    public void addOneShotForTeamB(View v) {
        ++shotTeamB;
        displayShotsForTeamB(shotTeamB);
    }


    /**
     * Fouls stats increase by 1 unit in Team B.
     */
    public void addOneFoulForTeamB(View v) {
        ++foulsTeamB;
        displayFoulsForTeamB(foulsTeamB);
    }


    /**
     * Displays (toast) the winner and reset the score.
     */

    public void resetScore(View v) {

        //Takes the text name of team and save it has a string

        EditText editNameTeamA = (EditText) findViewById(R.id.edit_team_a);
        String nameTeamA = editNameTeamA.getText().toString();

        EditText editNameTeamB = (EditText) findViewById(R.id.edit_team_b);
        String nameTeamB = editNameTeamB.getText().toString();

        //Display text according to result

        if (scoreTeamA > scoreTeamB) {
            Toast.makeText(
                    getApplicationContext(),
                    nameTeamA + " won!",
                    Toast.LENGTH_LONG).show();
        }
        if (scoreTeamA == scoreTeamB) {
            Toast.makeText(
                    getApplicationContext(),
                    "No winners this time!",
                    Toast.LENGTH_LONG).show();
        }
        if (scoreTeamA < scoreTeamB) {
            Toast.makeText(
                    getApplicationContext(),
                    nameTeamB + " won!",
                    Toast.LENGTH_LONG).show();
        }


        scoreTeamA = 0;
        scoreTeamB = 0;

        yellowCardTeamA = 0;
        redCardTeamA = 0;

        yellowCardTeamB = 0;
        redCardTeamB = 0;

        shotTeamA = 0;
        shotTeamB = 0;

        foulsTeamA = 0;
        foulsTeamB = 0;


        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);


        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);

        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);

        displayShotsForTeamA(shotTeamA);
        displayShotsForTeamB(shotTeamB);

    }


    //Displays the score, fouls, yellow and red cards for ***Team A***


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls stats for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(score));
    }


    //Displays the score, fouls, yellow and red cards for ***Team B***

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the yellow cards for Team B.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls stats for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(score));
    }


}