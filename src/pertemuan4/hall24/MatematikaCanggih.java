package pertemuan4.hall24;

public class MatematikaCanggih extends Matematika {
    String nama;
    String nim;

    public MatematikaCanggih(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        System.out.println(nama + " " + nim);
    }

    public double perkalian(double a, double b) {
        return a * a;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}