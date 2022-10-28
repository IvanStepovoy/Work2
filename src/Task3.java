import java.util.Scanner;

public class Task3 {
    public static void main(String[] args)  {

        Scanner Text = new Scanner(System.in);
        System.out.print("Введите текст не менее 4-х символов, с которым мы будем работать: ");

        String inpt = Text.nextLine();
        System.out.println("Поехали !!!");
        System.out.println("Вы ввели следующее: " + inpt);

        int a = inpt.length();
        System.out.println("Длинна строки введённого текста ровна: " + a);

        boolean b = inpt.isEmpty();
        System.out.println("Строка пустая: " + b);
        /* if (b = true) {
            System.out.println("Молодец, строка не пустая, потому что вы что-то ввели!");
            } else {
            System.out.println("Вы ничего не ввели, внимательно читайте условия!");
        } */

        char d = inpt.charAt(3);
        System.out.println("Символ строки по индексу 3 = " + d );

        String anotheInpt = "This";

        //boolean e = inpt.equals(anotheInpt);
        System.out.println("Строки одинаковы: " + inpt.equals(anotheInpt) );
        /* if (e = true) {
            System.out.println("Строки одинаковы.");
        } else {
            System.out.println("Строки НЕ одинаковы.");
        } */

        //boolean f = inpt.equalsIgnoreCase(anotheInpt);
        System.out.println("Строки одинаковы вне зависимости от регистра: " + inpt.equalsIgnoreCase(anotheInpt) );
        /* if (f = true) {
            System.out.println("Строки одинаковы, независимо от регистра.");
        } else {
            System.out.println("Строки НЕ одинаковы, независимо от регистра.");
        } */


        //Введите слово: This
        //boolean g3 = inpt.startsWith("is" , 2);
        System.out.println("Строка начинается с указанного символа: " + inpt.startsWith("is" , 2) );

        //Введите слово: This
        //boolean g4 = inpt.endsWith("is");
        System.out.println("Строка заканчивается указанным набором слов: " + inpt.endsWith("is") );

        //Введите слово: This
        //boolean g5 = inpt.contains("hi");
        System.out.println("Строка содержит в себе указанный набор символов: " + inpt.contains("hi") );

        //Введите слово: This
        System.out.println("Вот что у нас получилось: " + inpt.concat(" - ЭТО КОНЕЦ!") );

        //Введите слово: This
        System.out.println("Замена T на X, получилось: " + inpt.replace('T', 'X') );
        System.out.println("Замена Th на Xz, получилось: " + inpt.replace("Th", "Xz") );

        //Введите слово: THIS
        System.out.println("Возвращаем исходную строку в нижнем регистре: " + inpt.toLowerCase());

        String car = "BMW";
        int speed = 260;
        int acceleration = 6;
        int weight = 1870;

        System.out.println(String.format("Марка %s, Скорость %d, Ускорение %d, Масса %d" , car, speed, acceleration, weight));


        StringBuffer first = new StringBuffer();
        first.append("My name is");
        System.out.println(first);
        first.append(" - Ivan");
        System.out.println(first);





    }
}
