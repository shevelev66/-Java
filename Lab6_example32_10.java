import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class example32_10 {
	//статический метод для определения наибольшего и наименьшего
    static int MaxMin(int...arr) [] { 
    	Arrays.sort(arr); //сортируем полученные данные
    	int array []=new int[2]; //создаем новый массив и заполняем его
    	array[0]=arr[arr.length-1]; //наибольшее значение
    	array[1]=arr[0]; //наименьшее значение  	
    return array;
    }
	public static void main(String[] args) {
try {
	System.out.println("Программа со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.\n"
			+"Результатом метод возвращает массив из двух элементов:\n"
			+ "Это значения наибольшего и наименьшего значений среди аргументов, переданных методу.");
	Scanner in = new Scanner(System.in);
	Random rnd = new Random(); // Random для "случайного" заполнения массива
	System.out.println("-----------------------------------------------------");	
	System.out.println("Введите число аргументов:");
	int size=in.nextInt(); //число аргументов
	int[] arr = new int[size]; // Создание исходного массива аргументов
	System.out.println("Аргументы для метода созданы генератором случайных чисел в диапазоне от 0 до 100:");
	for (int i=0 ; i<arr.length ; i++) {arr[i] = rnd.nextInt(100); // Присвоение i-тому элементу массива случайного значения
    System.out.print(arr[i]+" ");}
	System.out.println();
	System.out.println("-----------------------------------------------------");
	System.out.println("Результат-массив с наибольшем и наименьшим элементом: "+MaxMin(arr)[0]+" "+MaxMin(arr)[1]);
}		
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}

}
