import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }


    public static void task1() {
        System.out.println("Задача №1");

        int age = 17;

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен" + age + ", то  он совершеннолетний");
        }
        System.out.println();


    }

    public static void task2() {
        System.out.println("Задача №2");

        int temperature = 3;

        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");

        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч,  можно ездить спокойно");
        }

        System.out.println();


    }

    public static void task4() {
        System.out.println("Задача №4");

        int age = 1;
        if ((age >= 2 && age <= 6)) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад ");
        }
        else if ((age >= 7) && (age <= 18)) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу ");
        }
        else if ((age >= 18) && (age <= 24)) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет ");
        }
        else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу ");
        }
        else {
            System.out.println("Еще слишком мал даже ждя детского сада");
        }
        System.out.println();


    }

    public static void task5() {
        System.out.println("Задача №5");

        int age = 5;
        boolean isAdultHere = true;
        if(age < 5){
            System.out.println("Если возраст ребенка равен "+ age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age <= 14 && isAdultHere){
            System.out.println("Если возраст ребенка равен "+ age + ", то ему можно кататься на аттракционе в сопровождении");

        }
        else {
            System.out.println("Если возраст ребенка равен "+ age + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        }
        System.out.println();

    }
    public static void task6() {
        System.out.println("Задача №6");

        int passengers = 54;
        int sittingPlaces = 60;
        int totalPlaces = 102;

        if (passengers <= totalPlaces&&passengers <= sittingPlaces){
            System.out.println("Уважаемые пасажиры! В вогоне есть только " + sittingPlaces + " сидячих мест, остальные места стоячие");
        }
        else {
            System.out.println("Уважаемые пассажиры! Мест в вагоне нету");
        }
        System.out.println();


    }
    public static void task7() {
        System.out.println("Задача №7");

        int one = 132;
        int two = 30;
        int three = 48;

        if (one > two && one > three) {
                System.out.println("Максимальное число - " + one);
            }
        else if(two > three) {
            System.out.println("Максимальное число - " + two);
        } else {
            System.out.println("Максимальное число - " + three);
        }
    }



}
