public class solidRohmbus {
   public static void solidRohmbus(int n){
    //outer loop
    for(int i=1;i<=n;i++){
//inner loop
//print spaces
for(int j=1;j<=(n-i);j++){
    System.out.print(" ");
}
//print star
for(int j=1;j<=n;j++){
    System.out.print("*");
}
System.out.println();
    }
   }
    public static void main(String[] args) {
        solidRohmbus(5);
    }
}
