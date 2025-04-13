public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo={1,4,3,6,7,8,9,0,11,20,};

        metodosBusqueda mt=new metodosBusqueda();
        int busqueda=mt.metodoLineal(arreglo, 11);
        System.out.println("Su posicion: "+busqueda);
    }
}
