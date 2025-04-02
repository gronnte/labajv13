package org.example.tes;
import java.util.Scanner;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester() {
        this.name = "хехе";
        this.surname = "хаха";
        this.experienceInYears = 3;
        this.englishLevel = "В2";
        this.salary = 1300;
    }
    public Tester(String name, String surname, Scanner scanner) {
        System.out.print("введите опыт работы: ");
        this.experienceInYears = scanner.nextInt();
        System.out.print("введите уровень английского (A1-C2): ");
        this.englishLevel = scanner.next();
        this.salary = 1500.0;
        this.name = name;
        this.surname = surname;
    }

    public void adjustSalary(double amount) {
        this.salary += amount;
    }

    public void adjustSalary(double amount, String reason) {
        this.salary += amount;
        System.out.println("зп изменена на " + amount +
                " по причине: " + reason);
    }

    public void adjustSalary(boolean isBonus) {
        if (isBonus) {
            this.salary *= 1.1; //
        }
    }
    public void printInfo() {
        System.out.println("имя: " + name + ", фамилия: " + surname + ", опыт заботы: "+experienceInYears+", уровень английского: "+englishLevel+", зп:"+salary);
    }
    public static void printProfessionInfo() {
        System.out.println("профессия: тестировщик ");
        System.out.println("средний опыт работы: 3-5 лет");
        System.out.println("требуемый английский: от B1");
    }
}