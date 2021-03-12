import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.stream.StreamSupport;
import static java.lang.Math.log;
import static java.lang.Math.pow;
    public class Main {
        public static void main(String args[])
        {
            System.out.println("Enter your choice for calculation \n 1. Factorial Function \n 2. Square Root \n 3.Power Function \n 4. Natural Log (Base e) \n)");
            Scanner sc = new Scanner(System.in);
            Integer n= sc.nextInt();
            switch (n)
            {
                case 1:
                    Integer x;
                    System.out.println("Enter a number whose Factorial is to be calculated");
                    x=sc.nextInt();
                    Integer op = calcfact(x);
                    System.out.println("Output is :" + op);

                    break;
                case 2:
                    Double x1, b;
                    System.out.println("Enter a number whose Square Root is to be calculated");
                    x1=sc.nextDouble();
                    Double op1 = calcsqroot(x1);
                    System.out.println("Output is :" + op1);

                    break;
                case 3:
                    Integer x2, b1;
                    System.out.println("Enter a number whose power is to be calculated");
                    x2=sc.nextInt();
                    System.out.println("Enter power to be calculated");
                    b1=sc.nextInt();
                    Double op2 = calcpower(x2, b1);
                    System.out.println("Output is :" + op2);
                    break;
                case 4:
                    Double x3;
                    System.out.println("Enter a number whose Natural Log is to be calculated");
                    x3=sc.nextDouble();
                    Double op3 = calcnatlog(x3);
                    System.out.println("Output is :" + op3);
                    break;
            }
        }

        static Double calcnatlog(Double x) {

            Double op = log(x);
            return op;
        }
        static Integer calcfact(Integer x) {

            Integer op = 1;
            for(Integer i = x; i>=1; i--)
            {
                op*= i;
            }
            return op;
        }

        static Double calcpower(Integer x, Integer b) {

            Double op = pow(x,b);
            return op;
        }

        static Double calcsqroot(Double x) {
            Double op = pow(x,1/2.0);
            return op;
        }
    }
