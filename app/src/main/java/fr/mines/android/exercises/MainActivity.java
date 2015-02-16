package fr.mines.android.exercises;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    // TODO implement onSaveInstanceState and save the text value (editText.getText().toString())

    // TODO implement onRestoreInstanceState, call editText.setText() to set editText value
}
