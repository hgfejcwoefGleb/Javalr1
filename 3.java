import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int AmountOfPoints = sc.nextInt();
        System.out.println("Введите радиус: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        double rad = sc.nextDouble();
        boolean radSign = (rad >= 0);
        while (radSign == false) {
            System.out.println("Введите, пожалуста, положительное целое число или положительное дробное через запятую : ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите, пожалуста, положительное целое число или положительное дробное через запятую : ");
                sc.next();
            }
            rad = sc.nextDouble();
            if (rad >= 0)
                radSign = true;
        }
        int collectedPoints = 0;
        for (int i = 1; i <= AmountOfPoints; i++) {
            System.out.println("Введите координаты точки X: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите,пожалуйста, целое или дробное число через запятую: ");
                sc.next();
            }
            double x = sc.nextDouble();
            System.out.println("Введите координаты точки Y: ");

            while (!sc.hasNextDouble()) {
                System.out.println("Введите,пожалуйста, целое или дробное число через запятую: ");
                sc.next();
            }
            double y = sc.nextDouble();
            if (x * x + y * y <= rad * rad)
                collectedPoints++;
        }
        System.out.println(collectedPoints + " " + "точек/точки попало в окружность");
    }
}
