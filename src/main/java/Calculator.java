import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.stream.StreamSupport;
import static java.lang.Math.log;
import static java.lang.Math.pow;
    public class Calculator {
        public static void main(String args[])
        {
            System.out.println("Enter your choice for calculation \n 1. Factorial Function \n 2. Square Root \n 3.Power Function \n 4. Natural Log (Base e) \n)");
            Scanner sc = new Scanner(System.in);
            Integer n= sc.nextInt();
            switch (n)
            {
                case 1: calcfact();
                    break;
                case 2: calcsqroot();
                    break;
                case 3: calcpower();
                    break;
                case 4: calcnatlog();
                    break;
            }
        }

        private static void calcnatlog() {
            Double x;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number whose power is to be calculated");
            x=sc.nextDouble();
            Double op = log(x);
            System.out.println("Output is :" + op);
        }
        private static void calcfact() {
            Integer x;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number whose power is to be calculated");
            x=sc.nextInt();
            Integer op = 1;
            for(Integer i = x; i>=1; i--)
            {
                op*= i;
            }
            System.out.println("Output is :" + op);
        }

        private static void calcpower() {
            Integer x, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number whose power is to be calculated");
            x=sc.nextInt();
            System.out.println("Enter power to be calculated");
            b=sc.nextInt();
            Double op = pow(x,b);
            System.out.println("Output is :" + op);
        }

        private static void calcsqroot() {
            Double x, b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number whose power is to be calculated");
            x=sc.nextDouble();
            System.out.println("Enter power to be calculated");
            b=sc.nextDouble();
            Double op = pow(x,1/b);
            System.out.println("Output is :" + op);
        }
    }
}
