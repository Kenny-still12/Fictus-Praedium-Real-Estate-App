package com.example.fictuspraediumrealestateapp.Activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fictuspraediumrealestateapp.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CheckBox cbPrivacy = findViewById(R.id.cbPrivacy);
        Button btnGetStarted = findViewById(R.id.btnGetStarted);

        // Disable button initially unless checkbox is checked
        btnGetStarted.setEnabled(cbPrivacy.isChecked());

        // Toggle button enabled state when checkbox is ticked
        cbPrivacy.setOnCheckedChangeListener((buttonView, isChecked) -> btnGetStarted.setEnabled(isChecked));
    }
}