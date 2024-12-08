import java.util.Scanner;
public class apalah {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan nilai x : ");
        int x = sc.nextInt();
        System.out.print("masukan nilai y : ");
        int y = sc.nextInt();
        int z = 0;
        
        for(int i=x;i<=y;i++){
            if(i%2==0){
                z+=i;
            }
        }
        System.out.printf("hasil penjumlahan bilangan genap dari %d ke %d adalah %d",x,y,z);
        
        
        
    }
}
