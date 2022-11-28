public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("    dog=" + dog + " cat=" + cat + " paper=" + paper);

    }
    public static void task2 ()
    {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("    dog=" + dog + " cat=" + cat + " paper=" + paper);
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("    dog=" + dog + " cat=" + cat + " paper=" + paper);
    }

    public static void task3 ()
    {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("    dog=" + dog + " cat=" + cat + " paper=" + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("    dog=" + dog + " cat=" + cat + " paper=" + paper);
    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("    friend=" + friend);
        friend = friend + 2;
        System.out.println("    friend=" + friend);
        friend = friend/7;
        System.out.println("    friend=" + friend);
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        var frog =3.5;
        System.out.println("    frog=" + frog);
        frog=frog*10;
        System.out.println("    frog=" + frog);
        frog=frog/3.5;
        System.out.println("    frog=" + frog);
        frog=frog+4;
        System.out.println("    frog=" + frog);
    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        var vesPer = 78.2;
        var vesVto = 82.7;
        var vesObo = vesPer+vesVto;
        var vesRaz = vesVto-vesPer;
        System.out.println("    Общий вес=" + vesObo + "  Разница в весе=" + vesRaz);
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        var boetz1 = 78.2;
        var boetz2 = 82.7;
        var vichit = boetz2-boetz1;
        var delenie = boetz2%boetz1;
        System.out.println("    вычитание: " + vichit + "; деление: " + delenie);
    }
    public static void task8 ()
    {
        System.out.println("Задача 8");
        var chasovVsego=640;
        var rabDen=8;
        var sotrudniki = chasovVsego/rabDen;
        System.out.println("    Всего работников в компании - " + sotrudniki + " человек");
        sotrudniki=sotrudniki+94;
        chasovVsego = sotrudniki*rabDen;
        System.out.println("    Если в компании работает " + sotrudniki + " человек, то всего " + chasovVsego + " часов работы может быть поделено между сотрудниками");
    }
}