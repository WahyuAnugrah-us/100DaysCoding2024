import java.util.Scanner;
class serah_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan kata : ");
        String a = sc.nextLine();
        System.out.print("masukan kata : ");
        String b = sc.nextLine();
        if(a.length()>b.length()){
            System.out.print(b+a+b);
        }
        else if(b.length()>a.length()){
            System.out.print(a+b+a);
        }
    }
}
