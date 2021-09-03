package com.company;

public class Main {


    public static void main(String[] args) {

        int age = 29;
        int temp = 18;

        if (age > 10 && age < 45 && temp > -20 && temp < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 10 && temp > 0 && temp < 8) {
            System.out.println("Можно гулять,но не долго");
        } else if (age > 65 && temp < -10 && temp > 25) {
            System.out.println("Лучше остаться дома");
        } else {
            System.out.println("Нельзя идти гулять!");
        }

        String dayString = "Четверг";

        switch (dayString) {
            case "Понедельник":
                System.out.println("Понедельник");
                break;
            case "Вторник":
                System.out.println("Вторник");
                break;
            case "Среда":
                System.out.println("Среда");
                break;
            case "Четверг":
                System.out.println("Четверг");
                break;
            case "Пятница":
                System.out.println("Пятница");
                break;
            case "Суббота":
                System.out.println("Суббота");
                break;
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Другое");
                break;

        }
    }
}
