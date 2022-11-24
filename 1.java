import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день своего рождения: ");
        int bigday = sc;
        while(big day<=1||>=31)
                {
        if (bigday<=31&&>=1)
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
