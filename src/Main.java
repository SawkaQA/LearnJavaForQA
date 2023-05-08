public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.height = 10.2;
        box.length = 15;
        box.weigth = 11.3;

        Box box2 = new Box();
        box2.height = 5;
        box2.length = 5;
        box2.weigth = 5;

        Box box3 = new Box();
        box3.height = 10;
        box3.length = 10;
        box3.weigth = 10;

//        double vol1 = box.volume();
//        double vol2 = box2.volume();
//
//        System.out.println("Объем 1 = " + vol1 + " \nОбъем 2 = " + vol2);

//        System.out.println("Объем 1 коробки = " + volume + "\nОбъем 2 коробки = " + volume2 + "\nОбъем 3 коробки = " + volume3);

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
//        System.out.println(avgAge / (double) person.length);

//        System.out.println(averageAge);


        Dogs dog1 = new Dogs();
        dog1.name = "Sharik";
        dog1.breed = "Dvornayaga";
        dog1.speed = 3;

        String dogInfo = dog1.info();
        System.out.println(dogInfo);

        dog1.run();

    }
}