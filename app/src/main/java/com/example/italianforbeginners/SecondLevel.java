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

public class SecondLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_level);

        ScrollView scrollView2 = findViewById(R.id.scv2);
        LinearLayout container = findViewById(R.id.lout2);

        // Array of Italian alphabet letters and their corresponding words
        String[] italianNumbers = {
                "1 → One → Uno", "2 → Two → Due", "3 → Three → Tre", "4 → Four → Quattro", "5 → Five → Cinque",
                "6 → Six → Sei", "7 → Seven → Sette", "8 → Eight → Otto", "9 → Nine → Nove", "10 → Ten → Dieci",
                "11 → Eleven → Undici", "12 → Twelve → Dodici", "13 → Thirteen → Tredici", "14 → Fourteen → Quattordici",
                "15 → Fifteen → Quindici", "16 → Sixteen → Sedici", "17 → Seventeen → Diciassette", "18 → Eighteen → Diciotto",
                "19 → Nineteen → Diciannove", "20 → Twenty → Venti",
                "21 → Twenty-one → Ventuno", "22 → Twenty-two → Ventidue", "23 → Twenty-three → Ventitré", "24 → Twenty-four → Ventiquattro",
                "25 → Twenty-five → Venticinque", "26 → Twenty-six → Ventisei", "27 → Twenty-seven → Ventisette", "28 → Twenty-eight → Ventotto",
                "29 → Twenty-nine → Ventinove", "30 → Thirty → Trenta",
                "31 → Thirty-one → Trentuno", "32 → Thirty-two → Trentadue", "33 → Thirty-three → Trentatre", "34 → Thirty-four → Trentaquattro",
                "35 → Thirty-five → Trentacinque", "36 → Thirty-six → Trentasei", "37 → Thirty-seven → Trentasette", "38 → Thirty-eight → Trentotto",
                "39 → Thirty-nine → Trentanove", "40 → Forty → Quaranta",
                "41 → Forty-one → Quarantuno", "42 → Forty-two → Quarantadue", "43 → Forty-three → Quarantatre", "44 → Forty-four → Quarantaquattro",
                "45 → Forty-five → Quarantacinque", "46 → Forty-six → Quarantasei", "47 → Forty-seven → Quarantasette", "48 → Forty-eight → Quarantotto",
                "49 → Forty-nine → Quarantanove", "50 → Fifty → Cinquanta",
                "51 → Fifty-one → Cinquantuno", "52 → Fifty-two → Cinquantadue", "53 → Fifty-three → Cinquantatre", "54 → Fifty-four → Cinquantaquattro",
                "55 → Fifty-five → Cinquantacinque", "56 → Fifty-six → Cinquantasei", "57 → Fifty-seven → Cinquantasette", "58 → Fifty-eight → Cinquantotto",
                "59 → Fifty-nine → Cinquantanove", "60 → Sixty → Sessanta",
                "61 → Sixty-one → Sessantuno", "62 → Sixty-two → Sessantadue", "63 → Sixty-three → Sessantatre", "64 → Sixty-four → Sessantaquattro",
                "65 → Sixty-five → Sessantacinque", "66 → Sixty-six → Sessantasei", "67 → Sixty-seven → Sessantasette", "68 → Sixty-eight → Sessantotto",
                "69 → Sixty-nine → Sessantanove", "70 → Seventy → Settanta",
                "71 → Seventy-one → Settantuno", "72 → Seventy-two → Settantadue", "73 → Seventy-three → Settantatre", "74 → Seventy-four → Settantaquattro",
                "75 → Seventy-five → Settantacinque", "76 → Seventy-six → Settantasei", "77 → Seventy-seven → Settantasette", "78 → Seventy-eight → Settantotto",
                "79 → Seventy-nine → Settantanove", "80 → Eighty → Ottanta",
                "81 → Eighty-one → Ottantuno", "82 → Eighty-two → Ottantadue", "83 → Eighty-three → Ottantatre", "84 → Eighty-four → Ottantaquattro",
                "85 → Eighty-five → Ottantacinque", "86 → Eighty-six → Ottantasei", "87 → Eighty-seven → Ottantasette", "88 → Eighty-eight → Ottantotto",
                "89 → Eighty-nine → Ottantanove", "90 → Ninety → Novanta",
                "91 → Ninety-one → Novantuno", "92 → Ninety-two → Novantadue", "93 → Ninety-three → Novantatre", "94 → Ninety-four → Novantaquattro",
                "95 → Ninety-five → Novantacinque", "96 → Ninety-six → Novantasei", "97 → Ninety-seven → Novantasette", "98 → Ninety-eight → Novantotto",
                "99 → Ninety-nine → Novantanove", "100 → One hundred → Cento"
        };


        // Create TextViews for each letter and add them to the LinearLayout
        for (String item : italianNumbers) {
            TextView textView = new TextView(this);
            textView.setText(item);
            textView.setTextSize(20); // Set text size
            container.addView(textView); // Add TextView to LinearLayout
        }
        Button lev2= findViewById(R.id.l2);
        lev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SecondLevel.this, ThirdLevel.class);
                startActivity(intent);
            }
        });

    }
}