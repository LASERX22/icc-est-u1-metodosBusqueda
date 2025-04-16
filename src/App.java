import controllers.MetodosBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas=new Persona[7];
        personas[0]=new Persona(101,"Juan");
        personas[1]=new Persona(102,"Maria");
        personas[2]=new Persona(103,"Carlos");
        personas[3]=new Persona(103,"Ana");
        personas[4]=new Persona(103,"Luis");
        personas[5]=new Persona(103,"Sofia");
        personas[6]=new Persona(103,"Pedro");

        MetodosBusqueda mt=new MetodosBusqueda(personas);

        /*int[] arreglo={1,4,3,6,7,8,9,0,11,20,};
        int busqueda=mt.metodoLineal(arreglo, 11);
        System.out.println("Su posicion: "+busqueda);*/
    }
}
