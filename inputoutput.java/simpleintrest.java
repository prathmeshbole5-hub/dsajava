import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter principal :  ");
        float p = sc.nextFloat();

        System.out.println("enter time  ");
        float t = sc.nextFloat() ;

        System.out.println("enter rate  ");
        float r = sc.nextFloat() ;

        float simi = p*r*t/100 ;
        System.out.println("the principal is : "+ simi);



    }
}