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

public class ThirdLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third_level);

        ScrollView scrollView = findViewById(R.id.scv3);
        LinearLayout container = findViewById(R.id.lout3);

        // Array of Italian salutations and their corresponding words
        String[] italianSalutations = {
                "Hello → Ciao", "Good morning → Buongiorno", "Good afternoon → Buon pomeriggio",
                "Good evening → Buonasera", "Good night → Buonanotte", "How are you? → Come stai?",
                "What's your name? → Come ti chiami?", "My name is... → Mi chiamo...", "Nice to meet you → Piacere di conoscerti",
                "Goodbye → Arrivederci", "See you later → A dopo", "Please → Per favore", "Thank you → Grazie",
                "You're welcome → Prego", "Excuse me → Mi scusi", "I'm sorry → Mi dispiace",
                "Yes → Sì", "No → No", "I don't understand → Non capisco", "Can you help me? → Puoi aiutarmi?",
                "Where is...? → Dove si trova...?", "How much is it? → Quanto costa?", "I like it → Mi piace",
                "I don't like it → Non mi piace", "Do you speak English? → Parli inglese?"
        };

        // Create TextViews for each salutation and add them to the LinearLayout
        for (String item : italianSalutations) {
            TextView textView = new TextView(this);
            textView.setText(item);
            textView.setTextSize(20); // Set text size
            container.addView(textView); // Add TextView to LinearLayout
        }
        Button done= findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ThirdLevel.this, Done.class);
                startActivity(intent);
            }
        });

    }
}