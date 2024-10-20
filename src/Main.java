//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // task 1
        System.out.println("Задача 1");

        int sun = 15000;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {
            i = i + 1;
            total = total + sun;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        // task 2
        System.out.println("Задача 2");

        i = 0;

        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }

        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int yearNow = 2024;
        int birthRate = 17;
        int mortality = 8;

        for (int year = yearNow; year <= (yearNow + 10); year++) {
            population += population * (birthRate - mortality) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // task 4
        System.out.println("Задача 4");

        total = 15_000;
        int month = 0;

        while (total < 12_000_000) {
            month = month + 1;
            total += total / 100 * 7;
            System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей.");
        }

        // task 5
        System.out.println("Задача 5");

        total = 15_000;
        month = 0;

        while (total < 12_000_000) {
            month = month + 1;
            total += total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей.");
            }
        }

        // task 6
        System.out.println("Задача 6");

        total = 15_000;
        month = 9 * 12;
        int monthNew = 0;

        while (monthNew <= month) {
            monthNew++;
            total += total / 100 * 7;
            if (monthNew % 6 == 0) {
                System.out.println("Месяц " + monthNew + ", сумма накоплений " + total + " рублей.");
            }
        }

        // task 7
        System.out.println("Задача 7");

        int friday = 5;

        while (friday < 31) {
            friday++;
            {
                if (friday % 7 == 0) {
                    System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                }
            }
        }

        // tasl 8
        System.out.println("Задача 8");

        int currentYear = 2024;
        int yearAgo = currentYear - 200;
        int yearAfter = currentYear + 100;

        while (yearAgo < yearAfter) {
            yearAgo++;
            {
                if (yearAgo % 79 == 0) {
                    System.out.println(yearAgo);
                }
            }
        }
    }
}