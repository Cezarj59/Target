package estagiotargetsistemas;

import java.util.Scanner;

public class EstagioTargetSistemas {

    public static void main(String[] args) {
        //soma();
        //fibonacci();
        //inverteString();
    }

    public static void soma() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("Resultado: " + soma);
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");

        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();

        // Inicializa as variáveis a e b com os valores iniciais da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Inicializa a variável fibonacci com o valor zero
        int fibonacci = 0;

        // Executa um loop enquanto a variável fibonacci for menor que o número digitado pelo usuário
        while (fibonacci < numero) {
            // Calcula o próximo número da sequência de Fibonacci somando os dois anteriores
            fibonacci = a + b;
            // Atualiza o valor de a para o valor atual de b
            a = b;
            // Atualiza o valor de b para o valor atual de fibonacci
            b = fibonacci;
        }

        // Verifica se o número digitado pelo usuário é igual ao último número calculado na sequência de Fibonacci
        if (fibonacci == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

    }

    public static void inverteString() {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da string
        System.out.print("Digite uma string para ser invertida:");
        String input = scanner.nextLine();

        // Converte a string para um array de caracteres
        char[] charArray = input.toCharArray();

        // Inverte os caracteres do array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temporario = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temporario;
        }

        // Converte o array de caracteres de volta para uma string
        String output = new String(charArray);

        System.out.println("A string invertida é: " + output);

    }

}
