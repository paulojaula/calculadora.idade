import java.util.Scanner; // Import para poder baixar o Scanner e ele ler

public class Main {

    public static void main(String[] args) {

        System.out.println("Olá me chamo Cronos 5.0"); // Seguindo a regra origem>>saída>>>comando>>argumento
        System.out.println("Sou um robo que advinha sua idade! :)");

        Scanner escutador = new Scanner(System.in);// ativando a ferramenta

        System.out.print("Digite o ano atual:");
        int numero1 = escutador.nextInt(); // Determinando variavel 1

        System.out.print("Digite o ano do seu aniversário:");
        int numero2 = escutador.nextInt();// Determinando variavel 2

       int Resultado = numero1 - numero2; // Determinando calculo

        System.out.println("Processando a sua data de aniversário...");

        System.out.println("Você tem "+ Resultado + " anos" ); // Fechando o resultado do calculo

        escutador.close(); // fechando a ferramenta para não sobrecarga

    }
}
