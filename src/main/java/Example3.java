/* показывает разницу между типами int и double
путём объявления и арифметическими операциями
 */

public class Example3 {
    public static void main(String[] args) {
        int x = 10;
        double y = 10.0;
        System.out.println("Значение переменной типа int x равно "+ x);
        System.out.println("Значение переменной типа double y равно "+ y);
        // разделим каждую переменную на 4
        x = x/4;
        y = y/4;
        System.out.println("x/4 равно "+x);
        System.out.println("y/4 равно"+y);
        //x/4 равно 2
        //y/4 равно2.5
    }

}
