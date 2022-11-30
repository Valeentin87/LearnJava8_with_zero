/* демонстрация работы с классом StringBuilder
также опписание в файле StringBuilder.txt
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello"); //создание экземпляра класса и передача ему строки Hello
//      System.out.println("String= "+str1); //Вывод в консоль объекта класса StringBuilderSystem.out.println(("Lenght= "+str1.length())); // длина (количество символов объекта класса StringBuilder)
//      System.out.println(("Буфер= "+ str1.capacity())); // размер буфера (зарезервированное количество символов + длина)
        char ch = str1.charAt(1); //возвращает символ из строки, значащийся под указанным индексом
        str1.setCharAt(1,'o'); // заменяет символ объекта под значением 1 на 'o'
        //System.out.println(str1);
        str1.setLength(3); //устанавливает длину объекта класса StringBuilder (обрезает исходный объект)
        System.out.println(str1);
        StringBuilder str2 = new StringBuilder("I Java");
        str2.insert(2, "like "); // добавляет начиная со 2-го индекса в объект str1 строку like)
        System.out.println(str2);
        str2.reverse(); // переворачивает строку
        System.out.println(str2);
        str2.delete(4,9); // удалит из строки символы, начиная с 4 и заканчивая 9 не включая
        str2.deleteCharAt(1); // удалит из строки символ под индексом 1
        StringBuilder str3 = new StringBuilder("я пошёл в магазин");
        str3.replace(2,7, "поехал");
        System.out.println(str3);
    }
}
