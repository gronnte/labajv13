package org.example.tes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("создаем спеца");

            Tester defaultTester = new Tester();
            System.out.println("\nтестировщик по умолчанию:");
            defaultTester.printInfo();

            System.out.println("\nспец с вводом данных:");
            Tester manualTester = new Tester("Алексей", "Смирнов", 4, "С1", 1500);
            manualTester.printInfo();

            Tester fullTester = new Tester("Мария", "Иванова", 4, "B2", 2000.0);
            System.out.println("\nтестировщик с полными параметрами:");
            fullTester.printInfo();

            System.out.println("\nизменение зп");

            defaultTester.adjustSalary(300.0);
            System.out.println("\nувеличения зарплаты на 300:");
            defaultTester.printInfo();

            fullTester.adjustSalary(500.0, "премия");
            fullTester.printInfo();

            manualTester.adjustSalary(true);
            System.out.println("\n10% бонуса:");
            manualTester.printInfo();

            System.out.println("\nинф");
            Tester.printProfessionInfo();

            System.out.print("\nхотите создать еще одного тестировщика? (да/нет): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("да")) {
                System.out.print("введите имя: ");
                String name = scanner.next();
                System.out.print("введите фамилию: ");
                String surname = scanner.next();
                System.out.print("введите опыт работы: ");
                int experienceInYears = scanner.nextInt();
                System.out.print("введите уровень английского (A1-C2): ");
                String englishLevel = scanner.next();
                Tester newTester = new Tester(name, surname, experienceInYears, englishLevel, 1500 );
                System.out.println("\nновый спец создан:");
                newTester.printInfo();

                System.out.print("хотите изменить зарплату? (да/нет): ");
                if (scanner.next().equalsIgnoreCase("да")) {
                    System.out.print("введите сумму изменения: ");
                    double amount = scanner.nextDouble();
                    newTester.adjustSalary(amount);
                    System.out.println("зарплата изменена:");
                    newTester.printInfo();
                }


        }
        } finally{
            scanner.close();
        }
        System.out.println("\nвсё");
    }
}