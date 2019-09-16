package com.tec.aoachinesehoroscope.Horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tec.aoachinesehoroscope.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HoroscopeDetailActivity extends AppCompatActivity {
    Intent currentIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_detail);

        currentIntent   = getIntent();

        initComponents();
    }

    protected void initComponents(){
        TextView animalTextView     = findViewById(R.id.animalHoroscopeDetailTextView);
        TextView contentTextView    = findViewById(R.id.contentHoroscopeDetailTextView);
        ImageView currentImageView  = findViewById(R.id.currentHoroscopeDetailImageView);

        animalTextView.setText(currentIntent.getStringExtra("animal"));
        contentTextView.setText(currentIntent.getStringExtra("content"));

        switch (currentIntent.getStringExtra("animal")){
            case "Buey":
                currentImageView.setImageResource(R.mipmap.buey);
                break;
            case "Caballo":
                currentImageView.setImageResource(R.mipmap.caballo);
                break;
            case "Cabra":
                currentImageView.setImageResource(R.mipmap.cabra);
                break;
            case "Dragon":
                currentImageView.setImageResource(R.mipmap.dragon);
                break;
            case "Gallo":
                currentImageView.setImageResource(R.mipmap.gallo);
                break;
            case "Gato":
                currentImageView.setImageResource(R.mipmap.gato);
                break;
            case "Jabali":
                currentImageView.setImageResource(R.mipmap.jabali);
                break;
            case "Mono":
                currentImageView.setImageResource(R.mipmap.mono);
                break;
            case "Perro":
                currentImageView.setImageResource(R.mipmap.perro);
                break;
            case "Rata":
                currentImageView.setImageResource(R.mipmap.rata);
                break;
            case "Serpiente":
                currentImageView.setImageResource(R.mipmap.serpiente);
                break;
            case "Tigre":
                currentImageView.setImageResource(R.mipmap.tigre);
                break;
        }


    }
}
