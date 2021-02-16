import java.util.Scanner;
public class example32_02 {
	public static int DectoBin(int n){ //метод перевода из Dec в Bin через рекурсию
		if (n==0) {return 0;}
		return (n%2+10*DectoBin(n/2)); //возвращает последовательность 1 и 0
		}
public static void main(String[] args) {
try {		
			Scanner in=new Scanner(System.in);
			System.out.println("Программа производит перевода целого числа, введенного с клавиатуры, в двоичную систему счисления с использованием рекурсии");
			System.out.println("Введите число для перевода в 2-ю СС:");	 
			int n=in.nextInt();
			System.out.printf("В двойчной системе число "+n+"= "+DectoBin(n));
		}	
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); } //обработка исключения
		}
}