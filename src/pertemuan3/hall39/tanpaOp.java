package pertemuan3.hall39;

public class tanpaOp {
    public static void main(String[] args) {
        int x = 16;
        int n = 2;

        int Kali = x << n;
        System.out.println(x + " * 2^" + n + " = " + Kali);

        int Bagi = x >> n;
        System.out.println(x + " / 2^" + n + " = " + Bagi);
    }
}
