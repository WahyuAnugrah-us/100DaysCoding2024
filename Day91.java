import java.util.Scanner;
public class oke {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("masukan nilai untuk You: ");
        int you = sc.nextInt();

        System.out.print("masukan nilai untuk I: ");
        int i = sc.nextInt();
        
        if (you > i) {
            System.out.println("You menang.");
        } else if (i > you) {
            System.out.println("I menang.");
        } else {
            System.out.println("seri.");
        }
        
        System.out.print("end");
    }
}
