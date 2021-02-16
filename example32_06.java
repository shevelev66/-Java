import java.util.Scanner;
public class example32_06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Программа проверяет числа на кратность 3"); //описание
		System.out.println("Введите целое число для проверки:"); //запрос
		try {
		int number = in.nextInt(); //ввод числа
		if ((number % 3)==0) { //проверка кратности
			System.out.println("Ура!Введенное число делится на 3");
			System.out.printf(" %d /3= %.0f \n", number, number/3.0);
			}
		else {System.out.println("Увы!Введеное число НЕ делится на 3");
		      System.out.printf(" %d /3= %.2f \n", number, number/3.0);}
		//


		}
		//
		catch (Exception error) {System.out.println("При работе программы произошла ошибка!"); //обработка исключения
		System.out.println("Возможно вы некорректно ввели данные!");}
		in.close();
	}

}
