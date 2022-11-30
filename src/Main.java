public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var WeightFirstBoxer = 78.2;
        var WeightSecondBoxer = 82.7;
        var TotalWeightOfBoxers = WeightFirstBoxer + WeightSecondBoxer;
        System.out.println("Общий вес боксеров " + TotalWeightOfBoxers + " кг ");
        var Difference = (WeightFirstBoxer - WeightSecondBoxer) % TotalWeightOfBoxers;
        System.out.println("Разница в весе боксеров " + Difference + " кг!");

        System.out.println("Задача 7");
        var TotalWeightBoxers = WeightSecondBoxer - WeightFirstBoxer;
        System.out.println("Разница в весе боксеров " + TotalWeightBoxers + " кг ");
        var DifferenceWeightBoxers = (WeightSecondBoxer % WeightFirstBoxer);
        System.out.println("Разница в весе боксеров " + DifferenceWeightBoxers + " кг ");

        System.out.println("Задача 8");
        var TotalTime = 640;
        var TimeOneEmployee = 8;
        var HowManyTotalEmployees = TotalTime / TimeOneEmployee;
        System.out.println("Всего работников в компании " + HowManyTotalEmployees + " Человек");
        var AdditionalEmployees = 94;
        var HowManyHoursTotal = HowManyTotalEmployees + AdditionalEmployees;
        System.out.println("Всего работников в компании на данный момент " + HowManyHoursTotal + " Человек");
        var DifferencesNewAndOldEmployees = (AdditionalEmployees - HowManyTotalEmployees);
        System.out.println("Разница Новых и старых сотрудников " + DifferencesNewAndOldEmployees + " человек");
        var TotalHours = (TotalTime * 2) + (DifferencesNewAndOldEmployees * TimeOneEmployee);
        System.out.println("Если в компании работает " + HowManyHoursTotal + " человек, то всего " + TotalHours + " часа работы может быть поделено между сотрудниками");



    }
}