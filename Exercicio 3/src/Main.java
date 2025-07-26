import java.util.Scanner; 
public class Main {
    /** Escreva um codigo que receba a idade de duas pessoas
     * e imprima a diferença de idade entre elas.
     */
public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Digite a idade da primeira pessoa: ");
      var idade1 = scanner.nextInt();

    System.out.println("Digite a idade da segunda pessoa: ");
      var idade2 = scanner.nextInt();

    var diferenca = idade1 - idade2; 
    System.out.printf("A diferença de idade entre as duas pessoas é de %s anos\n", diferenca);
}
}
