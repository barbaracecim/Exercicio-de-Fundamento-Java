import java.util.Scanner;

public class Main {
    /**Escreva um código que recebe o nome e o ano de nascimento 
     * de alguém e imprima na tela a seguinte mensagem: Olá fulano, voce tem
     * X anos.
     */
    public static void main(String[] args){
        var anobase = 2025; 
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe seu ano de nascimento: ");
        var ano = scanner.nextInt();
        var idade = anobase - ano;
        System.out.printf("Olá %s voce tem %s anos\n", nome, idade);
      
    }

}
