package ejercicios;

public class Maximode3Numeros {
    public static void main(String[] args) {

        int a = 5;
        int b = 12;
        int c = 9;

        int mayor = a;

        if (b > mayor)
        {
            mayor = b;
            {
                if (c > mayor)
                {
                    mayor = c;
                }
                System.out.println("Es el numero mayor." + mayor);
            }
        }
    }
}