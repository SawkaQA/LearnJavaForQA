public class Employee {
    String name;
    String post;
    int salary;

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String getInfo(int month){
        return "Имя: " + name + "\nДолжность: " + post + "\nЗа последние " + month + " месяцев получил " + month * salary + " рублей";
    }
}


