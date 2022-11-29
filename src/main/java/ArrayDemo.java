//программа демонстрирует создание, заполнение и вывод в консоль одномерного массива целых чисел
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i;
        for(i=0;i<10;i++) {
            array[i] = i;
            System.out.print(array[i]+",");
        }
    }
}
