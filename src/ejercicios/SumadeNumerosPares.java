package ejercicios;
//Descripción: Suma todos los números pares entre a = 1 y b = 100. Un número es par si es divisible por 2.
//
//Variables: a = 1, b = 100.
public class SumadeNumerosPares {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 1) {
                i++;
                System.out.println(i);
                i++;
            }
        }
    }
}
