import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalTime;
public class day_100_nich {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");//sok ingris dulu kita
        String b = sc.nextLine();
        
        
        ZoneId sona = ZoneId.of("GMT+8");
        ZonedDateTime sonawaktu = ZonedDateTime.now(sona);
        LocalTime a =sonawaktu.toLocalTime();
        
        if (a.isBefore(LocalTime.of(12,0))){
            System.out.println("===================================");
            System.out.println("Selamat pagi "+b);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        
        }
        else if (a.isBefore(LocalTime.of(17,0))){
            System.out.println("===================================");
            System.out.println("Selamat siang "+b);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        }
        
        else{System.out.println("===================================");
            System.out.println("Selamat malam "+b);
            System.out.println("Program Anda Telah Selesai");
        System.out.println("===================================");
        }
        
    }
}
