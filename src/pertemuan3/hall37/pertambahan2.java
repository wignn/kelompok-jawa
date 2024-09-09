package pertemuan3.hall37;

public class pertambahan2 {
    public static void main(String[] args) {
        int w, x, y, z;

        x = 5;
        w = 5;

        y = 8 - x++;
        System.out.println("Nilai saat ini: x = " + x + ", y = " + y);

        z = 8 - ++w;
        System.out.println("Nilai saat ini: w = " + w + ", z = " + z);
    }
}
