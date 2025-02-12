package com.example.introduction1;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Locale currentLocale = getResources().getConfiguration().locale;
        String language = currentLocale.getLanguage();

        if (language.equals("en")) {
            if (view.getId() == R.id.button1) {
                Toast.makeText(this, R.string.message1, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button2) {
                Toast.makeText(this, R.string.message2, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button3) {
                Toast.makeText(this, R.string.message3, Toast.LENGTH_SHORT).show();
            }
        } else if (language.equals("ru")) {
            if (view.getId() == R.id.button1) {
                Toast.makeText(this, R.string.message1, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button2) {
                Toast.makeText(this, R.string.message2, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button3) {
                Toast.makeText(this, R.string.message3, Toast.LENGTH_SHORT).show();
            }
        } else if (language.equals("uk")) {
            if (view.getId() == R.id.button1) {
                Toast.makeText(this, R.string.message1, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button2) {
                Toast.makeText(this, R.string.message2, Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button3) {
                Toast.makeText(this, R.string.message3, Toast.LENGTH_SHORT).show();
            }
        }
    }
}