import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Random; // пакет для подключения класса Random и создания объекта для генерации случайного числа
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class example32_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
		System.out.println("Массив будет создан случайно.");
		System.out.println("Введите размер массива"); // запрос
	try {		
		int Size = in.nextInt(); // размер массива
		int[] nums = new int[Size]; // Создание массива 
		Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа 
		System.out.println("Не сортированный массив создан генератором случайных чисел в диапазоне от 0 до 200:");
		for (int i = 0 ; i < nums.length ; i++ ){ nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
		                                          System.out.print("["+i+"]="+nums[i]+" "); 
        }
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		Arrays.sort(nums); // Сортировка массива по возрастанию его элементов
		System.out.println("Произведена сортировка массива:"); 
		for (int i = 0 ; i < nums.length ; i++ ){ System.out.print("["+i+"]="+nums[i]+" ");	}
		System.out.println();
		System.out.println("Элемент с минимальным значением: "+nums[0]);
		for (int i = 0 ; i < nums.length ; i++ ){ if (nums[i]==nums[0]) {System.out.print("["+i+"]="+nums[i]+" ");	} }
	 }    
	catch (Exception error) {
		    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
			System.out.println("Возможно вы некорректно ввели данные!");
			 }
		    in.close();
	}
}