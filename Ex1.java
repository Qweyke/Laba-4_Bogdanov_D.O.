import java.util.*;
import static java.lang.Math.*;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Choose the number of a task: from 1 to 5 for tasks according to the variant;" +
                " from 6 (1) to 8 (3) for classwork tasks.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num ==1) {
            System.out.println(ex1F());
            System.out.println(ex1Z());
        }
        else if (num == 2) {
            double[] otvet = ex2();
            System.out.println(otvet[0]);
            System.out.println(otvet[1]);
        }
        else if (num == 3) {
            double[] otvet3 = ex3();
            System.out.println(otvet3[0]);
            System.out.println(otvet3[1]);
        }
        else if (num == 4) {
            double[] otvet4 = ex4();
            System.out.println(otvet4[0]);
            System.out.println(otvet4[1]);
            System.out.println(otvet4[2]);
        }
        else if (num == 5) {
            double[] otvet5 = ex5();
            System.out.println(otvet5[0]);
            System.out.println(otvet5[1]);
        }
        else if (num == 6) {
            double [] otvet1_1 = ex1_1();
            System.out.println(otvet1_1[0]);
            System.out.println(otvet1_1[1]);
        }
        else if (num == 7) {
            System.out.println(ex1_2());
        }
        else if (num == 8) {
            System.out.println(ex1_3());
        }
        else {
            System.out.println("You entered an incorrect data, pls restart the program");
        }
    }
        public static double ex1F() {
        Scanner scan = new Scanner(System.in);
        double d,y1;
        System.out.println("Please enter the meaning of d and y1");
        d = scan.nextDouble();
        y1 = scan.nextDouble();
        return log(d)+((3.5*(d*d)+1)/(cos(2*y1)));
    }
    public static double ex1Z() {
        Scanner scan = new Scanner(System.in);
        double x,y2;
        System.out.println("Please enter the meaning of x and y2");
        x = scan.nextDouble();
        y2 = scan.nextDouble();
        return (sqrt(((2+y2)*(2+y2))+(pow(sin(y2+5),1d/7))))
        /(log(x + 1) - pow(y2, 3));
    }
    public static double[] ex2() {
       Scanner scan = new Scanner(System.in);
       double spos,tpos,spl;
       System.out.println("Enter the distance to the village");
       spos = scan.nextDouble();
       System.out.println("Enter the required time to get to the village");
       tpos = scan.nextDouble();
       System.out.println("Enter the distance from the village to the meeting point");
       spl = scan.nextDouble();
       double vlod, tproshlo, vrek, vlodnast;
       vlodnast = 0;
       vrek = 0;
       if (spl>=spos) {
           System.out.println("You entered an incorrect data, pls restart the program");
       }
       else {
           if (tpos == 1) {
               vlod = spos;
       }
       else {
           vlod = (1*spos)/tpos;
       }
       tproshlo = ((spos+spl)*1)/vlod;
       vrek = (1*(spos-spl))/tproshlo;
       vlodnast = vlod - vrek;
       }
       double[] otvet = new double[2];
       otvet[0] = vlodnast;
       otvet[1] = vrek;
       return otvet;
    }

    public static double[] ex3() {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Please enter a-side ");
        a = scan.nextDouble();
        System.out.println("Please enter b-side");
        b = scan.nextDouble();
        System.out.println("Please enter c-side");
        c = scan.nextDouble();
        double rvpis, ropis;
        if (a == b && b == c) { // Правильный треугольник
            ropis = a / sqrt(3);
            rvpis = a / (2 * sqrt(3));
        } else if ((a == b && b != c)) {// Равнобедренные треугольники
            System.out.println("Ravno");// Маркеры для проверки правильности условий
            rvpis = (c / 2) * (sqrt(((2 * a) - c) / ((2 * a) + c)));
            ropis = (a * a) / (sqrt(4 * (a * a) - (c * c)));
        } else if ((a == c && b != c)) {
            System.out.println("Ravno");
            rvpis = (b / 2) * (sqrt(((2 * a) - b) / ((2 * a) + b)));
            ropis = (a * a) / (sqrt(4 * (a * a) - (b * b)));
        } else if ((b == c && a != c)) {
            System.out.println("Ravno");
            rvpis = (a / 2) * (sqrt(((2 * c) - a) / ((2 * c) + a)));
            ropis = (b * b) / (sqrt(4 * (b * b) - (a * a)));
        } else if ((a * a) == (b * b) + (c * c)) { // Прямоугольные треугольники
            System.out.println("Priam");
            rvpis = (1d / 2) * (c + b - a);
            ropis = a / 2;
        } else if ((b * b) == (a * a) + (c * c)) {
            System.out.println("Priam");
            rvpis = (1d / 2) * (a + c - b);
            ropis = b / 2;
        } else if ((c * c) == (b * b) + (a * a)) {
            System.out.println("Priam");
            rvpis = (1d / 2) * (a + b - c);
            ropis = c / 2;
        } else {
            System.out.println("Razno");
            double p =(a+b+c)/2;
            double Str = (sqrt(p*(p-a)*(p-b)*(p-c)));
            rvpis = Str/p;
            ropis = (a*b*c)/(4*Str);
        }
        double[] otvet3 = new double[2];
        otvet3[0] = rvpis;
        otvet3[1] = ropis;
        return otvet3;
    }
    public static double[] ex4() {
        Scanner scan = new Scanner(System.in);
        double X,Y,Z,A;
        System.out.println("Please enter first member contribution");
        X = scan.nextDouble();
        System.out.println("Please enter second member contribution");
        Y = scan.nextDouble();
        System.out.println("Please enter third member contribution");
        Z = scan.nextDouble();
        System.out.println("Please enter total profit");
        A = scan.nextDouble();
        double sum = X+Y+Z;
        double x,y,z;
        x = (A*X)/sum;
        y = (A*Y)/sum;
        z = (A*Z)/sum;
        double[] otvet4 = new double[3];
        otvet4[0] = x;
        otvet4[1] = y;
        otvet4[2] = z;
        return otvet4;
    }
    public static double[] ex5() {
        Scanner scan = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3;
        System.out.println("Enter the coordinates of the first point(x1)");
        x1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the first point(y1)");
        y1 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point(x2)");
        x2 = scan.nextDouble();
        System.out.println("Enter the coordinates of the second point(y2)");
        y2 = scan.nextDouble();
        System.out.println("Enter the coordinates of the arbitrary point(x3)");
        x3 = scan.nextDouble();
        System.out.println("Enter the coordinates of the arbitrary point(y3)");
        y3 = scan.nextDouble();
        double m = x2 - x1;
        double p = y2 - y1;
        double chislt = (m*x3)+(p*y3)-(m*x2)-(p*y2);
        double znament = pow(m,2)+pow(p,2);
        double t = chislt / znament;
        double prx = (m*t)+x2;
        double pry = (p*t)+y2;
        double[] otvet5 = new double[2];
        otvet5[0] = prx;
        otvet5[1] = pry;
        return otvet5;
    }
    public static double[] ex1_1() {
        Scanner scan = new Scanner(System.in);
        double x,y,z;
        System.out.println("Enter x");
        x = scan.nextDouble();
        System.out.println("Enter y");
        y = scan.nextDouble();
        System.out.println("Enter z");
        z = scan.nextDouble();
        double a = (sqrt(abs(pow(x,2)-6))-sqrt(abs(pow(y,2)-5)))
                /(1+((pow(x,2)/(pow(y,3)+1))))+((pow(y,2)/(pow(x,3)+1)));
        double b = ((pow(x,3)*(pow(atan(z+exp(1)),3))));
        double [] otvet1_1 = new double [2];
        otvet1_1 [0] = a;
        otvet1_1 [1] = b;
        return otvet1_1;
    }
    public static double ex1_2() {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = 2; b = -1; c =3;
        double f,x;
        System.out.println("Enter x");
        x = scan.nextDouble();
        f = (pow((x+a),1d/3))+((c*pow(x,2))/(b+x));
        return f;
    }
    public static double ex1_3() {
        Scanner scan = new Scanner(System.in);
        double f, x;
        System.out.println("Enter x");
        x = scan.nextDouble();
        f = (pow(cos(pow(sin(pow(cos((1 / (pow(x, 2)))), 2)), 3)), 2))
                - abs((pow(x, 3)) + (pow(3, x)));
        return f;
    }
}
