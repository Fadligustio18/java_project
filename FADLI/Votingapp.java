package FADLI;

import java.util.Scanner;

public class Votingapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votes = new int[3];
        String[] candidates = { "Fadli, Rido, Arivin, gani" };
        int choice;
        do {
            System.out.println("\n===Aplikasi Voting ===");
            System.out.println("1. Vote untuk Fadli");
            System.out.println("2. Vote untuk Rido");
            System.out.println("3. Vote untuk Arivin");
            System.out.println("4. Vote untuk gani");
            System.out.println("5. Lihat Hasil Voting");
            System.out.println("6. keluar");
            System.out.println("Pilih menu (1-6): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    votes[choice - 1]++;
                    System.out.println("Terima kasih sudah memilih " + candidates[choice - 1]);
                    break;
                case 4:
                    System.out.println("\n=== Hasil Voting ===");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println(candidates[i] + ":" + votes[i] + "suara");

                    }
                    break;
                case 5:
                    System.out.println("Keluar dari prongram voting. ");
                    break;
                default:
                    System.out.println("Pilih tidak valid.");

            }
        } while (choice != 5);

        scanner.close();
    }
}