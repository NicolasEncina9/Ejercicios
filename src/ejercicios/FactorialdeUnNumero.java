package ejercicios;

public class FactorialdeUnNumero {
    public static void main(String[] args) {

        int a = 6;
        long factorial = calcularFactorial(a);
        System.out.println("El factorial de " + a + " es " + factorial);
    }

    public static long calcularFactorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
