import java.util.Scanner;
public class serah_1 {
    public static int faktorial(int x){
        if (x==0){
            return 1;
        }else{
            return x*faktorial(x-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan angka :");
        int y = sc.nextInt();
        System.out.print(faktorial(y));
    }
}
