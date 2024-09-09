package pertemuan4.hall14;

import java.util.Scanner;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mtk1 = new MatematikaCanggihBanget();
        Scanner input = new Scanner(System.in);
        boolean w = true;

        while (w) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Pertambahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Modulus");
            System.out.println("4. Pertambahan 3 angka");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan dua angka: ");
                    System.out.print("masukan a: ");
                    int a1 = input.nextInt();
                    System.out.print("masukan b: ");
                    int b1 = input.nextInt();
                    System.out.println("Hasil pertambahan: " + mtk1.pertambahan(a1, b1));
                    System.out.println("-----------------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------------");
                    System.out.print("Pertambahan 2 angka: \n");
                    System.out.print("masukan a: ");
                    int a2 = input.nextInt();
                    System.out.print("masukan b: ");
                    int b2 = input.nextInt();
                    System.out.println("Hasil perkalian: " + mtk1.perkalian(a2, b2));
                    System.out.println("-----------------------------------");
                    break;
                case 3:

                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan dua angka: ");
                    System.out.print("masukan a: ");
                    int a3 = input.nextInt();
                    System.out.print("masukan b: ");
                    int b3 = input.nextInt();
                    System.out.println("Hasil modulus: " + mtk1.modulus(a3, b3));
                    System.out.println("-----------------------------------");
                    break;

                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan tiga angka: ");
                    System.out.print("masukan a: ");
                    int a4 = input.nextInt();
                    System.out.print("masukan b: ");
                    int b4 = input.nextInt();
                    System.out.print("masukan c: ");
                    int c4 = input.nextInt();
                    System.out.println("Hasil pertambahan tiga angka: " + mtk1.pertambahan3(a4, b4, c4));
                    System.out.println("-----------------------------------");
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    w = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
            if (w) {
                System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
                String response = input.next();
                if (response.equals("n")) {
                    System.out.println("Keluar dari program...");
                    w = false;

                }
            }
        }

        input.close();
    }
}
