public class Main {

    public static void main(String[] args) {
        double a = 10, b = 24, c = -5;
        double x1, x2;

        double diskriminant = b * b - 4 * a * c;

        if (diskriminant >= 0) {

            x1 = ((-b + Math.sqrt(diskriminant))/(2 * a));
            x2 = ((-b - Math.sqrt(diskriminant))/(2 * a));
            System.out.println("Корни уравнения равны: " + x1 + " и " + x2);
        }
        else
            System.out.println("Уравнение не имеет решения");
    }
}


