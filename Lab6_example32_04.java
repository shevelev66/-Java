import java.util.Scanner;
public class example32_04 {
//статический метод для вычисления двойного факториала числа через цикл
    static int Factorial(int n) { 
    	int result = 1; //инициализация
    	System.out.print("Расчет методом через цикл: "+n+"!!="); 
    	for (int i=n; i>=1; i=i-2) {
    		System.out.print(i); //отображение перемножаемых чисел (проверка)
    		if (i>2) System.out.print("x");
    		result=result*i;
    		}
    	System.out.println();
	return result;
}
  //статический метод для вычисления двойного факториала числа через РЕКУРСИЮ
    static int FactorialR(int n) { 
    	int result=1; //инициализация
    	if (n<1) {System.out.print("-расчет методом через рекурсию"); System.out.println(); return 1;}
    	System.out.print(n); //отображение перемножаемых чисел (проверка)
    	if (n>2) System.out.print("x"); 
    	result=n*FactorialR(n-2); //рекурсия
    return result;
}   
	public static void main(String[] args) {
try {	
	    System.out.println("Программа, в которой вычисляется двойной факториал числа n!!.\n"
			+"Вычисление осуществляется в методе через переданный аргумент.\n"
			+"Реализованна версия метода без рекурсии (через цикл) и метода с рекурсией.");
		Scanner in = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("Введите число для расчета двойного факториала:");
		int num=in.nextInt();
		System.out.println("Двойной факториал числа "+num+"!!="+Factorial(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("Двойной факториал числа "+num+"!!="+FactorialR(num));
	}	
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}		
	}

}
