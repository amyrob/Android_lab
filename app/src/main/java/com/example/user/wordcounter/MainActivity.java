package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterText;
    private Button submitButton;
    private TextView phraseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "oncreate");
        enterText = findViewById(R.id.enter_text);
        submitButton = findViewById(R.id.button);
        phraseTextView = findViewById(R.id.display_word_count);
    }

    public void onButtonClick(View clickedView) {
        Log.d("MainActivity", "Button clicked");
        String phraseEntered = enterText.getText().toString();
        Log.d("MainActivity", phraseEntered);
        Integer count = WordCounter.breakDownPhrase(phraseEntered);
        phraseTextView.setText("The word count is " + count);
    }
}
