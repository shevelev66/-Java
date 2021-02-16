import java.util.Scanner;
public class example32_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа проверяет число тысяч в введенном числе"); //описание
		System.out.println("Введите число, в котором не менее 4-х разрядов, для проверки :"); //запрос
	try {
		double number = in.nextDouble(); //ввод числа
		if (number<0) {number = Math.abs(number);} //откидываем знак
		int r4 = (int) ((number % 10000)/1000); //выделение 4-го разряда
		System.out.printf("Введенное число содержит %d тысяч . \n", r4); //запрос
		}
		catch (Exception error) {System.out.println("При работе программы произошла ошибка!"); //обработка исключения
		System.out.println("Возможно вы некорректно ввели данные!");}
		in.close();
	}

}
