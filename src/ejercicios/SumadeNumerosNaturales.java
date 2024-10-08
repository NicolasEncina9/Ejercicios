package ejercicios;
//Descripción: Dado el número N = 50, calcula la suma de los primeros N números naturales. Los números naturales son los
// enteros positivos comenzando desde 1.
//
//Variables: N = 50.

public class SumadeNumerosNaturales {
    public static void main(String[] args) {

        int naturales = 0;

        for (int i= 1; i <= 10; i++){
            naturales +=i;
            System.out.println(naturales);
            }
        System.out.println("La suma de los nuemeros naturales es " + naturales);
        }
    }

