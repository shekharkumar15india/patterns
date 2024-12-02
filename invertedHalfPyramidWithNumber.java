public class invertedHalfPyramidWithNumber {
public static void invertedHalfPyramidWithNumber(int n){
    //outer loop
    for(int i=n ;i>=1;i--){
        //inner loop
        for(int j=1;j<=i;j++){
System.out.print(j);//print the number
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        invertedHalfPyramidWithNumber(5);
    }
}
