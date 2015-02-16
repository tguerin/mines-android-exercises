package fr.mines.android.exercises;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_activity_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO start the NewActivity here
            }
        });
    }

}
