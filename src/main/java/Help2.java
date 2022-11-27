public class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {
            char ch, ignore;
        do {
            System.out.println("Выберите о чём бы хотели узнать");
            System.out.println("1.Условный оператор");
            System.out.println("2.Конструкция switch-case");
            System.out.println("3.Конструкция цикла for");
            System.out.println("4.Конструкция цикла while");
            System.out.println("5.Конструкция цикла do while");
            System.out.println("Наберите номер нужного пункта");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (ch<'1'|ch> '5');
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



        }
    }
}

