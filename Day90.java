import java.util.Scanner;
public class ada_lagi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah angka : ");
        int n = sc.nextInt();
        
        int m[] = new int[n];
        int p[] = new int[n]; 
        int q[] = new int[n];
        int w =0;
        int z =0;
        
        
        for ( int i=0;i<n;i++){
            m[i] = sc.nextInt();
            if (m[i]%2==0){
                p[w++]=m[i];
                }
            else {
                q[z++]=m[i];
            }
        }
        System.out.println("Angka genap");
        for ( int i=0;i<w;i++){
            System.out.print(p[i]+" ");
        }
        System.out.println("");
        System.out.println("Angka ganjil");
        for ( int i=0;i<z;i++){
            System.out.print(q[i]+" ");
        }
    }
}
