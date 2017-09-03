package com.legalimpurity.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);
        TextView tv = (TextView)findViewById(R.id.jokeTextView);

        if(getIntent().getExtras() != null)
            if(getIntent().getExtras().containsKey(JOKE_KEY))
                tv.setText(getIntent().getExtras().getString(JOKE_KEY));
    }
}
