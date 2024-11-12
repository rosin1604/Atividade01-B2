public class Modularizando01B2 {

    // Método principal
    public static void main(String[] args) {
        int num1 = obterNumero("Digite o primeiro número: ");
        int num2 = obterNumero("Digite o segundo número: ");

        int resultado = somar(num1, num2);

        exibirResultado(num1, num2, resultado);
    }

    // Método para obter um número a partir de uma entrada do usuário
    public static int obterNumero(String mensagem) {
        System.out.print(mensagem);
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    // Método para realizar a soma
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método para exibir o resultado
    public static void exibirResultado(int num1, int num2, int resultado) {
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
    }
}