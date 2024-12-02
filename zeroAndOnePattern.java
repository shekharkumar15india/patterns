public class zeroAndOnePattern {
  public static void zeroAndOnePattern(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
            System.out.print("1");//print one
            }
            else{
                System.out.print("0");//print zero
            }
        }
        System.out.println();
    }
  }  
    public static void main(String[] args) {
        zeroAndOnePattern(5);
    }
}
