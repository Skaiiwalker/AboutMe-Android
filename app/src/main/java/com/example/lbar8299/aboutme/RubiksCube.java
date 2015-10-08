package com.example.lbar8299.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class RubiksCube extends AppCompatActivity
{

    private Button nextButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubiks_cube);

        nextButton = (Button) findViewById(R.id.nextButton);
        backButton = (Button) findViewById(R.id.backButton);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rubiks_cube, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        backButton.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View buttonView)
           {
               Intent myIntent = new Intent(buttonView.getContext(), Reading.class);
               startActivityForResult(myIntent, 0);
               finish();
           }
        });

        nextButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), Cartoons.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });
    }
}
