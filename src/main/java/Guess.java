import java.io.IOException;
public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, answer = 'S';
            System.out.println("Зaдyмaнa буква из диапазона A-Z");
            System.out.print("Пoпытaйтecь ее угадать: ");
            ch = (char)System.in.read(); // получить символ с клавиатуры
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.println("Буква не была угадана");
                if (ch<answer) System.out.println("Нужная буква находится ближе к концу алфавита ");
                else System.out.println("Нужная буква находится ближе к началу алфавита");
            }
        }
    }
