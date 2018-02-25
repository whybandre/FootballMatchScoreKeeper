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


    /**SUGGESTION from a Review
     * These fields should be private to favour encapsulation.
     * Software objects are conceptually similar to real-world objects:
     * they too consist of state and related behavior.
     * An object stores its state in fields (variables in some programming languages) and
     * exposes its behavior through methods (functions in some programming languages).
     * Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication.
     * Hiding internal state and requiring all interaction to be performed through an object's methods is
     * known as data encapsulation — a fundamental principle of object-oriented programming.
     *You can read more about encapsulation here: https://www.tutorialspoint.com/java/java_encapsulation.htm
     */


    /**
     * SUGGESTION from a Review
     * int scoreTeamA = 0; --------> int scoreTeamA
     * -->Int are zero by default<--, there is no need to re-initialize them
     */


    // Tracking Score for Team A and B
    private int scoreTeamA;
    private int scoreTeamB;
    // Tracking Yellow Cards for Team A and B
    private int yellowCardTeamA;
    private int yellowCardTeamB;
    // Tracking Red Cards for Team A and B
    private int redCardTeamA;
    private int redCardTeamB;
    private int shotTeamA;
    private int shotTeamB;
    // Tracking Fouls for Team A and B
    private int foulsTeamA;
    private int foulsTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param savedInstanceState Saving Variables
     * More reading https://developer.android.com/guide/components/activities/activity-lifecycle.html
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

    /**SUGGESTION from a Review
     * This is a bit of a more advanced suggestion.
     * For all these methods called on the click of a view, the framework passes the view being clicked in the parameter
     * v which you are never using. The reason why the view is being passed in, it is because you do not need
     * to define a method for every ui element being clicked, as you can just check the id of the view being passed as
     * a parameter to understand which button was clicked and increment the right score. In that case, you only need one of
     * these methods, which avoid code duplication and simplify readability.
     */


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
        TextView scoreView = findViewById(R.id.shot_card_team_a);
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
        TextView scoreView = findViewById(R.id.shot_card_team_b);
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

        EditText editNameTeamA = findViewById(R.id.edit_team_a);
        String nameTeamA = editNameTeamA.getText().toString();

        EditText editNameTeamB = findViewById(R.id.edit_team_b);
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
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = findViewById(R.id.yellow_card_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = findViewById(R.id.red_card_team_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls stats for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(score));
    }


    //Displays the score, fouls, yellow and red cards for ***Team B***

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the yellow cards for Team B.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.yellow_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.red_card_team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls stats for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(score));
    }


}