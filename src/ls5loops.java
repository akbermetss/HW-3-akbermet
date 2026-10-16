import java.util.Scanner;
public class ls5loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1-task
        System.out.println("-- 1 task --");
        int l = 1;
        while(l <= 1000){
            System.out.println(l);
            l *= 10;
        }

        //2-task
        System.out.println("-- 2 task --");
        for(int n = 1; n <= 1000; n *= 10)
            System.out.println(n);

        //3-task
        System.out.println("-- 3 task --");
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int b = 1;
        while(b <= a){
            System.out.println(b);
            b++;
        }

        //4-task
//        System.out.println("-- 4 task --");
//        for(int m = 1; m > 0; m++)
//            System.out.print(m);

        //5-task
        System.out.println("-- 5 task --");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //6-task
        System.out.println("-- 6 task --");
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //7-task
        System.out.println("-- 7 task --");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
