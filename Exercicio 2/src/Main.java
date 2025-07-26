import java.util.Scanner;
/** Escreva um codigo que receba o valor do lado de um quadrado, calcule 
 * sua area e exiba na tela.
 */
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); 
        System.out.println("Informe o valor do lado do quadrado: ");
        var lado = scanner.nextFloat();
        var area = lado*lado; 

        System.out.printf("A área do quadrado é %s\n", area);
    }

}
