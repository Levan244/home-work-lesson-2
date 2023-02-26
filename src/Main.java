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


    }
    public static void task1() {
        System.out.println("Задача 1");
        int player = 1320;
        System.out.println("Значение переменной player с типом int равно "  + player );
        byte bolls = 120;
        System.out.println("Значение переменной bolls с типом byte равно " + bolls);
        short games =2366 ;
        System.out.println("Значение переменной games с типом short  равно " + games );
        long outs = 171_787_822L ;
        System.out.println("Значение переменной out с типом long равно " + outs);
        float goat = 36.6F ;
        System.out.println("Значение переменной goat с типом float  равно " + goat );
        double run = 6.6;
        System.out.println("Значение переменной rut с типом double  равно " + run);


    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        System.out.println("Значение переменной a с типом float  равно " + a );
        long b = 987678965549L;
        System.out.println("Значение переменной b с типом long равно " + b);
        double d = 2.786;
        System.out.println("Значение переменной d с типом double  равно " + d);
        short i = 569;
        System.out.println("Значение переменной i с типом short  равно " + i);
        int e = -159;
        System.out.println("Значение переменной e с типом int  равно " + e);
        int f = 27897;
        System.out.println("Значение переменной f с типом int  равно " + f);
        byte g = 67;
        System.out.println("Значение переменной g с типом bute  равно "+ g);

    }
    public static void task3() {
        System.out.println("Задача 3");
        byte teacher1 = 23;
        System.out.println("У Людмилы Павловны " + teacher1 + " ученика");
        byte teacher2 = 27;
        System.out.println("у Анны Сергеевны " + teacher2 + " учеников" );
        byte teacher3 = 30;
        System.out.println("у Екатерины Андреевны " + teacher3 + " учеников");
        int totalStudents = teacher1 + teacher2 + teacher3;
        System.out.println("Всего учеников " + totalStudents);
        int paper = 480;
        System.out.println("Количесво листов " + paper);
        int toEveryStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + toEveryStudent + " листов бумаги");


    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottles1 = 16;
        System.out.println("За 2 минуты машина произвела " + bottles1 + " штук бутылок");
        int bottles2 = (bottles1/2) * 20;
        System.out.println("За 20 минут машина произвела " + bottles2 +" штук бутылок");
        int bottles3 = (bottles1/2) * (60 * 24);
        System.out.println("За сутки  машина произвела " + bottles3 +" штук бутылок");
        int bottles4 = bottles3 * 3;
        System.out.println("За 3 дня машина произвела " + bottles4 +" штук бутылок");
        int bottles5 = bottles3 * 30 ;
        System.out.println("За 1 месяц машина произвела " + bottles5 +" штук бутылок");



    }
    public static void task5(){
        System.out.println("Задача 5");
        byte cans =120;
        System.out.println("На ремонт школы нужно " + cans + " банок краски");
        byte witteColor = 2;
        System.out.println(witteColor + " шт. белой краски уходин на 1 клас ");
        byte brownColor = 4;
        System.out.println(brownColor +" шт. коричневой краски уходин на 1 клас");
        int classesAtSchool = cans / (witteColor +brownColor);
        int witteCollor1 = classesAtSchool * witteColor;
        int brownColor1 = classesAtSchool * brownColor;
        System.out.println("В школе, где " + classesAtSchool+" классов, нужно " + witteCollor1 + " банок белой краски и " + brownColor1 + " банок коричневой краски");


    }
    public static void task6(){
        System.out.println("Задача 6");
        byte bananas = 5;
        System.out.println("Кол. бананов " + bananas);
        byte gramInBananas = 80;
        System.out.println("В одном банане " + gramInBananas +" гр.");
        short milk = 200;
        System.out.println("Молока " + milk + " мл.");
        byte gramInMilk = 105;
        System.out.println("В 100 мл. молока " + gramInMilk + " гр.");
        byte iceCream = 2;
        System.out.println(iceCream + " брикета мороженого");
        byte gramInIce = 100;
        System.out.println("Мороженное-пломбир 2 брикета по " + iceCream + "гр.");
        byte eggs = 4;
        System.out.println(eggs + "шт. яиц");
        byte gramAgg = 70;
        System.out.println(gramAgg + " гр. в одном яйце");
        int weight = (bananas * gramInBananas) + (gramAgg * 2) + (iceCream * gramInIce) + (eggs * gramAgg);
        System.out.println("Вес спорт завтрака равна " + weight + " гр." );
        double gramInKilogram = 0.001;
        System.out.println("В одном кг. " + gramInKilogram + " гр.");
        double totakWeight = weight * gramInKilogram;
        System.out.println("Вес спорт завтрака равна " + totakWeight + " кг.");

    }
    public static void task7(){
        System.out.println("Задача 7");
        byte weight = 7;
        System.out.println("Вес который нужно сбросить "+ weight);
        short gramInKilogram = 1000;
        System.out.println("В одном кг " + gramInKilogram + " гр." );
        short weightLoss1 = 250;
        System.out.println(weightLoss1 +"гр. потеря веса в день");
        short weightLoss2 = 500;
        System.out.println(weightLoss2 +"гр. потеря веса в день");
        int daysWeightLoss1 = (weight * gramInKilogram) / weightLoss1;
        System.out.println("Если потеря веса в день " + weightLoss1 + " гр. то в среднем потребуеться " + daysWeightLoss1 + " дней");
        int daysWeightLoss2 = (weight * gramInKilogram ) / weightLoss2;
        System.out.println("Если потеря веса в день " + weightLoss2 + " гр. то в среднем потребуеться " + daysWeightLoss2 + " дней" );


    }
    public static void task8(){
        System.out.println("Задача 8");
        int employee1= 67760;
        System.out.println("Маша получает " + employee1 + " рублей в месяц");
        int employee2= 83690;
        System.out.println("Денис получает " + employee2 + " рублей в месяц" );
        int employee3 = 76230;
        System.out.println("Кристина получает " + employee3 + " рублей в месяц");
        int increase = 10;
        System.out.println("Всем увеличили зарплату на " + increase + "%");
        byte month = 12;
        int increaseEmployee1 = (employee1 * increase)/100;
        System.out.println( "Месяный доход Маши вырос на " + increaseEmployee1);
        int money1 = employee1 + increaseEmployee1;
        System.out.println("Месяный доход Маши после повышения "+ money1 + " рублей");
        int increaseEmployee2 = (employee2 * increase)/100;
        System.out.println( "Месяный доход Дениса вырос на " + increaseEmployee2);
        int money2 = employee2 + increaseEmployee2;
        System.out.println("Месяный доход Дениса после повышения "+ money2 + " рублей");
        int increaseEmployee3 = (employee3 * increase)/100;
        System.out.println( "Месяный доход Кристины вырос на " + increaseEmployee3);
        int money3 = employee3 +increaseEmployee3;
        System.out.println("Месяный доход Кристины после повышения "+ money3 + " рублей");
        int annualIncome1 = (employee1 + increaseEmployee1) * month;
        System.out.println("Годовой зароботок Маши после повышения " +annualIncome1 + " рублей в год" );
        int after1 = employee1 * month;
        System.out.println("Годовой заработок Маши до повышения " + after1 + " рублей в год");
        int difference1 = annualIncome1 - after1;
        System.out.println("Разница годового дохода Маши " + difference1 + "рублей");
        int annualIncome2 = (employee2 + increaseEmployee2) *month;
        System.out.println("Годовой зароботок Дениса после повышения " +annualIncome2 + " рублей в год" );
        int after2 = employee2 * month;
        System.out.println("Годовой заработок Дениса до повышения " + after2 + " рублей в год");
        int difference2 = annualIncome2 -after2;
        System.out.println("Разница годового дохода Дениса " + difference2 + " рублей");
        int annualIncome3 = (employee3 + increaseEmployee3) *month;
        System.out.println("Годовой зароботок Кристины после повышения " +annualIncome3 + " рублей в год" );
        int after3 = employee3 * month;
        System.out.println("Годовой заработок Дениса до повышения " + after3 + " рублей в год");
        int difference3 = annualIncome3 - after3;
        System.out.println("Разница годового дохода Дениса " + difference3 + " рублей");
        System.out.println("Маша теперь получает " + money1 + "рублей. Годовой доход вырос на " + difference1 + " рублей" );
        System.out.println("Денис теперь получает " + money2 + "рублей. Годовой доход вырос на " + difference2 + " рублей");
        System.out.println("Кристина теперь получает " + money3 + "рублей. Годовой доход вырос на " + difference3 + " рублей");

    }
}