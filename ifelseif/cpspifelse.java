



import java.util.Scanner;


public class cpspifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cp: ");
        int cp = sc.nextInt();
        System.out.println("enter the sp: ");
        int sp = sc.nextInt();

        if(sp>cp){
            int profit = sp - cp ;
            System.out.println("the profit you made is : " + profit );
        }
        else{
            int loss = cp - sp ;
            System.out.println("the loss you made is  "+ loss);
        }

    }
}
