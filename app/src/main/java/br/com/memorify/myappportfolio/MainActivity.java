package br.com.memorify.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void openSpotifyStreamer(View view) {
        toastSomething("This button will launch Spotify Streamer!");
    }

    public void openScoresApp(View view) {
        toastSomething("This button will launch Scores App!");
    }

    public void openLibraryApp(View view) {
        toastSomething("This button will launch Library App!");
    }

    public void openBuildItBiggerApp(View view) {
        toastSomething("This button will launch Build It Bigger!");
    }

    public void openXYZReader(View view) {
        toastSomething("This button will launch XYZ Reader!");
    }

    public void openCapstoneApp(View view) {
        toastSomething("This button will launch my capstone app!");
    }

    public void toastSomething(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
