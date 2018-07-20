package fr.aston.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // Déclaration de propriété
    private Timer myTimer; /* ou myTimer = null*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instance
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Lancement de HomeActivity
                Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(myIntent);
                // finish(); ou noHistory="true" dans le fichier AndroidManifest.xml
            }
        }, 2000);
    }
}
