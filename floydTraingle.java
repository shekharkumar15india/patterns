public class floydTraingle {
    public static void floydTraingle(int n){
        //outer loop

        int c=1;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                
                System.out.print(c);
                c++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTraingle(5);
    }
}
