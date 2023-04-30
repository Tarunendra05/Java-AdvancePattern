public class AdvPattern4 {
    public static void main(String arg[]) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            if (i==1 || i==n){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j=1; j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("+");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }   
            System.out.println();
        }
    }
}