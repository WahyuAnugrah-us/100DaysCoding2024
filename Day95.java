
public class lagi_ {
    public static void main(String[]args){
        int a = 6;
        for(int i = 0;i<a;i++){
            for(int j = 0;j<i;j++){
            System.out.print("*");
        }
            
            for(int j = 0;j<(a-i)*2;j++){
            System.out.print(" ");
        }
            
            for(int j = 0;j<i;j++){
            System.out.print("*");
        }
            System.out.println();
        }
        
        
    }
}
