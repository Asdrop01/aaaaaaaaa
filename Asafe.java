import java.util.Scanner;
public class Asafe {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um Numero de 1 a 12: ");

        int num1 = scan.nextInt();

        switch(num1){
            case 1:
                 System.out.println("jan");
                 break;
            case 2:
                 System.out.println("fev");
                 break;
            case 3:
                 System.out.println("mar");
                 break;
            case 4:
                 System.out.println("abr");
                 break;
            case 5:
                 System.out.println("maio");
                 break;
            case 6:
                 System.out.println("jun");
                 break;
            case 7:
                 System.out.println("jul");
                 break;
            case 8:
                 System.out.println("ago");
                 break;
            case 9:
                 System.out.println("set");
                 break;
            case 10:
                 System.out.println("out");
                 break;
            case 11:
                 System.out.println("nov");
                 break;
            case 12:
                 System.out.println("dez");
                 break;
            case 13:
                 System.out.println("ERRO!!");
                 break;


        }

    }
}
