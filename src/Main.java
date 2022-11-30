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


    }
}