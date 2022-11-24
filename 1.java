import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        label1: System.out.println("Введите день своего рождения: ");
        while(!sc.hasNextInt()){
            if (sc.hasNextInt())
                System.out.println();
            else {
                System.out.println("Ошибка, введите число!");
                sc.next();
            }
        }
        int day = sc.nextInt();
        System.out.println(day);
        sc.close();
    }
}
