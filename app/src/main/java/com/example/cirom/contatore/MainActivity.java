package com.example.cirom.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // View del layout
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;
    private Button vAzzera;
    private CheckBox vRaddoppio;
    //CHE BEL CONTATORE
    //SISI
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Imposto riferimenti delle view
        vMessaggio = findViewById(R.id.textMessaggio);
        vAumenta = findViewById(R.id.btnAumenta);
        vDiminuisci = findViewById(R.id.btnDiminuisci);
        vAzzera = findViewById(R.id.btnAzzera);
        vRaddoppio = findViewById(R.id.chkRaddoppia);

        // pulsanti
        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++cont;
                if (vRaddoppio.isChecked())
                    ++cont;
                mostraMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --cont;
                if (vRaddoppio.isChecked())
                    --cont;
                mostraMessaggio();
            }
        });

        vAzzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont=0;
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
