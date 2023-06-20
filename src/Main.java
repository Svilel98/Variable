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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3;
        cat = cat - 3;
        paper = paper - 3;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        var fighterWeight = fighterOne + fighterTwo;
        System.out.println("Общий вес двух бойцов " + fighterWeight + " кг");
        var differenceWeight = fighterTwo - fighterOne;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        var differenceWeight = fighterTwo - fighterOne;
        differenceWeight = fighterTwo % fighterOne;
        System.out.println(differenceWeight);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var timeWork = 640;
        var timeWorkEmployee = 8;
        var numberEmployee = timeWork / timeWorkEmployee;
        System.out.println("Всего работников в компании - " + numberEmployee + " человек");
        numberEmployee = numberEmployee + 94;
        timeWorkEmployee = timeWorkEmployee * numberEmployee;
        System.out.println("Если в компани работает " + numberEmployee + " человек, то всего " + timeWorkEmployee + " часов работы может быть поделено между сотрудниками");
    }
}