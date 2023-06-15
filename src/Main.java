// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1.");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2.");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3.");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        for (int i = 10; i > - 10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5.");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является высокосным.");
        }
    }
    public static  void task6() {
        System.out.println("Задача 6.");
        for ( int i = 0; i < 100; i = i + 7) {
            System.out.println(i);
        }
        }

        public static void task7() {
            System.out.println("Задача 7.");
            for ( int i = 1; i < 513; i = i * 2) {
                System.out.println(i);
            }
        }

        public static void task8() {
            System.out.println("Задача 8.");
            int contribution = 29000;
            int compilation = 0;
            for (int i = 1; i < 13; i ++) {
                compilation = compilation + contribution;
                System.out.println("Месяц " + i + " сумма накомпления равна " +compilation+ " рублей.");
            }

        }

    public static void task9() {
        System.out.println("Задача 9.");
        int sum = 29000;
        int compilation = 0;
        for (int i = 1; i < 13; i ++) {
            sum = sum + sum/100;
            sum = sum + compilation;
            System.out.println("Месяц " + i + " сумма накомпления равна " +sum+ " рублей.");
        }

    }

    public static void task10() {
        System.out.println("Задача 10.");
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " +i + " = " +i*2);
        }

        }

    }
