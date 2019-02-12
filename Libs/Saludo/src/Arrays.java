
public class Arrays {
    public static void main(String[] args) {
        int matriz[]=new int[5];
        matriz[0] = 15;
        matriz[1] = 524;
        matriz[2] = 454;
        matriz[3] = 44;
        matriz[4] = 23;
        
        String [] name_array={"luis","judith","marie","cesar","gaby"};
        
        /*for(int j=0;j<matriz.length;j++){
            System.out.println("valor "+ matriz[j]+" en la posicion: "+j);
        }*/
        int f = 0;
        for(int j:matriz){
            System.out.println("valor "+ j +" en la posicion: "+f);
            f++;
        }
        
        int i = 0;
        for(String nombre:name_array){
            
            System.out.println("nombre: "+ nombre +" en la posicion: "+i);
            i++;
        }
    }
}
