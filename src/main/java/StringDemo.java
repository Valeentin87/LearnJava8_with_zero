public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String[] cats = {"Васька", "Мурзик", "Барсик"};
        String str1 = new String();
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(chars);
        String str3 = new String(chars,0,3);
        //8
        String a = "Hello";
        String b = "Tom";
        String c = a + " " + b; // Hello Tom
        int value = 5;
        String d = value + " " + b;
        //9
        String s = "Hello";
        s.toUpperCase();
        s = s.toUpperCase();
        //System.out.println(s);
        //System.out.println(s.toUpperCase());//просто вывести в консоль результат метода можно
        //10
        StringBuilder sb = new StringBuilder("Hello");
        //System.out.println(sb.toString());
        //sb.append(" my");
        //sb.append(" friend");
        sb.append(" my").append(" my friend");
        System.out.println(sb.toString());
        String str4 = new String("Java");
        //11
        char symbol = str4.charAt(0); //возвращает символ по указанному номеру из строки
        //12
        int unicode_number = str4.codePointAt(1);//возвращает порядковый номер в таблице Unicode
        //13
        String s1 = new String("JavA");
        String s2 = "JAVA";
        int result = s1.compareTo(s2); //сравнивает две строки и возвращает 0 если они одинаковые, либо возвращает
                                       // разницу в символах в виде целого числа
        //14
        int result1 = s1.compareToIgnoreCase(s2);// сравнивает две строки независимо от регистров букв
        //System.out.println(result1);
        //15
        String result2 = s1.concat(s2); // конкатенация строк, эквивалент s1 + s2
        //System.out.println(result2);
        //16
        boolean result3 = s1.equals(s2); //выдает результат сравнения строки с другим объектом (булевое)
        //System.out.println(result3);
        //17
        boolean result4 = s1.equalsIgnoreCase(s2); // сравгивает строку с другим объектом без учёта регистра
        //18
        //System.out.println(s1.hashCode()); //возвращает хэшкод строки
        //19
        //System.out.println(s1.indexOf(65)); //принимает значение в кодировке unicode символа и если он есть в строке то
                                            // то выдает номер индекса, по которому он находится
        //20
        System.out.println(s1.isEmpty()); // если длина строки равна нулю то выдает true, если нет то false
        //21
        int result5 = s1.length(); // возвращает длину строки - количество символов в строке, учитывая пробелы
        //22
        //String[] strings = s1.split("v");//разбивает строку на массив строк по определенному разделителю
        //23
        String value3 = "Hello World";
        //System.out.println(value3.substring(2,7));//возвращает строку со 2 по 7 не включительно символ
        //24
        char[] chars1 = value3.toCharArray(); //преобразует строку в массив символов
        //for (char element:chars1) {
        //    System.out.println(element);
        //25
        s1 = s1.toUpperCase();//приводит к верхнему регистру
        s2 = s1.toLowerCase();//приводит к нижнему регистру
        String result6 = value3.trim(); // обрезает пробелы в начале и в конце строки
        //26
        String result7 = String.valueOf(65); // приведение к строке целочисленного значения
        //27
        String result8 = String.copyValueOf(chars1);//преобразует в строку массив символов
        System.out.println(result8);

        }

    }

