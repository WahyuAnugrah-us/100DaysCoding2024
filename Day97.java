import java.util.Scanner;
public class prima_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai n: ");
        int n= sc.nextInt();
            for(int i =0;i<=n;i++){
                boolean a = true;
                if(i<2){
                    a =false;
                }else{
                    for(int j =2;j<=i/2;j++){
                        if(i%j==0){
                            a=false;
                            break;
                        }
                    }
                }
                if(a==true){
                System.out.print(i+" ");
                }
            }
    }
}
