public class metodosBusqueda {
    public int metodoLineal(int[] arreglo, int elemento){
        int pos=00;
        for(int i=0; i<=arreglo.length-1; i++){
            if(arreglo[i]==elemento){
                System.out.println("El elemento que busca si se encuentra");
                pos=i;
                break;
            }
        }
        return pos;
    }
}
