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
        boolean diapDay  = (day >= 1 && day <= 31);
        while (diapDay  == false)
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
                        diapDay = (day >= 1 && day <= 31);
                       }
                 diapDay = (day >= 1 && day <= 31);
        }
        System.out.println("Введите месяц, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int month = sc.nextInt();
        boolean diapM = (month >= 1 && month <= 12);
        while (diapM == false)
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
                diapM = (month >= 1 && month <= 12);
            }
            diapM = (month >= 1 && month <= 12);
        }
        System.out.println("Введите год, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int year = sc.nextInt();
        boolean diapYear = (year >= 1900 && year <= 2022);
        while (diapYear == false)
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
                diapYear = (year >= 1900 && year <= 2022);
            }
            diapYear = (year >= 1900 && year <= 2022);
        }
        int currentDay = 17;
        int currentMonth = 11;
        int currentYear = 2022;
        int currentYearAge = 0;
         if(currentMonth > month)
          currentYearAge = currentYear - year;
            else{
                if(currentMonth == month && currentDay >= day)
                    currentYearAge = currentYear - year;
                if(currentMonth == month && currentDay <= day)
                    currentYearAge = currentYear - (year + 1);
                if(currentMonth < month)
                    currentYearAge = currentYear - (year + 1);
                }
        System.out.println(day);
        System.out.println(month);
        System.out.println(currentYearAge + " " + "лет");
    }
}