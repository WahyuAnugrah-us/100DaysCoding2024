
class serah_3 {
    public static void main(String[] args) {
        int[] angka = {73, 78, 63, 28, 46};
        int p =Integer.MIN_VALUE;
        int q =Integer.MAX_VALUE;
        double x = 0;
        for (int i = 0;i<angka.length;i++){
            x+=angka[i];
            if (angka[i]>p){
                p=angka[i];
            }
        }
        for (int i = 0;i<angka.length;i++){
            if (angka[i]<q){
                q=angka[i];
            }
        }
        double y=x/angka.length;
        
        System.out.println("nilai min angka[]: "+q);
        System.out.println("nilai max angka[]: "+p);
        System.out.println("nilai rata rata angka[]: "+y);
        
    }
}
