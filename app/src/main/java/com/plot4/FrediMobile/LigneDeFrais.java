package com.plot4.FrediMobile;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Classe métier d'un club
 * Décrit les données d'un club
 */
public class LigneDeFrais {
    /**
     * Date
     */
    public String Date;
    /**
     * Nombre km
     */
    public int Km;

    /**
     * cout du peage de la ligne
     */
    public int CoutPeage;
    /**
     * Cout repas de la ligne
     */
    public int CoutRepas;
    /**
     * Cout Hebergement de la ligne
     */
    public int CoutHebergement;

    public String Trajet;

    public String Annee;



    /**
     * Constructeur
     * Construit un objet à partir d'un JSONObject
     * @param jsonObject
     */
    public LigneDeFrais(JSONObject jsonObject) {
        try {

            Date = jsonObject.getString("Date");
            Km = jsonObject.getInt("Km");
            CoutPeage = jsonObject.getInt("CoutPeage");
            CoutRepas = jsonObject.getInt("CoutRepas");
            CoutHebergement = jsonObject.getInt("CoutHebergement");
            Trajet = jsonObject.getString("Trajet");
            Annee = jsonObject.getString("Annee");

        } catch (JSONException e) {
            Log.d(MainActivity.LOG_TAG,"Erreur lors de la conversion de l'objet JSON en objet Club");
            e.printStackTrace();
        }
    }

    /**
     * Convertit l'objet courant en array
     * @return le tableau
     */
    public String[] toArray() {
        String data[] = {

                Date,
                Integer.toString(Km),
                Integer.toString(CoutPeage),
                Integer.toString(CoutRepas),
                Integer.toString(CoutHebergement),
                Trajet,
                Annee

        };
        return data;
    }

}
