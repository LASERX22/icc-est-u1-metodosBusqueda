package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private ShowConsole pantalla;
    private Persona [] people;
    
    public MetodosBusquedaBinaria(Persona[] people){
        this.people=people;
        this.pantalla=new ShowConsole();
        pantalla.showMessage("Metodo de busqueda binaria");
    }
    
    public int findPersonByCode(int code){
        int bajo=0;
        int alto=people.length-1;

        while(alto>=bajo){
            int central=(alto+bajo)/2;
            if(people[central].getCode()==code){
                return central;
            }

            if(people[central].getCode()>code){
                alto=central-1; //izq
            }
            else{
                bajo=central+1; //der
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind=pantalla.inputCode();
        int indexPerson=findPersonByCode(codeToFind);
        if(indexPerson==-1){
            pantalla.showMessage("Persona con codigo "+codeToFind+" no encontrada");
        }
        else{
            pantalla.showMessage("Persona con codigo "+codeToFind+" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFind=pantalla.inputName();
        int indexPerson=findPersonByName(nameToFind);
        if(indexPerson>=0){
            pantalla.showMessage("Persona con nombre "+nameToFind+" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
        else{
            pantalla.showMessage("Persona con nombre "+nameToFind+" no encontrada");
        }
    }

    private int findPersonByName(String name){
        int bajo=0;
        int alto=people.length-1;

        while(alto>=bajo){
            int central=(alto+bajo)/2;
            if(people[0].getName().equals(name)){
                return central;
            }

            if(people[0].getName().compareTo(name)>0){
                alto=central-1; //izq
            }
            else{
                bajo=central+1; //der
            }
        }
        return -1;
    }
}
