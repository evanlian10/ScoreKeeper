package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreGryffindor = 0;

    int foulsGryffindor = 0;

    int scoreSlytherin = 0;

    int foulsSlytherin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayFoulsForGryffindor(int foul) {
        TextView foulView = (TextView) findViewById(R.id.gryffindor_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Increase Gryffindor 1 point.
     *
     */
    public void addOneFoulGryffindor(View v) {
        foulsGryffindor = foulsGryffindor + 1;
        displayFoulsForGryffindor(foulsGryffindor);
    }



    /**
     * Increase the score for Gryffindor by 150 points.
     */
    public void snitchForGryffindor(View v) {
        scoreGryffindor = scoreGryffindor + 150;
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Increase the score for Gryffindor by 10 points.
     */
    public void tenPointsForGryffindor(View v) {
        scoreGryffindor = scoreGryffindor + 10;
        displayForGryffindor(scoreGryffindor);
    }

    /**
     * Displays the given score for Gryffindor.
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor_points);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Slytherin.
     */
    public void displayForSlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.slytherin_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls for Slytherin.
     */

    public void displayFoulsForSlytherin(int foul) {
        TextView foulView = (TextView) findViewById(R.id.slytherin_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Increase Slytherin fouls by 1 point.
     *
     */
    public void addOneFoulSlytherin(View v) {
        foulsSlytherin = foulsSlytherin + 1;
        displayFoulsForSlytherin(foulsSlytherin);
    }

    /**
     * Increase the score for Slytherin by 150 points.
     */
    public void snitchForSlytherin(View v) {
        scoreSlytherin = scoreSlytherin + 150;
        displayForSlytherin(scoreSlytherin);
    }

    /**
     * Increase the score for Slytherin by 10 points.
     */
    public void tenPointsForSlytherin(View v) {
        scoreSlytherin = scoreSlytherin + 10;
        displayForSlytherin(scoreSlytherin);

    }

    /**
     * Reset scores for both teams to 0.
     */

    public void resetScore (View v) {
        scoreGryffindor = 0;
        displayForGryffindor(scoreGryffindor);
        scoreSlytherin = 0;
        displayForSlytherin(scoreSlytherin);
        foulsGryffindor = 0;
        displayFoulsForGryffindor(foulsGryffindor);
        foulsSlytherin = 0;
        displayFoulsForSlytherin(foulsSlytherin);

    }



}
