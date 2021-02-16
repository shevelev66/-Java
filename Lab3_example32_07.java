import java.util.Scanner;
public class example32_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа создает последовательность из 10 символов:"); //запрос
try {
		int n = 10; //количество через переменную
		char arr[] = new char [n]; // динамический массив
		char b='a';
		//динамическое наполнение массива
		for (int i=0; i<n; ++i) { 
			arr[i]=b;
			b+=2;
		}	
		System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована в прямом порядке:");
	    for (int i=0; i<n; ++i) {
	    	   System.out.print(arr[i]+" ");  //вывод массива данных на консоль
	    }
	    System.out.println();
	    System.out.println("Последовательность сформирована в обратном порядке:");
	    for (int i=arr.length-1; i>=0; --i) {
	    	   System.out.print(arr[i]+" ");  //вывод массива данных на консоль
	    }
}
catch (Exception error) {
    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	System.out.println("Возможно вы некорректно ввели данные!"); }
    in.close();
	}
}
