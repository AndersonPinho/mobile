package br.samuelpsouza.helloworld;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.logo);
        Drawable earthAnimation = imageView.getDrawable();
        if (earthAnimation instanceof Animatable) {
            ((Animatable)earthAnimation).start();
        }
    }
}
