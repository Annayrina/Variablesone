public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("task 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("task 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = (frog * 10) / 3.5;
        System.out.println(frog);
        frog = ((frog * 10) / 3.5) + 4;
        System.out.println(frog);
        System.out.println("task 6");
        var weightOfOneBoxer = 78.2;
        System.out.println("Вес одного боксера " + weightOfOneBoxer + " кг");
        var weightBoxerSecond = 82.7;
        System.out.println("Вес второго боксера " + weightBoxerSecond + " кг ");
        var weightBoxers = weightOfOneBoxer + weightBoxerSecond;
        System.out.println("Общий вес двух бойцов " + weightBoxers + " кг");
        weightBoxers = weightBoxerSecond - weightOfOneBoxer;
        System.out.println("Разница между весами бойцов " + weightBoxers + " кг");
        System.out.println("task 7");
        var weightBoxer = weightBoxerSecond - weightOfOneBoxer;
        System.out.println("Разница между весами бойцов " + weightBoxers + " кг");
        weightBoxers = weightBoxerSecond % weightOfOneBoxer;
        System.out.println("Разница между весами бойцов " + weightBoxers + " кг");
        System.out.println("task 8");
        var watch = 640;
        var work = 8;
        var result = watch / work;
        System.out.println("Всего работников в компании - " + result);
        var worktwo = 174;
        var watchtwo = worktwo * work;
        System.out.println(watchtwo);
        System.out.println("Если в компании работает " + worktwo + " человек, то всего " + watchtwo + " часов работы может быть поделено между сотрудниками");


    }
}