import java.util.Scanner;
public class kalkulator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("format angka (+,-,*,/,%) angka");
        System.out.println("pisahkan dengan spasi contoh:");
        System.out.println("7 - 6");
        int x = sc.nextInt();
        char z = sc.next().charAt(0);
        int y = sc.nextInt();
    
        switch (z){
            case '+':
            int a=x+y;
            System.out.print(a);
            break;
            
            case '-':
            int b=x-y;
            System.out.print(b);
            break;
            
            case '*':
            int c=x*y;
            System.out.print(c);
            break;
            
            case '/':
            int d=x/y;
            System.out.print(d);
            break;
            
            case '%':
            int e=x%y;
            System.out.print(e);
            break;
            
            default:
            System.out.print("lu gak bisa baca apa gak punya otak");
            break;
        }
    }
}
