package pertemuan4.hall24;

import java.util.Scanner;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        MatematikaCanggih mtk1 = new MatematikaCanggih(nama, nim);

        boolean w = true;

        while (w) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Pertambahan (2 angka)");
            System.out.println("2. Pertambahan (3 angka)");
            System.out.println("3. Pengurangan (2 angka)");
            System.out.println("4. Pengurangan (3 angka)");
            System.out.println("5. Perkalian");
            System.out.println("6. Pembagian");
            System.out.println("7. Modulus");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("Pertambahan (2 angka)");
                    System.out.print("Masukkan a: ");
                    double a1 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b1 = input.nextDouble();
                    System.out.println("Hasil pertambahan: " + mtk1.pertambahan(a1, b1));
                    System.out.println("-----------------------------------");
                    break;

                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("Pertambahan (3 angka)");
                    System.out.print("Masukkan a: ");
                    double a2 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b2 = input.nextDouble();
                    System.out.print("Masukkan c: ");
                    double c2 = input.nextDouble();
                    System.out.println("Hasil pertambahan: " + mtk1.pertambahan(a2, b2, c2));
                    System.out.println("-----------------------------------");
                    break;

                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("Pengurangan (2 angka)");
                    System.out.print("Masukkan a: ");
                    double a3 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b3 = input.nextDouble();
                    System.out.println("Hasil pengurangan: " + mtk1.pengurangan(a3, b3));
                    System.out.println("-----------------------------------");
                    break;

                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("Pengurangan (3 angka)");
                    System.out.print("Masukkan a: ");
                    double a4 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b4 = input.nextDouble();
                    System.out.print("Masukkan c: ");
                    double c4 = input.nextDouble();
                    System.out.println("Hasil pengurangan: " + mtk1.pengurangan(a4, b4, c4));
                    System.out.println("-----------------------------------");
                    break;

                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("Perkalian");
                    System.out.print("Masukkan a: ");
                    double a5 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b5 = input.nextDouble();
                    System.out.println("Hasil perkalian: " + mtk1.perkalian(a5, b5));
                    System.out.println("-----------------------------------");
                    break;

                case 6:
                    System.out.println("-----------------------------------");
                    System.out.println("Pembagian");
                    System.out.print("Masukkan a: ");
                    double a6 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b6 = input.nextDouble();
                    System.out.println("Hasil pembagian: " + mtk1.pembagian(a6, b6));
                    System.out.println("-----------------------------------");
                    break;

                case 7:
                    System.out.println("-----------------------------------");
                    System.out.println("Modulus");
                    System.out.print("Masukkan a: ");
                    double a7 = input.nextDouble();
                    System.out.print("Masukkan b: ");
                    double b7 = input.nextDouble();
                    System.out.println("Hasil modulus: " + mtk1.modulus(a7, b7));
                    System.out.println("-----------------------------------");
                    break;

                case 8:
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
                if (response.equalsIgnoreCase("n")) {
                    System.out.println("Keluar dari program...");
                    w = false;
                }
            }
        }
        input.close();
    }
}
