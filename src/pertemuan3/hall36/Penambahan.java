package pertemuan3.hall36;

public class Penambahan {
    public static void main(String[] args) {
        int x, y, z;

        x = 42;
        y = x++;
        System.out.println("Nilai saat ini: x = " + x + ", y = " + y);

        z = ++x;
        System.out.println("Nilai saat ini: x = " + x + ", z = " + z);
    }

}
