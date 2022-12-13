import java.sql.Array;

public class Main {
    private static boolean Array;

    public static void main(String[] args) {
        generateRandomArray();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("\nЗадача_1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int b = 0; b < arr.length; b++) {
            sum += arr[b];
        }

        System.out.println("Сумма трат за месяц составила " + sum);


    }

    public static void task2() {
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        System.out.println("\nЗадача_2");
        int[] arr = generateRandomArray();
        int sum = 0;
        int numberMax = 1;
        int numberMin = 200_001;
        for (int b = 0; b < arr.length; b++) {
            sum += arr[b];
            if (numberMax < arr[b]) {
                numberMax = arr[b];
            }
            if (numberMin > arr[b]) {
                numberMin = arr[b];
            }
        }
        System.out.println("Сумма трат за месяц составила " + sum);
        System.out.println("Минимальная сумма трат за день составила " + numberMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + numberMax + " рублей");


    }

    public static void task3() {
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        // и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        System.out.println("\nЗадача_3");

        int[] arr = generateRandomArray();
        double sum = 0;
        int numberMax = 1;
        int numberMin = 200_001;
        for (int b = 0; b < arr.length; b++) {
            sum += arr[b];
            if (numberMax < arr[b]) {
                numberMax = arr[b];
            }
            if (numberMin > arr[b]) {
                numberMin = arr[b];
            }
        }
        double sumAverage = sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + sum);
        System.out.println("Минимальная сумма трат за день составила " + numberMin + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + numberMax + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage);
    }

    public static void task4() {

        System.out.println("\nЗадача_4");
        //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
        // Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}