import java.util.Scanner;
public class example32_05 {
	//статический метод для вычисления суммы квадратов натуральных чисел
    static int SumSQR(int n) { 
    	int result = 0; //инициализация
    	System.out.print("Расчет методом через цикл: "); 
    	for (int i=1; i<=n; ++i) {
    		System.out.print(i+"^2"); //отображение перемножаемых чисел (проверка)
    		if (i!=n) System.out.print("+");
    		result=result+i*i;
    		}
    	System.out.println();
	return result;
    }	
  //статический метод для вычисления суммы квадратов натуральных чисел через РЕКУРСИЮ
    static int SumSQR_R(int n) { 
    	int result=0; //инициализация
    	if (n<1) {System.out.print("-Расчет методом через рекурсию"); System.out.println(); return 0;}
    	System.out.print(n+"^2"); //отображение перемножаемых чисел (проверка)
    	if (n>1) System.out.print("+"); 
    	result=n*n+SumSQR_R(n-1); //рекурсия
    return result;
}   
	public static void main(String[] args) {
try {	
	    System.out.println("Программа, в которой вычисляется сумма квадратов натуральных чисел 1^2+2^2+3^2+...+n^2.\n"
			+"Вычисление осуществляется в методе через переданный аргумент.\n"
			+"Реализованна версия метода без рекурсии (через цикл) и метода с рекурсией.\n"
			+"Для проверки результата использована формула 1^2+2^2+3^2+…+n^2=n(n+l)(2n+1)/6");
	    Scanner in = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("Введите число для расчета суммы квадратов натуральных чисел по n:");
		int num=in.nextInt();
		System.out.println("-----------------------------------------------------");
		System.out.println("Сумма квадратов натуральных чисел по "+num+"="+SumSQR(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("Сумма квадратов натуральных чисел по "+num+"="+SumSQR_R(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("Проверка результата по формуле n*(n+1)*(2*n+1)/6="+num*(num+1)*(2*num+1)/6);
	}	
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}		
	}

}