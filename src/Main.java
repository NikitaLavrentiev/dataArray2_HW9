public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
        int[ ] arr = generateRandomArray();


    }

    public static void task3() {

        System.out.println("\nЗадача_3");
        int[ ] arr = generateRandomArray();


    }

    public static void task4() {

        System.out.println("\nЗадача_4");
    }

    public static void task5() {

        System.out.println("\nЗадача_5");
    }

    public static void task6() {

        System.out.println("\nЗадача_6");
    }

    public static void task7() {

        System.out.println("\nЗадача_7");
    }
}

