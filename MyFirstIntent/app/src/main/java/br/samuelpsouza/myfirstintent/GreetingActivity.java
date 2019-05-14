package br.samuelpsouza.myfirstintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {
    public static final String EXTRA_USER_NAME =
            "br.samuelpsouza.myfirstintent.EXTRA_USER_NAME";
    public static final String SHOW_GREETING_ACTION =
            "br.samuelpsouza.myfirstintent.SHOW_GREETING_ACTION";
    public static final String GREETING_CATEGORY =
            "br.samuelpsouza.myfirstintent.GREETING_CATEGORY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        TextView greetingTextView = findViewById(R.id.greeting);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_USER_NAME)) {
            String greeting = getResources().getString(R.string.default_greeting);
            greetingTextView.setText(greeting + " " + intent.getStringExtra(EXTRA_USER_NAME));
        } else {
            greetingTextView.setText(getResources().getString(R.string.user_name_not_typed));
        }
    }
}
