package com.cs386.pathfinders.traillife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    /**
     * Called when user clicks the button, will go to the SearchActivity
     * @param view The destination
     */
    public void goToSearch(View view)
    {
        Intent intent = new Intent(this, SearchActivity.class); // Could be an error
        startActivity(intent);
    }
}
