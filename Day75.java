import java.util.Scanner;
public class apa {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.print("masukan jari jari lingkaran :");
        int jari =sc.nextInt();
        int diameter =jari*2;
        sc.nextLine();
        System.out.print("operasi (lingkaran/luas) :");
        String b =sc.nextLine();
        
        double phi;
        if (jari%7==0){
            phi = 22.0/7;
        }else{
            phi = 3.14;
        }
        
        switch (b){
            case "lingkaran":
            double x = phi*1.0/4*diameter*diameter;
            System.out.print("lingkaran :"+x);
            break;
            case "luas":
            double y = phi*jari*jari;
            System.out.print("luas :"+y);
            break;
            default:
            break;
        }
        
        
    }
}
