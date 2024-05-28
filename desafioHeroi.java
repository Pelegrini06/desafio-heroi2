import java.util.Scanner;

public class DesafioHeroi{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int vitoria = scanner.nextInt();
    System.out.println("Você tem " + vitoria + " vitórias!");

    int derrota = scanner.nextInt();   
    System.out.println("Você tem " + derrota + " derrotas!");

    int ranked = vitoria - derrota;

   if (ranked <= 10) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Ferro");
   }else if (ranked >=11 && ranked <=20) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Bronze");
   }else if (ranked >=21 && ranked <=50) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Prata");
   }else if (ranked >=51 && ranked<=80) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Ouro");
   }else if (ranked >=81 && ranked <=90) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Diamante");
   }else if (ranked >=91 && ranked <=100) {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Lendário");
   }else {
        System.out.println("O Herói tem de saldo de " + vitoria + "está no nível de Imortal");
   }

    scanner.close();
    System.out.println();
}
}

