package com.plot4.FrediMobile;
//
// Top 14 client
//
// Détails du club
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    Intent myIntent;
    TextView myViewTrajet;
    TextView myViewDate;
    TextView myViewKm;
    TextView myViewCoutPeage;
    TextView myViewCoutHebergement;
    TextView myViewAnnee;
    TextView myViewCoutRepas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Récupère les données à afficher
        myIntent = getIntent();
        String myData[] = myIntent.getStringArrayExtra(MyAsyncTask.EXTRA_MESSAGE);
        Log.d("detail", myData.toString());
        // Affiche les données dans le layout


        myViewDate = (TextView) findViewById(R.id.tv_date);
        myViewDate.setText("Date : " + myData[0]);

        myViewKm = (TextView) findViewById(R.id.tv_km);
        myViewKm.setText("Km : " + myData[1]);

        myViewCoutPeage = (TextView) findViewById(R.id.tv_coutPeage);
        myViewCoutPeage.setText("Coût Péage : " + myData[2]);

        myViewCoutRepas = (TextView) findViewById(R.id.tv_coutRepas);
        myViewCoutRepas.setText("Coût Repas : " + myData[3]);

        myViewCoutHebergement = (TextView) findViewById(R.id.tv_coutHebergement);
        myViewCoutHebergement.setText("Coût Hebergement : " + myData[4]);

        myViewTrajet = (TextView) findViewById(R.id.tv_trajet);
        myViewTrajet.setText("Trajet : " + myData[5]);

        myViewAnnee = (TextView) findViewById(R.id.tv_Annee);
        myViewAnnee.setText("Année : " + myData[6]);








    }
}
