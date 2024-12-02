public class invertedHalfRotatedPttern {
  public static void invertedHalfRotatedPttern(int n){
    //outer loop for rows
    for(int i=1;i<=n;i++){
//inner loop 
for(int j=1;j<=n-i;j++){
    System.out.print(" ");//print spaces
 } //nested  loop 
   for(int j=1;j<=i;j++){
    System.out.print("*");//print stars
   }
   System.out.println();
}
    }
  
  
  
    public static void main(String[] args) {
        invertedHalfRotatedPttern(10);
    }
}
