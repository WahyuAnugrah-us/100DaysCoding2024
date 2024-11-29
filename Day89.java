import java.util.Scanner;
public class soal_lagi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah indeks :");
        String n = sc.nextLine();
        int m = Integer.valueOf(n);
        String x []=new String[m];
        
        
        for(int i=0;i<m;i++){
            System.out.print("masukan nilai array :");
            x[i]= sc.nextLine();
        }
        System.out.println("daftar nama teman :");
        for(int i=0;i<m;i++){
            System.out.println(" "+x[i]);
        }
        System.out.print("apakah ada indeks yang ingin di ubah :");
        int y = sc.nextInt();
        
        sc.nextLine();
        
        if (y>=0&&y<m){
            System.out.print("masukan indeks :");
            x[y]=sc.nextLine();
        }
        else {
            System.out.print("indeks tidak valid");
        }
        
        System.out.println("Daftar nama teman yang diperbarui:");
        for (int i = 0; i < m; i++) {
            System.out.println(" "+x[i]);
        }
        
    }
}
