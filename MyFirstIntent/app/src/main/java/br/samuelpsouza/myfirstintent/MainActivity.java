package br.samuelpsouza.myfirstintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nameEditText = findViewById(R.id.input_name);
    }

    public void surpriseMe(View view) {
        Intent intent = new Intent(GreetingActivity.SHOW_GREETING_ACTION);
        intent.addCategory(GreetingActivity.GREETING_CATEGORY);
        Editable text = this.nameEditText.getText();

        intent.putExtra(GreetingActivity.EXTRA_USER_NAME, text.toString());
        startActivity(intent);
    }
}
