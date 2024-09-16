
    public class Contagem {

        public static int contarValoresEntrePrimeiroEN(int[] numeros, int N) {
            int primeiro = numeros[0];
            int contador = 0;


            for (int numero : numeros) {
                if (numero >= primeiro && numero <= N) {
                    contador++;
                }
            }

            return contador;
        }

        public static void main(String[] args) {

            int[] numeros = {3, 7, 2, 8, 5, 9, 10};
            int N = 8;
            System.out.println(contarValoresEntrePrimeiroEN(numeros, N));
        }
    }

