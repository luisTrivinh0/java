import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A, B, PROD;
    System.out.print("Digite o primeiro número:");
    A = sc.nextInt();
    System.out.print("Digite o segundo número:");
    B = sc.nextInt();

    PROD = A * B;
    System.out.println("A multiplicação de " + A + " e " + B + " é igual a " + PROD);
    sc.close();
  }
}