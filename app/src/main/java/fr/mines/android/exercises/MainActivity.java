package fr.mines.android.exercises;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URLConnection urlConnection = new URL("http://www.google.fr").openConnection();
                    urlConnection.connect();
                } catch (IOException e) {
                    Log.d(TAG, "Failed");
                }
                ((TextView) findViewById(R.id.text)).setText(R.string.correct);
            }
        }).start();
    }

}
