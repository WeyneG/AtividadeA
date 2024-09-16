public class SomNum {
    public static int somatorio(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(somatorio(numeros)); // Saída: 15
    }
}

