package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//
    var box = 5;
    System.out.println(box);

    byte lesson = 8;

    short course = 9;

    int profession = 10;

    long year = 11L;

    float day = 1.1221f;

    double car = 1.1231231;

    char cat = 60000;

    boolean b = 10 > 9;

    boolean c = 66 < 3;

    var boxer1 = 78.2;

    var boxer2 = 82.7;

    short totalWeight = (short) ( boxer1 + boxer2) ;

    System.out.println("Общий вес боксеров " +totalWeight + "кг");

    double differenceWeight = boxer2 - boxer1;

    System.out.println("Разница в весе " + differenceWeight + " кг");

    byte bananas = 5;

    byte oneBananas = 80;

    short totalBananas = (short) (bananas * oneBananas);

    System.out.println("Общий вес бананов " + totalBananas + " грамм");

    short milk = 200;

    byte milk100ml = 105;

    short totalMilk = (short) (milk100ml * 2);

    System.out.println("Всего молока " + totalMilk + " грамм");

    byte iceCrem = 2;

    byte oneIceCrem = 100;

    short totalIceCrem = (short) (iceCrem * oneIceCrem);

    System.out.println("Общий вес пломбира " + totalIceCrem + " грамм");

    byte aggs = 4;

    byte oneAgg = 70;

    short totalAggs = (short) (aggs * oneAgg);

    System.out.println("Общий вес яиц " + totalAggs + " грамм");

    short cocktail = (short) (totalBananas + totalMilk + totalIceCrem + totalAggs);

    System.out.println("Общий вес спорт-завтрака " + cocktail + " грамм");

    float cocktailGm = 1090;

    float cocktailKg = cocktailGm / 1000;

    System.out.println("В одной порции завтрака " + cocktailKg + " кг!");

    int excessWeight = 7;

    System.out.println("Лишний вес " + excessWeight + " кг");

    excessWeight = excessWeight * 1000;

    System.out.println("Лишний вес " + excessWeight + "грамм");

    short firstMethod = 250;

    excessWeight = excessWeight / firstMethod;

    System.out.println("Если терять по 250 грамм каждый день, понадобится " + excessWeight + " Дней!");

    short secondMethod = 500;

        short excessWeight1 = 7;

        System.out.println("Лишний вес " + excessWeight1 + " кг");

        excessWeight1 = (short) (excessWeight1 * 1000);

        System.out.println("Лишний вес " + excessWeight1 + "грамм");

        excessWeight1 = (short) (excessWeight1 / secondMethod);

        System.out.println("Если терять по 500 грамм каждый день, понадобится " + excessWeight1 + " Дней!");

        short onAverageDays = (short) ((excessWeight + excessWeight1) / 2);

        System.out.println("В среднем для похудения понадобиться " + onAverageDays + " днь!");

        int masha1 = 67760;

        short masha2 = (short) ((masha1 * 10) / 100);

        System.out.println( "10% от нынешней зарплаты Маши " + masha2 + " RUB");

        int masha3 = masha1 + masha2;

        System.out.println("Маша теперь получает в Месяц " + masha3 + " RUB");

        int masha4 = masha1 * 12;

        System.out.println("Годовой доход Маши до повышения " + masha4 + " RUB");

        int masha5 = masha3 * 12;

        System.out.println(" Годовой доход Маши после повышения з/п на 10% " + masha5 + " RUB");

        int masha6 = masha5 - masha4;

        System.out.println(" Годовой доход Маши вырос на " + masha6 + " RUB");

        int denis1 = 83690;

        short denis2 = (short) ((denis1 * 10) / 100);

        System.out.println( "10% от нынешней зарплаты Дениса " + denis2 + " RUB");

        int denis3 = denis1 + denis2;

        System.out.println("Денис теперь получает в Месяц " + denis3 + " RUB");

        int denis4 = denis1 * 12;

        System.out.println("Годовой доход Дениса до повышения " + denis4 + " RUB");

        int denis5 = denis3 * 12;

        System.out.println(" Годовой доход Дениса после повышения з/п на 10% " + denis5 + " RUB");

        int denis6 = denis5 - denis4;

        System.out.println(" Годовой доход Дениса вырос на " + denis6 + " RUB");

        int kris1 = 76230;

        short kris2 = (short) ((kris1 * 10) / 100);

        System.out.println( "10% от нынешней зарплаты Кристины " + kris2 + " RUB");

        int kris3 = kris1 + kris2;

        System.out.println("Кристина теперь получает в Месяц " + kris3 + " RUB");

        int kris4 = kris1 * 12;

        System.out.println("Годовой доход Кристины до повышения " + kris4 + " RUB");

        int kris5 = kris3 * 12;

        System.out.println(" Годовой доход Кристины после повышения з/п на 10% " + kris5 + " RUB");

        int kris6 = kris5 - kris4;

        System.out.println(" Годовой доход Кристины вырос на " + kris6 + " RUB");










    }
}
