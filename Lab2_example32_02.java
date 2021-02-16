import java.util.Scanner;
public class example32_02 {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
System.out.println("Программа проверяет числа на ряд условий"); //описание
System.out.println("Число при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1");
System.out.println("Введите число для проверки:"); //запрос
try {
int number = in.nextInt(); //ввод числа
if ((number % 5)==2) { //проверка при делении на 5
	System.out.println("1-е условие выполнено.Введенное число при делении на 5 в остатке дает 2.");
		}
else {System.out.println("1-е условие Не выполнено.Введенное число при делении на 5 в остатке НЕ дает 2. Остаток="+(number % 5));
       }
if ((number % 7)==1) { //при делении на 7
	System.out.println("2-е условие выполнено.Введенное число при делении на 7 в остатке дает 1.");
	}
else {System.out.println("2-е условие Не выполнено.Введенное число при делении на 7 в остатке НЕ дает 1. Остаток="+(number % 7));
     }
}
catch (Exception error) {System.out.println("При работе программы произошла ошибка!"); //обработка исключения
System.out.println("Возможно вы некорректно ввели данные!");}
in.close();
	}

}
