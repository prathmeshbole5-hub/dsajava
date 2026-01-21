


import java.util.Scanner ;
public class absolutrevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a number :  ");
        int a = sc.nextInt();
        if(a > 0) {
            System.out.println("the number is positive ");
        }

        else{
            int positive = a*-1 ;
            System.out.println("the absolute value is :  "+ positive);
        }


    }
}

