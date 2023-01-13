public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int a = 10000;
        byte b = 120;
        short c = 500;
        long l = 100L;
        float f = 1.2f;
        double d = 12.5;
        System.out.println("Значение переменной а с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println("Задача №2");
        float h = 27.12f;
        long g = 987678965549L;
        double r = 2.786;
        short v = 569;
        short n = -159;
        int i = 27897;
        byte k = 67;
        System.out.println(h);
        System.out.println(g);
        System.out.println(r);
        System.out.println(v);
        System.out.println(n);
        System.out.println(i);
        System.out.println(k);

        System.out.println("Задача №3");
        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        int totalPapers = 480;
        int totalStudents = teacherOne + teacherTwo + teacherThree;
        int papersOnStudent = totalPapers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersOnStudent + " листов бумаги");

        System.out.println("Задача №4");
        byte bottleCounts = 16;
        byte timeTwoMinutes = 2;
        int countsBottlesOnOneMinutes = bottleCounts / timeTwoMinutes;
        int countsBottlesOnTwentyMinutes = countsBottlesOnOneMinutes * 20;
        int countsBottlesOnOneDay = countsBottlesOnOneMinutes * 1440;
        int countsBottlesOnThreeDay = countsBottlesOnOneDay * 3;
        int countsBottlesOnOneMonth = countsBottlesOnThreeDay * 10;
        System.out.println("За 20 минут машина произвела " + countsBottlesOnTwentyMinutes + " штук бутылок");
        System.out.println("За один день машина произвела " + countsBottlesOnOneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + countsBottlesOnThreeDay + " штук бутылок");
        System.out.println("За один мясяц машина произвела " + countsBottlesOnOneMonth + " штук бутылок");

        System.out.println("Задача №5");
        byte countsCans = 120;
        byte whitePaintOnClass = 2;
        byte brownPaintOnClass = 4;
        int countsCansOnClass = countsCans / (whitePaintOnClass + brownPaintOnClass);
        int countClass = countsCans / countsCansOnClass;
        int countsWhitePaint = countsCansOnClass * whitePaintOnClass;
        int countsBrownPaint = countsCansOnClass * brownPaintOnClass;
        System.out.println("В школе, где " + countClass + " классов, нужно " + countsWhitePaint +
                " банок белой краски и " + countsBrownPaint + " банок коричневой краски");

        System.out.println("Задача №6");

        byte banana = 5;
        short milk = 2;
        byte iceCream = 2;
        byte eggs = 4;

        byte bananaGram = 80;
        byte milkGram = 105;
        byte iceCreamGram = 100;
        byte eggsGram = 70;

        int weightBanana = banana * bananaGram;
        int weightMilk = milk * milkGram;
        int weightIceCream = iceCream * iceCreamGram;
        int weightEggs = eggs * eggsGram;

        int totalWeightGram = weightBanana + weightMilk + weightIceCream + weightEggs;
        int totalWeightKilogram = totalWeightGram / 1000;

        System.out.println("Вес завтра в граммах - " + totalWeightGram + " грамм, в килограммах - "
                + totalWeightKilogram + " килограмм.");

        System.out.println("Задача №7");

        byte targetLoseWeight = 7;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        int oneKilogramLose1 = 1000 / loseWeight1; // 250гр
        int oneKilogramLose2 = 1000 / loseWeight2; // 500гр

        int totalDay1 = oneKilogramLose1 * targetLoseWeight;
        int totalDay2 = oneKilogramLose2 * targetLoseWeight;

        System.out.println("Количество дней при потере веса в 250 гр. в день - " + totalDay1 +
                " , при потере веса в 500 гр - " + totalDay2);

        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double newMashaSalary = mashaSalary * 0.1 + mashaSalary;
        double newDenisSalary = denisSalary * 0.1 + denisSalary;
        double newKristinaSalary = kristinaSalary * 0.1 + kristinaSalary;

        double revenueMasha = newMashaSalary - mashaSalary;
        double revenueDenis = newDenisSalary - denisSalary;
        double revenueKristina = newKristinaSalary - kristinaSalary;


        System.out.println("Маша теперь получает - " + newMashaSalary + ". Годовой доход составил - " + revenueMasha);
        System.out.println("Денис теперь получает - " + newDenisSalary + ". Годовой доход составил - " + revenueDenis);
        System.out.println("Кристина теперь получает - " + newKristinaSalary +
                ". Годовой доход составил - " + revenueKristina);

    }
}