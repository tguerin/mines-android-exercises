package fr.mines.android.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_activity_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO start the NewActivity here with NewActivity.REQUEST_CODE as request code
                startActivityForResult(new Intent(MainActivity.this, NewActivity.class), NewActivity.REQUEST_CODE);
            }
        });
    }

    // TODO override onActivity result, check that the result is RESULT_OK and request code is NewActivity.REQUEST_CODE
    // then call showMessage(Intent)


    public void showMessage(Intent intent) {
        Toast.makeText(this, intent.getStringExtra("result"), Toast.LENGTH_LONG).show();
    }
}
