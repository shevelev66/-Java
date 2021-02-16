import java.util.Scanner;
public class example32_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа проверяет число десятков в 8-чном представлении числа"); //описание
		System.out.println("Введите число для проверки :"); //запрос
	try {
		int number = in.nextInt(); //ввод числа
		if (number<0) {number = Math.abs(number);} //откидываем знак
		String num8 = Integer.toOctalString(number); //преобразовние в 8-ю СС в виде строки
		int num_r = Integer.parseInt(num8); // преобразование строки в число, но число воспринимается как 10-е СС
		int r2 =((num_r % 100)/10); //выделение 2-го разряда
		System.out.println("Введенное число в 8-чной системе: "+num8); //вывод
		System.out.printf("Введенное число содержит %d десятков 8-й системе . \n", r2); //вывод
		}
		catch (Exception error) {System.out.println("При работе программы произошла ошибка!"); //обработка исключения
		System.out.println("Возможно вы некорректно ввели данные!");}
		in.close();
	}

}
