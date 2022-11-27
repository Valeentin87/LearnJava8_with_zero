public class SwitchCase {
    public static void main(String[] args)
        throws java.io.IOException {
        System.out.println("Выберите о чём бы хотели узнать");
        System.out.println("1.Условный оператор");
        System.out.println("2.Конструкция switch-case");
        System.out.println("Наберите номер нужного пункта");
        char ch = (char) System.in.read();
        switch (ch) {
            case '1': {
                System.out.println("if <условие> {");
                System.out.println("\tпоследовательность действий");
                System.out.println("}");
                System.out.println("else {");
                System.out.println("\tпоследовательность действий");
                System.out.println("}");
                break;
            }
            case '2': {
                System.out.println("switch(выражение) {");
                System.out.println("\tcase (значение 1): последовательность действий");
                System.out.println("\tcase (значение 2): последовательность действий");
                System.out.println("\tdefault: последовательность действий");
                System.out.println("}");
                break;
            }
            default:
                System.out.println("Вы ввели не корректную цифру");


        }
    }
}
