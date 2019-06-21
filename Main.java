import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double a , b , c;
        double x1, x2;
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double diskriminant = b * b - 4 * a * c;

        if (diskriminant >= 0) {

            x1 = ((-b + Math.sqrt(diskriminant))/(2 * a));
            x2 = ((-b - Math.sqrt(diskriminant))/(2 * a));
            System.out.println("Корни уравнения равны: " + x1 + " и " + x2);
        }
        else if (diskriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else
            System.out.println("Уравнение не имеет решения");
    }
}


