package fr.mines.android.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class NewActivity extends ActionBarActivity {

    public static final String USER_INPUT = "USER_INPUT";

    public static int REQUEST_CODE = 1;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        editText = (EditText) findViewById(R.id.user_input);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = buildIntent();
                // TODO call setResult(int, Intent) with RESULT_OK and intent. Then finish the activity calling finish()
            }
        });
    }

    private Intent buildIntent() {
        Intent intent = new Intent(USER_INPUT);
        intent.putExtra("result", editText.getText().toString());
        return intent;
    }

}
