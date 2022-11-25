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
        double digit = sc.nextDouble();
        System.out.println("Введите степень, в которую хотите возвести X: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Введите,пожалуйста, целое или дробное число через запятую: ");
            sc.next();
        }
        double stepen = sc.nextDouble();
        boolean rangeStepen = (stepen >= -15 && stepen <= 15);
        while (rangeStepen == false) {
            System.out.println("Введите, пожалуста, степень от -15 до 15: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите, пожалуста, степень от -15 до 15: ");
                sc.next();
            }
            stepen = sc.nextDouble();
            if (stepen >= -15 && stepen <= 15)
                rangeStepen = true;
        }
        double result = 1;
        if( stepen > 0 )
            for (int i = 1; i <=stepen; i++){
                result = digit*result;
            }
        if(stepen == 0)
            result = 1;
        if( stepen < 0)
            for (int u = -1; u >= stepen; u--){
                result = result/digit;
            }
        System.out.println("Исходный результат равен: " + result);
    }}