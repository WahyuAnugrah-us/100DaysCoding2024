import java.util.Scanner;
public class serah_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata :");
        String x = sc.nextLine();
        System.out.print("masukan huruf (>=0 dan < dari jumlah kata) :");
        int y = sc.nextInt();
        int a = x.length();
        if(y>=0&&y<a){
            char z = x.charAt(y);
            System.out.print(z);
        }else{
            System.out.print("bisa baca gak sih lo");
        }
        
    }
}
