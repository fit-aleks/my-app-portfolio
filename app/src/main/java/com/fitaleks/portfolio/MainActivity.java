package com.fitaleks.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] btnArr = new Button[6];
        btnArr[0] = (Button)findViewById(R.id.spotify_streamer);
        btnArr[1] = (Button)findViewById(R.id.scores_app);
        btnArr[2] = (Button)findViewById(R.id.library_app);
        btnArr[3] = (Button)findViewById(R.id.build_it_bigger);
        btnArr[4] = (Button)findViewById(R.id.xyz_reader);
        btnArr[5] = (Button)findViewById(R.id.capstone);

        for (Button button : btnArr) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "This button will launch my " + ((Button)v).getText() + " app!", Toast.LENGTH_SHORT).show();
                }
            });
        }


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
}
