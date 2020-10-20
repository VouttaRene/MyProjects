package de.voutta.mastermind.StartGame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import de.voutta.mastermind.R;

public class PlayGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        CreateSoughtAfterList createSoughtAfterList = new CreateSoughtAfterList();
        createSoughtAfterList.allColorList();

        List<String> tryMe = createSoughtAfterList.getSoughtAfterColors();

        for (String s : tryMe
             ) {
            System.out.print(s + " ");
        }


    }
}
