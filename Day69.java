import java.util.Scanner;
public class serah {
         public static double v(double a,double b){
                  return a+b;
         }
         public static double w(double a,double b){
                  return a-b;
         }
         public static double x(double a,double b){
                  return a*b;
         }
         public static double y(double a,double b){
                  if (b==0){
                           System.out.print("error");
                  return 0;
                  }
                  else{
                           return a/b;
                  }
         }
         
                  
                                             
    public static void main (String[]args){
             Scanner sc=new Scanner(System.in);
                  System.out.println("kalkulator sederhana");
         System.out.print("Masukan angka pertama :");
         double a = sc.nextDouble();
         System.out.print("Masukan angka kedua :");
         double b = sc.nextDouble();
         System.out.print("Masukan operator(+,-,*,/) :");
         char c = sc.next().charAt(0);
         
         double z;
         switch (c){
            case'+':
                  z=v(a,b);
                  break;
            case'-':
                  z=w(a,b);
                  break;   
            case'*':
                  z=x(a,b);
                  break;     
            case'/':
                  z=y(a,b);
                  break;
            default:
                  System.out.print("operasi tidak valid");
                  return;
         }
         System.out.print("hasil :"+z);
                  
    }
}
