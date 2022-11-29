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
    }
}
