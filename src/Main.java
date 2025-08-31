public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        clientOS = 0;
        int year = 2016;
        if (clientOS == 0) {
            if (year > 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (year > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        year = 2016;
        if (year < 1584)
            System.out.println(year + " год не является високосным");
        else {
            if (year % 100 == 0 && year % 400 != 0)
                System.out.println(year + " год не является високосным");
            else if (year % 4 == 0)
                System.out.println(year + " год является високосным");
            else
                System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 115;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: 1");
        else if (deliveryDistance <= 60)
            System.out.println("Потребуется дней: 2");
        else if (deliveryDistance <= 100)
            System.out.println("Потребуется дней: 3");
        else
            System.out.println("Доставки нет.");
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 1;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                default:
                    System.out.println("Осень");
            }
        }

    }
}