package ejercicios;

public class NumerosPrimos {
    public static void main(String[] args){

        int a = 29;
        boolean esPrimo = true;

        if (a <= 1) {
            esPrimo = false;
        }else{
            for ( int i=2; i <= Math.sqrt(a); i++){
                if (a % i == 0){
                    esPrimo = false;
                    break;
                }
        }
    }
}

}
