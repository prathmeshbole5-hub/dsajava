



import java.util.Scanner;

class Algebra{int a;
    int b;

    Algebra(int x ,int y){
        System.out.println("construvtor of algebra class");
    }
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class method2 {
    public static void main(String[] args) {
        int x;
        int y;
        Algebra object = new Algebra(x = 5, y = 7);
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("sum of input number is ");
        int ans = object.add(x,y);
        System.out.println(ans);
    }
}