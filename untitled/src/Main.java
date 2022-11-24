import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int day = sc.nextInt();
        boolean diap = (day >= 1 && day <= 31);
        while (diap == false)
        {
            System.out.println("Введите, пожалуйста, число от 1 до 31: ");
                 if(sc.hasNextInt())
                  day = sc.nextInt();
                 else  {
                        while(!sc.hasNextInt())
                            {
                            System.out.println("Введите, пожалуста, число целое: ");
                            sc.next();
                            }
                        day = sc.nextInt();
                        diap = (day >= 1 && day <= 31);
                       }
                 diap = (day >= 1 && day <= 31);
        }
        System.out.println("Введите месяц, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int month = sc.nextInt();
        boolean diapm = (month >= 1 && month <= 12);
        while (diapm == false)
        {
            System.out.println("Введите, пожалуйста, число от 1 до 12: ");
            if(sc.hasNextInt())
                month = sc.nextInt();
            else  {
                while(!sc.hasNextInt())
                {
                    System.out.println("Введите, пожалуста, число целое: ");
                    sc.next();
                }
                month = sc.nextInt();
                diapm = (month >= 1 && month <= 12);
            }
            diapm = (month >= 1 && month <= 12);
        }
        System.out.println("Введите год, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int year = sc.nextInt();
        boolean diapyear = (year >= 1900 && year <= 2022);
        while (diapyear == false)
        {
            System.out.println("Введите, пожалуйста, число от 1900 до 2022: ");
            if(sc.hasNextInt())
                year = sc.nextInt();
            else  {
                while(!sc.hasNextInt())
                {
                    System.out.println("Введите, пожалуста, число целое: ");
                    sc.next();
                }
                year = sc.nextInt();
                diapyear = (year >= 1900 && year <= 2022);
            }
            diapyear = (year >= 1900 && year <= 2022);
        }
        int currentday = 17;
        int currentmonth = 11;
        int currentyear = 2022;
        System.out.println(day);
        System.out.println(month);
    }
}