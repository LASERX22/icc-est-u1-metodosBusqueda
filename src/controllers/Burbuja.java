package controllers;

import models.Persona;

public class Burbuja {
    private Persona[] people;

    public void burbuja(Persona[] people){
        for (int i=0; i<people.length;i++){
            for (int j=i+1; j<people.length; j++){
                if(people[i].getCode()>people[j].getCode()){
                    Persona aux=people[i];
                    people[i]=people[j];
                    people[j]=aux;
                }
            }
        }
    }
}
