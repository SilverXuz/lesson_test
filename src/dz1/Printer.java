package dz1;
/*
* Вычислить n-ое треугольного число(сумма чисел от 1 до n).
* Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
* Если число n < 1 (ненатуральное) метод должен вернуть -1.
*/


class Answer {
    public int countNTriangle(int n){
        // Введите свое решение ниже
        int summ = 0;
        for (int i = 1; i <= n; i++)
            summ = summ + i;
        return summ;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}