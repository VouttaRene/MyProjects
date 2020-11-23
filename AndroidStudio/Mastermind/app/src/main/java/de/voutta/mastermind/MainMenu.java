package de.voutta.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import de.voutta.mastermind.StartGame.CreateSoughtAfterList;
import de.voutta.mastermind.StartGame.PlayGame;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button startGame = findViewById(R.id.button_startGame);
        Button gameRules = findViewById(R.id.button_gameRules);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, PlayGame.class);

                CreateSoughtAfterList createSoughtAfterList = new CreateSoughtAfterList();
                createSoughtAfterList.setCount(4);

                startActivity(intent);
            }
        });
    }

}
