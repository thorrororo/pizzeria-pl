package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    EditText edit;
    CheckBox ser, szynka, ogorek, kurczak, oliwki, sos;
    RadioGroup radiogroup;
    RadioButton grube, cienkie, sf;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        edit = findViewById(R.id.edit);
        ser = findViewById(R.id.ser);
        szynka = findViewById(R.id.szynka);
        ogorek = findViewById(R.id.ogorek);
        kurczak = findViewById(R.id.kurczak);
        oliwki = findViewById(R.id.oliwki);
        sos = findViewById(R.id.sos);
        radiogroup = findViewById(R.id.radiogroup);
        grube = findViewById(R.id.grube);
        cienkie = findViewById(R.id.cienkie);
        sf = findViewById(R.id.sf);

        btn.setOnClickListener(e -> {
            StringBuilder result = new StringBuilder();
            Integer radioID = radiogroup.getCheckedRadioButtonId();
            Integer suma = 0;

            String edyt = edit.getText().toString();

            int edot = Integer.parseInt(edyt);

            if (radioID == R.id.cienkie) {
                result.append("Ciasto cienkie - 20 zł\n");
                suma += 20;
            }

            else if (radioID == R.id.grube) {
                result.append("Ciasto grube - 20 zł\n");
                suma += 20;
            }

            else if (radioID == R.id.sf) {
                result.append("Ciasto San Francisco - 15 zł\n");
                suma += 15;
            }

            if (ser.isChecked()) {
                result.append("Ser - 5 zł\n");
                suma += 5;
            }
            if (szynka.isChecked()) {
                result.append("Szynka - 5 zł\n");
                suma += 5;
            }
            if (ogorek.isChecked()) {
                result.append("Ogórek - 5 zł\n");
                suma += 5;
            }
            if (sos.isChecked()) {
                result.append("Sos - 5 zł\n");
                suma += 5;
            }
            if (oliwki.isChecked()) {
                result.append("Oliwki - 5 zł\n");
                suma += 5;
            }
            if (kurczak.isChecked()) {
                result.append("Kurczak - 5 zł\n");
                suma += 5;
            }

            if(edot >= 100) {
                suma += 20;
            }

            txt.setText(result + "\nWielkość pizzy: " + edot + " cm\n" + "Do zapłaty: " + suma + " zł");
        });
    }
}