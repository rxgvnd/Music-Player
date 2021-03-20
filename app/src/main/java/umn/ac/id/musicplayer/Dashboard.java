package umn.ac.id.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    private Button btnLogon, btnProfil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnLogon = (Button)findViewById(R.id.btnLogon);
        btnProfil = (Button)findViewById(R.id.btnProfil);

        btnLogon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnLogon = new Intent(Dashboard.this, Login.class);
                startActivity(btnLogon);
            }
        });

        btnProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent forProfil = new Intent(Dashboard.this, Profile.class);
                startActivity(forProfil);
            }
        });
    }
}
