/* Программа позволяет преобразовывать галоны в литры
на вход поступают литры, на выходе галоны
 */


public class GalToLit {
    public static void main(String[] args) {
        double galones;  // переменная для хранения галонов
        double liters; // переменная для хранения литров
        galones = 10;
        liters = 10 * 3.7854;
        System.out.println(galones + " галонов воды, содержит " + liters + " литров воды");
    }
}
