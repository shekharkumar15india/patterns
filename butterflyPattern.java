public class butterflyPattern {
    public static void butterflyPattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");//print star
            }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");//print spaces
                }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");//print star
                }
            
            
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");//print star
            }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");//print spaces
                }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");//print star
                     }
                    
               System.out.println(); 
            }
    }
    public static void main(String[] args) {
      butterflyPattern(4);  
    }
}
