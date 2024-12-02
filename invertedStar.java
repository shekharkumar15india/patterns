public class invertedStar {
    
    public static void invertedStar(int n){
       //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");//print star
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     invertedStar(5);   
    }
}
