package com.example.timothywaikinlam.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG="initial app";
    private Game choicegame = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // choicegame = new Game();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupleftButton();
        setuprightButton();
        updateUI();
        //..get the button
        Button btn = findViewById(R.id.ShowLeftName);

        //set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i(TAG, "Port (left) is red");
                Toast.makeText(getApplicationContext(),"Port (left) is red", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        //..get the button
        Button btn2 = findViewById(R.id.ShowRightName);

        //set what happens when the user clicks
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Starboard (right) is green.");
                Toast.makeText(getApplicationContext(),"Starboard (right) is green.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }

    protected void setupleftButton() {
        choicegame = new Game();

        setContentView(R.layout.activity_main);

        TextView textView =(TextView) findViewById(R.id.Port);
        String name = choicegame.getChosenSideName();
        textView.setText(name);

        //Wire up th button to do stuff
        Button btn3 = findViewById(R.id.Meansleft);

        // set what happens when the user clicks
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choicegame.checkIfCorrect(Game.Side.PORT)){
                    Log.i(TAG, "User guess of Port was Correct!");
                    Toast.makeText(getApplicationContext(),"Correct!", Toast.LENGTH_SHORT)
                            .show();

                } else { Log.i(TAG, "User guess of Port was Incorrect!");
                    Toast.makeText(getApplicationContext(),"Incorrect. :(", Toast.LENGTH_SHORT)
                            .show();
                }
                updateUI();
            }

        });


    }
    protected void setuprightButton() {
        choicegame = new Game();

        //Wire up th button to do stuff
        Button btn4 = findViewById(R.id.Meansright);

        // set what happens when the user clicks
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choicegame.checkIfCorrect(Game.Side.STARBOARD)){
                    Log.i(TAG, "User guess of Starboard was Correct!");
                    Toast.makeText(getApplicationContext(),"Correct!", Toast.LENGTH_SHORT)
                            .show();

                } else { Log.i(TAG, "User guess of Starboard was Incorrect!");
                    Toast.makeText(getApplicationContext(),"Incorrect. :(", Toast.LENGTH_SHORT)
                            .show();
                }
                updateUI();
            }

        });

    }

    private void updateUI(){
        choicegame = new Game();
        TextView textView =(TextView) findViewById(R.id.Port);
        String name = choicegame.getChosenSideName();
        textView.setText(name);
        choicegame.getChosenSideName();

    }

}
