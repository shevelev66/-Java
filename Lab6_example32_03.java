import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class MaxMinMidle {
	//метод возвращает наибольший элемент
	static int Max(int...arr) {
		Arrays.sort(arr); //сортируем полученный массив
		return arr[arr.length-1]; //возвращаем наибольший
	}
	//метод возвращает наименьший элемент
	static int Min(int...arr) {
		Arrays.sort(arr); //сортируем полученный массив
		return arr[0];//возвращаем наименьший
	}
	//метод возвращает среднее значание
	static double Midle(int...arr) {
		double sum = 0;
		for (int i=0; i<arr.length;++i) {sum+=arr[i];}
		return sum/arr.length;
	}
}
public class example32_03 {
	public static void main(String[] args) {
try {
	System.out.println("ѕрограмма с классом, в котором есть статические методы.\n"
			+"»м можно передавать произвольное количество целочисленных аргументов (или целочисленный массив).\n"
		    +"ћетоды позвол€ют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора аргументов.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random дл€ "случайного" заполнени€ исходного массива
		MaxMinMidle obj=new MaxMinMidle();
		System.out.println("-----------------------------------------------------");
		System.out.println("¬ведите количество аргументов:");
		int size=in.nextInt();
		int array[]=new int[size];
		System.out.println("јргументы созданы генератором случайных чисел в диапазоне от 0 до 200:");
		for (int i=0 ; i<array.length ; i++) {array[i] = rnd.nextInt(200); // ѕрисвоение i-тому элементу массива случайного значени€
        System.out.print(array[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Ќаибольшее значение:"+obj.Max(array));
		System.out.println("Ќаименьшее значение:"+obj.Min(array));
		System.out.printf("—реднее значение элементов массива= %.2f", obj.Midle(array));
	}
catch (Exception error) { System.out.println("ѕри обработке данных произошла ошибка!"); //обработка исключени€
}		
	}
}
