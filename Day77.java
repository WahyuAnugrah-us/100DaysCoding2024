
public class serah_3 {
    public static void main(String[] args) {
        String a = "serah";
        String b = "serah";
        String c = new String("serah");
        String d = "Java";

        System.out.println("Membandingkan dengan equals");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        System.out.println("Membandingkan dengan '=='");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
