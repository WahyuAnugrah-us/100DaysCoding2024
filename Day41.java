import java.util.Scanner;
public class PertemuanMentor1 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukan batas angka:");
        int a=sc.nextInt();
        for (int i=0; i<a ;i++){
            if(i%2==1){
                System.out.print(" "+i);
            }
            
        }
        
    }
}    
