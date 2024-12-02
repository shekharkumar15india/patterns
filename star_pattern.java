public class star_pattern {
    public static void star_pattern(int n){
        //outer loop for rows
        for(int i =1;i<=n;i++){
            //innner loop for colums
            for(int j=1 ;j<=i;j++){
                System.out.print("*");//print the star
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star_pattern(4);
    }
}
