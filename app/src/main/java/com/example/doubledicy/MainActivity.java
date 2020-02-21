package com.example.doubledicy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView  imageViewOne;
    private ImageView imageViewTwo;
    private Button button;
    private Random myRandOne = new Random();
    private Random myRandTwo = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        imageViewOne = findViewById(R.id.imageView1);
        imageViewTwo = findViewById(R.id.imageView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollPart();
            }
        });

    }
    public void rollPart()
    {
        int RandNumOne = myRandOne.nextInt(6)+1;
        int RandNumTwo = myRandTwo.nextInt(6)+1;

        switch (RandNumOne)
        {
            case 1: imageViewOne.setImageResource(R.drawable.dice1);
                     break;
            case 2: imageViewOne.setImageResource(R.drawable.dice2);
                break;
            case 3: imageViewOne.setImageResource(R.drawable.dice3);
                break;
            case 4: imageViewOne.setImageResource(R.drawable.dice4);
                break;
            case 5: imageViewOne.setImageResource(R.drawable.dice5);
                break;
            case 6: imageViewOne.setImageResource(R.drawable.dice6);
                break;
            default:
                Toast.makeText(this, "Out of Bound", Toast.LENGTH_SHORT).show();
        }

        switch (RandNumTwo)
        {
            case 1: imageViewTwo.setImageResource(R.drawable.dice7);
                break;
            case 2: imageViewTwo.setImageResource(R.drawable.dice8);
                break;
            case 3: imageViewTwo.setImageResource(R.drawable.dice9);
                break;
            case 4: imageViewTwo.setImageResource(R.drawable.dice10);
                break;
            case 5: imageViewTwo.setImageResource(R.drawable.dice11);
                break;
            case 6: imageViewTwo.setImageResource(R.drawable.dice12);
                break;
            default:
                Toast.makeText(this, "Out of Bound", Toast.LENGTH_SHORT).show();
        }
    }
}
