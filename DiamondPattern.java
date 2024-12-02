public class DiamondPattern {
    public static void DiamondPattern(int n){
     //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //inner loop
            //print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    DiamondPattern(5);
    }
}
