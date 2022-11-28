 class NameAge {
    String name;
    int age;
    // set методы, позволяющие инициализировать переменные класса
    void set_name(String name) {
        this.name = name; // this.name указывает на переменную name, объявленную в классе
    }
    void set_age(int age) {
        this.age = age;
    }
    // get методы, позволяющие использовать данные, хранящиеся в переменных класса
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        NameAge human = new NameAge();
        human.set_age(26);
        human.set_name("Tom");
        System.out.println(human.getAge()+","+human.getName());
    }


}
