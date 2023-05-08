import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Human person1 = new Human();
        person1.name = "Vita";
        person1.age = 25;
        person1.weight = 100.5;

        Human person2 = new Human();
        person2.name = "Kolya";
        person2.age = 24;
        person2.weight = 65;

        Human person3 = new Human();
        person3.name = "Misha";
        person3.age = 23;
        person3.weight = 60.5;

        Human person4 = new Human();
        person4.name = "Vlad";
        person4.age = 27;
        person4.weight = 68.5;

        Human person5 = new Human();
        person5.name = "Andrey";
        person5.age = 24;
        person5.weight = 80.5;

        int averageAge = (person1.age + person2.age + person3.age + person4.age + person5.age) / 5;

        Human[] person = new Human[5];
        person[0] = person1;
        person[1] = person2;
        person[2] = person3;
        person[3] = person4;
        person[4] = person5;

        int avgAge = 0;
        for (int i = 0; i < person.length; i++) {
            avgAge += person[i].age;
        }

        Dogs dog1 = new Dogs();
        dog1.name = "Sharik";
        dog1.breed = "Dvornayaga";
        dog1.speed = 3;

//        String dogInfo = dog1.info();
//        System.out.println(dogInfo);
//
//        dog1.run();

//        Box boxBox = new Box();
//        boxBox.setDimens(15, 15, 15);
//        System.out.println(boxBox.volume());

        Rect rect = new Rect();
//
//        rect.getParams(10, 10);
//        rect.getPerimeter();
//        rect.getSquare();
//
////        System.out.println("Периметр = " + rect.getPerimeter() + "\nПлощадь = " + rect.getSquare());
//        Box box9 = new Box(30, 30, 30);
//        System.out.println(box9.volume());
//        Box box10 = new Box(10, 15, 20);
//        System.out.println(box10.volume());
//        Employee employer = new Employee("Иван", "Разработчик", 80000);
//
//        String info = employer.getInfo(12);
//
//        System.out.println(info);


//        double res = Test.multi(5.666, 5.56);
//
//        System.out.println(res);

        Box boxx = new Box(10);
        Box boxx2 = new Box(15, 20, 25);
        Box boxx3 = new Box();
//
        int res = boxx.compare(boxx2);

        switch(res) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case 0:
                System.out.println("Они равны");
                break;
        }


//        boxx.showVolume();
//        boxx2.showVolume();
//        boxx3.showVolume();

//        Monster monster = new Monster();
//        Monster monster1 = new Monster(10);
//        Monster monster2 = new Monster(5,5);
//        Monster monster3 = new Monster(10,10,10);
//
//
//        monster.voice();
//        monster1.voice(3);
//        monster2.voice(5, "Privet");
//        monster3.voice(2);

    }
}