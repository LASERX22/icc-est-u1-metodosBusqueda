package controllers;
import models.Persona;
import views.ShowConsole;
public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona [] people;

    public MetodosBusqueda(Persona[] persons) {
        showConsole=new ShowConsole();
        this.people= persons;
        showPerson();
        showpersonByName();
    }

    public int metodoLineal(int[] arreglo, int elemento){
        for(int i=0; i<=arreglo.length-1; i++){
            if(arreglo[i]==elemento){
                System.out.println("El elemento que busca si se encuentra");
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for(int i=0;i<people.length; i++){
            if(people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind=showConsole.inputCode();
        int indexPerson=findPersonByCode(codeToFind);
        if(indexPerson>=0){
            showConsole.showMessage("Persona con codigo "+codeToFind+" encontrada");
            //showConsole.showMessage((String) people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson]+"");
        }
        else{
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public int findPersonByName(String name){
        for(int i=0; i<people.length; i++){
            if(people[i].getName()==name){
                return i;
            }
        }
        return -1;
    }
    public void showpersonByName(){
        String nameTofind=showConsole.inputName();
        int indexPerson=findPersonByName(nameTofind);
        if(indexPerson>=0){
            showConsole.showMessage("Persona con nombre "+nameTofind+" encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }
        else{
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
