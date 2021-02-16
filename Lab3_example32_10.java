import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Collections; //по убыванию
import java.util.Random; // пакет для подключения класса Random и создания объекта для генерации случайного числа
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class example32_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
		System.out.println("Массив будет создан случайно.");
		System.out.println("Введите размер массива"); // запрос
	try {		
		int Size = in.nextInt(); // размер массива
		Integer[] nums = new Integer[Size]; // Создание массива 
		Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа 
		System.out.println("Не сортированный массив создан генератором случайных чисел в диапазоне от 0 до 200:");
		for (int i = 0 ; i < nums.length ; i++ ){ nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
		                                          System.out.print(nums[i]+" "); 
        }
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		Arrays.sort(nums, Collections.reverseOrder()); // Сортировка массива по убыванию его элементов
		System.out.println("Произведена сортировка массива в порядке убывания:"); 
		for (int i = 0 ; i < nums.length ; i++ ){ System.out.print(nums[i]+" ");	}
		System.out.println();
	}    
	catch (Exception error) {
		    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
			System.out.println("Возможно вы некорректно ввели данные!");
			 }
	in.close();
	}
}
