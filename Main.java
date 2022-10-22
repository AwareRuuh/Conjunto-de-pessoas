import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
    
  int sexo, Mulheres = 0, Homens = 0;
  float altura, soma = 0, mediaH = 0, maior = 0, menor = 10;

    for (int i=0; i<10; i++) {
      System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
      sexo = sc1.nextInt();
      System.out.print("Digite a altura: ");
      altura = sc1.nextFloat();
    if (sexo == 1) {
      Mulheres++;
    } else if (sexo ==2) {
      Homens++;
      soma = soma + altura;
    } else {
        System.out.println("Opção de sexo inválida!");
    }
    if (altura > maior) {
      maior = altura;
    } else if (altura < menor){
      menor = altura;
    }
  }
    mediaH = soma / Homens; 

    System.out.println("A maior altura do grupo é: " + maior + "m, e a menor é " + menor + "m.");
    System.out.println("A média de altura dos homens é: " + mediaH + "m.");
    System.out.println("A quantidade de mulheres é: " + Mulheres);
}
}