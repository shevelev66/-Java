import java.util.Scanner;
public class example32_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа создает последовательность из 10 символов (без гласных):"); //запрос
try {
	    char glasnarr[] = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'}; //массив гласных
		int n = 10; //количество через переменную
		char arr[] = new char [n]; // динамический массив
		char b='A';
		//динамическое наполнение массива
		for (int i=0; i<n; ++i) { 
			boolean flag=true;
			for (int j=0; j<glasnarr.length; ++j) {if (b==glasnarr[j]) {--i; flag=false; break;} }
			if (flag==true) { arr[i]=b;}
			++b;
		}	
		System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована в прямом порядке:");
	    for (int i=0; i<n; ++i) {
	    	   System.out.print(arr[i]+" ");  //вывод массива данных на консоль
	    }
}
catch (Exception error) {
    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	System.out.println("Возможно вы некорректно ввели данные!"); }
    in.close();
	}
}
