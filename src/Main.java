import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] cartas = new int[7][1];

        for (int i = 0; i < cartas.length; i++) {
            System.out.print("Digite a ordem das cartas: ");
            cartas[i][0] = scanner.nextInt();
            scanner.nextLine();
        }



        System.out.println("A ordem digitada foi:");//Ordem digitada
        for (int i = 0; i < cartas.length; i++) {
            System.out.print(cartas[i][0] + ", ");
        }

        System.out.println("\nSua ordem em Bubble Sort:");//BubbleSort
        for (int i = 0; i < cartas.length; i++) {
            bubbleSort.sort(cartas);
            System.out.print(cartas[i][0] + ", ");
        }

    }
}