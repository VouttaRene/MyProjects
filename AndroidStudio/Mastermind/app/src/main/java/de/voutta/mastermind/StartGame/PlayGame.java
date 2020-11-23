package de.voutta.mastermind.StartGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.List;

import de.voutta.mastermind.MainMenu;
import de.voutta.mastermind.R;

public class PlayGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        //ReturnToMenu Button
        ImageButton returnButton = findViewById(R.id.returnButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayGame.this, MainMenu.class);

                startActivity(intent);
            }
        });


        CreateSoughtAfterList createSoughtAfterList = new CreateSoughtAfterList();
        createSoughtAfterList.allColorList();

        List<String> tryMe = createSoughtAfterList.getSoughtAfterColors();

        for (String s : tryMe
             ) {
            System.out.print(s + " ");
        }


    }
}
