import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число X: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Введите,пожалуйста, целое или дробное число через запятую: ");
            sc.next();
        }
        double x = sc.nextDouble();
        System.out.println("Введите степень, в которую хотите возвести X: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Введите,пожалуйста, целое или дробное число через запятую: ");
            sc.next();
        }
        double n = sc.nextDouble();
        boolean rangeN = (n >= -15 && n<=15);
        while (rangeN == false) {
            System.out.println("Введите, пожалуста, степень от -15 до 15: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите, пожалуста, степень от -15 до 15: ");
                sc.next();
            }
            n = sc.nextDouble();
            if (n >= -15 && n<=15)
                rangeN = true;
        }
        double result = 1;
        if( n > 0 )
            for (int i = 1; i <=n; i++){
                result = x*result;
            }
        if(n == 0)
            result = 1;
        if( n < 0)
            for (int u = -1; u >= n; u--){
                result = result/x;
            }
        System.out.println("Исходный результат равен: " + result);
    }}