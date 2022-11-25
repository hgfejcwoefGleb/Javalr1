import java.util.Scanner;
public class Main {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int month = sc.nextInt();
        boolean diapM = (month >= 1 && month <= 12);
          while (diapM == false)
          {
              System.out.println("Введите, пожалуйста, число от 1 до 12: ");
              if (sc.hasNextInt())
                  month = sc.nextInt();
              else
              {
                  while (!sc.hasNextInt())
                  {
                      System.out.println("Введите, пожалуста, число целое: ");
                      sc.next();
                  }
                  month = sc.nextInt();
                  diapM = (month >= 1 && month <= 12);
              }
              diapM = (month >= 1 && month <= 12);
          }
        int amDayOfBornMonth = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                amDayOfBornMonth = 31;
                break;
            case 4, 6, 9, 11:
                amDayOfBornMonth = 30;
                break;
            case 2:
                amDayOfBornMonth = 28;
                break;
        }
        System.out.println("Введите день: ");
        while (!sc.hasNextInt()) {
            System.out.println("Введите,пожалуйста, целое число: ");
            sc.next();
        }
        int day = sc.nextInt();
        boolean diapDay = false;
           if (amDayOfBornMonth == 31)
            diapDay = (day >= 1 && day <= 31);
               while (diapDay == false)
               {
                  System.out.println("Введите, пожалуйста, число от 1 до 31: ");
                    if (sc.hasNextInt())
                      day = sc.nextInt();
                      else
                      {
                          while (!sc.hasNextInt())
                            {
                              System.out.println("Введите, пожалуста, число целое: ");
                               sc.next();
                            }
                           day = sc.nextInt();
                           diapDay = (day >= 1 && day <= 31);
                      }
                 diapDay = (day >= 1 && day <= 31);
               }
        if (amDayOfBornMonth == 30)
            diapDay = (day >= 1 && day <= 30);
                while (diapDay == false)
                {
                   System.out.println("Введите, пожалуйста, число от 1 до 30: ");
                    if (sc.hasNextInt())
                      day = sc.nextInt();
                        else
                        {
                          while (!sc.hasNextInt())
                            {
                              System.out.println("Введите, пожалуста, число целое: ");
                              sc.next();
                            }
                              day = sc.nextInt();
                              diapDay = (day >= 1 && day <= 30);
                        }
                  diapDay = (day >= 1 && day <= 30);
                }
            if (amDayOfBornMonth == 28)
                 diapDay = (day >= 1 && day <= 28);
                      while (diapDay == false)
                      {
                        System.out.println("Введите, пожалуйста, число от 1 до 28: ");
                          if (sc.hasNextInt())
                             day = sc.nextInt();
                              else
                              {
                                  while (!sc.hasNextInt())
                                  {
                                      System.out.println("Введите, пожалуста, число целое: ");
                                      sc.next();
                                  }
                                    day = sc.nextInt();
                                    diapDay = (day >= 1 && day <= 28);
                              }
                                  diapDay = (day >= 1 && day <= 28);
                      }
        String season = "";
        switch(month)
        {
            case 12, 1, 2: season = "Зима";
                break;
            case 3, 4, 5: season = "Весна";
                break;
            case 6, 7, 8: season = "Ура, лето!";
                break;
            case 9, 10, 11: season = "Осень";
                break;
         }
        System.out.println(season);
    }}

