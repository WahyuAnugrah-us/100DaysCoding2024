import java.util.Scanner;
import java.time.LocalTime;
public class day_100_nich {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");//sok ingris dulu kita
        String b = sc.nextLine();
        LocalTime a = LocalTime.now();
        LocalTime pagi = LocalTime.of(5,0);
        LocalTime siang = LocalTime.of(12,0);
        LocalTime malam = LocalTime.of(5,0);
        if (a.isBefore(siang)&&a.isAfter(pagi)){
            System.out.println("===================================");
            System.out.println("Selamat pagi "+b);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        
        }
        else if (a.isBefore(malam)&&a.isAfter(siang)){
            System.out.println("===================================");
            System.out.println("Selamat siang "+b);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        }else{
            System.out.println("===================================");
            System.out.println("Selamat malam "+b);
            System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        }
        
    }
}
