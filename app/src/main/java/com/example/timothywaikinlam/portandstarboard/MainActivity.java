package com.example.timothywaikinlam.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="initial app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Wire up th button to do stuff
        //..get the button
        Button btn = findViewById(R.id.ShowLeftName);

        //set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "say my name");
                Toast.makeText(getApplicationContext(),"Timothy", Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }
}
