

/*import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
        int AmDayOfBornMonth = 0;
        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12: AmDayOfBornMonth = 31;
                break;
            case 4, 6, 9, 11: AmDayOfBornMonth = 30;
                break;
            case 2: AmDayOfBornMonth = 28;
                break;
            //default: AmDayOfBornMonth = 0;
            //break;
        }
        System.out.println("Введите день, в который вы родились: ");
        while(!sc.hasNextInt())
        {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int day = sc.nextInt();
        boolean diapDay = false;
        if(AmDayOfBornMonth == 31)
            diapDay  = (day >= 1 && day <= 31);
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
        if(AmDayOfBornMonth == 30)
            diapDay  = (day >= 1 && day <= 30);
        while (diapDay  == false)
        {
            System.out.println("Введите, пожалуйста, число от 1 до 30: ");
            if(sc.hasNextInt())
                day = sc.nextInt();
            else  {
                while(!sc.hasNextInt())
                {
                    System.out.println("Введите, пожалуста, число целое: ");
                    sc.next();
                }
                day = sc.nextInt();
                diapDay = (day >= 1 && day <= 30);
            }
            diapDay = (day >= 1 && day <= 30);
        }
        if(AmDayOfBornMonth == 28)
            diapDay  = (day >= 1 && day <= 28);
        while (diapDay  == false)
        {
            System.out.println("Введите, пожалуйста, число от 1 до 28: ");
            if(sc.hasNextInt())
                day = sc.nextInt();
            else  {
                while(!sc.hasNextInt())
                {
                    System.out.println("Введите, пожалуста, число целое: ");
                    sc.next();
                }
                day = sc.nextInt();
                diapDay = (day >= 1 && day <= 28);
            }
            diapDay = (day >= 1 && day <= 28);
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
        int currentMonthAge = 0;
        if(currentMonth >= month && currentDay >= day )
            currentMonthAge = currentMonth - month;
        if(currentMonth >= month && currentDay < day)
            currentMonthAge = currentMonth - (month+1);
        if(currentMonth < month && currentDay >= day)
            currentMonthAge =  currentMonth - month + 12;
        if(currentMonth < month && currentDay < day)
            currentMonthAge =  currentMonth - month + 12;
        int currentDayAge = 0;
        if(currentDay > day)
            currentDayAge = currentDay - day;
        if(currentDay == day)
            currentDayAge = 0;
        if(currentDay < day)
            currentDayAge = currentDay - day + AmDayOfBornMonth;//(количество дней месаца рождения
        System.out.println(currentDayAge + " " + "дней");
        System.out.println(currentMonthAge + " " + "месяцев");
        System.out.println(currentYearAge + " " + "лет");
        sc.close();
    }
}


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
 */
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