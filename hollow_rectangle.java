

public class hollow_rectangle {
public static void hallow_rectangle(int rows,int cols){
    //outer loop
    for(int i=1;i<=rows;i++){
    //inner loop
    for(int j=1;j<=cols;j++){
        if(i==1 || i==rows || j==1 || j==cols){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
    }
}
    public static void main(String[] args) {
       hallow_rectangle(5, 5); 
    }
}