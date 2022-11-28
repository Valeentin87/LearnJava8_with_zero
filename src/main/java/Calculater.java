class CalculaterDemo {
    int first_value;
    int second_value;
    //коеструктор, описывающий класс Calculater
    CalculaterDemo(int f, int s) {
        first_value = f;
        second_value = s;
    }
    // сложение двух чисел
    int summa() {
        return first_value+second_value;
    }
    // разность двух чисел
    int difference() {
        return first_value-second_value;
    }
    // произведение двух чисел
    int multiplication() {
        return first_value*second_value;
    }
    // деление двух чисел
    int division() {
        return first_value/second_value;
    }
}
class Calculater {
    public static void main(String[] args) {
        CalculaterDemo one = new CalculaterDemo(5,6);
        CalculaterDemo two = new CalculaterDemo(6,7);
        System.out.println("Cумма двух первых чисел равна " + one.summa());
        System.out.println("Произведение двух вторых чисел равна " + two.multiplication());
    }
}
