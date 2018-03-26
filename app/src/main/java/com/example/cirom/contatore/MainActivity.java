package com.example.cirom.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // View del layout
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;
    private int cont = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Imposto riferimenti delle view
        vMessaggio = findViewById(R.id.textMessaggio);
        vAumenta = findViewById(R.id.btnAumenta);
        vDiminuisci = findViewById(R.id.btnDiminuisci);

        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++cont;
                mostraMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --cont;
                mostraMessaggio();
            }
        });
    }

    /**
     * Funzione che visualizza il contatore
     */
    private void mostraMessaggio(){
        vMessaggio.setText(getString(R.string.messaggio2) + " " + cont); // Prende il messaggio dalle risorse
    }
}
