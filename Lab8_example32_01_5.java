import java.util.Scanner;
public class example32_01_5 {//ПРИМЕР 5 РАЗДЕЛ 1 последовательность Фибоначчи
	//ДОПОЛНЕНА РЕКУРСИВНЫМ ДЕРЕВОМ
	private static int step=0; //поле шага - глубина рекурсии
	public static int f(int n) { //метод вычисления числа Фибоначчи по заданному номеру в последовательности.
		int result=0;
		space();
		System.out.println(""+n+"->"); step++; 
		if (n==0){step--; return 0;}
		else if (n==1){step--; return 1; }
		else {result=f(n-1)+f(n-2); }
		step--;
		space(); 
		System.out.println(""+n+ "<-");
		return result;
		}
public static void space() { 
		for (int i = 0; i < step; i++) {System.out.print("-");}
		}
	public static void main(String[] args) {
try {		
		Scanner in=new Scanner(System.in);
		System.out.println("Программа выводит число Фибоначчи по заданному номеру в последовательности.");
		System.out.println("Последовательность Фибоначчи формируется так:"+
		   "нулевой член последовательности равен нулю,\n"+
		   "первый – единице, а каждый следующий – сумме двух предыдущих.");
		System.out.println("Введите номер числа в последовательности:");
		int n=in.nextInt();
		System.out.println("Дополнительно выводится последовательность обхода дерева рекурсивных вызовов:");
		System.out.printf("Число Фибоначчи под номером "+n+"="+f(n));
}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка! Возможно Вы некорректно ввели данные!"); } //обработка исключения
	}
}
