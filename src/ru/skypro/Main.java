package ru.skypro;

public class Main {

    public static void main(String[] args) {

        System.out.println("TASK 1");


        int clientOs = 0;
        int clientIOs = 0;
        int clientAndroid = 1;
        ;
        String clientForIOs = "Установите версию приложения для iOS по ссылке";
        String clientForAndroid = "Установите версию приложения для Android по ссылке";
        if (clientOs == 0) {
            System.out.println(clientForIOs);
        } else {
            System.out.println(clientForAndroid);
        }

        System.out.println();
        System.out.println("TASK 2");


        int YearOfProd = 2015;
        int teLYearOfProd = 2014;
        String msgToLiteVer = "для скачивания облегченной версии";

        if (teLYearOfProd <= YearOfProd && clientOs == 0) {
            System.out.println(clientForIOs + " "  + msgToLiteVer);

        } else if (teLYearOfProd <= YearOfProd && clientOs == 1) {
            System.out.println(clientForAndroid + " " + msgToLiteVer);
        }

        System.out.println();
        System.out.println("TASK 3");



        int year = 2020;
        if (year % 4 == 0){
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Год является високосным");
            }
        } else System.out.println ("Год не является високосным");


        System.out.println();
        System.out.println("TASK 4");


        int deliveryDistance = 57;
        int deliveryTime;

        String msg = "На доставку потребуется: ";
        String oneDay =  " день";
        String moreDays = " дня";
        String days = " дней";


        if (deliveryDistance<=20){
            deliveryTime=1;
            System.out.println(msg+deliveryTime+oneDay);
        } else
        if ((deliveryDistance>20)&& (deliveryDistance<=60)) {
            deliveryTime = 2;
            System.out.println(msg+deliveryTime+moreDays);
        } else
        if ((deliveryDistance>60)&& (deliveryDistance<=100)) {
            deliveryTime = 3;
            System.out.println(msg+deliveryTime+moreDays);
        }


        System.out.println();
        System.out.println("TASK 5");


        String winter = "  этот месяц зимний.";
        String spring = "  этот месяц весенний.";
        String summer = "  этот месяц летний.";
        String autumn = "  этот месяц осенний.";
        String mistakeMsg  = "Указанного месяца не существует, попробуйте ввести другой.";
        int monthNumber=15;
        switch (monthNumber) {
            case 1:
                System.out.println(winter);
                break;
            case 2:
                System.out.println(winter);
                break;
            case 3:
                System.out.println(spring);
                break;
            case 4:
                System.out.println(spring);
                break;
            case 5:
                System.out.println(spring);
                break;
            case 6:
                System.out.println(summer);
                break;
            case 7:
                System.out.println(summer);
                break;
            case 8:
                System.out.println(summer);
                break;
            case 9:
                System.out.println(autumn);
                break;
            case 10:
                System.out.println(autumn);
                break;
            case 11:
                System.out.println(autumn);
                break;
            case 12:
                System.out.println(winter);
                break;
            default: System.out.println(mistakeMsg);
        }
    }
}
