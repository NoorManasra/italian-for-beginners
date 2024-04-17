package com.example.italianforbeginners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first_level);

        ScrollView scrollView = findViewById(R.id.scv1);
        LinearLayout container = findViewById(R.id.lout);

        // Array of Italian alphabet letters and their corresponding words
        String[] italianAlphabet = {
                "A → Ah", "B → Bee", "C → Che", "D → Dee", "E → Eh",
                "F → Eff-e", "G → Jee", "H → Acca", "I → Ee", "J → Ilunga",
                "K → Ka", "L → Elle", "M → Emme", "N → Enne", "O → O",
                "P → Pee", "Q → koo", "R → Erre", "S → Esse", "T → Tee",
                "U → Oo", "V → Vu", "W → Vu doppia", "X → Ics", "Y → Ipsilon",
                "Z → Zeta"
        };

        // Create TextViews for each letter and add them to the LinearLayout
        for (String item : italianAlphabet) {
            TextView textView = new TextView(this);
            textView.setText(item);
            textView.setTextSize(20); // Set text size
            container.addView(textView); // Add TextView to LinearLayout
        }

        Button lev1= findViewById(R.id.l1);
        lev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(FirstLevel.this, SecondLevel.class);
                startActivity(intent);
            }
        });
    }
}