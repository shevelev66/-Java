import java.util.Scanner;
import java.util.Random;
public class example32_06 {
	//статический метод для создания нового массива
    static int NewArray(int arr[], int size) [] { 
    	int newsize;
    	if (arr.length>size) {newsize=size;}
    	else {newsize=arr.length;}
    	int newarr[]=new int[newsize]; 
    	for (int j=0;j<newsize;++j) {newarr[j]=arr[j];}
	return newarr;
    }
	public static void main(String[] args) {
try {	
	   System.out.println("Программа со статическим методом, которому аргументом передается целочисленный массив и целое число.\n"
			+"Метод возвращает ссылку на новый массив, который получается из исходного массива,\n"
			+"Количество элементов, которые нужно взять из исходного массива, определяются вторым аргументом метода.\n"
			+"Если второй аргумент метода больше длины исходного массива, то методом создается копия исходного массива.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random для "случайного" заполнения исходного массива
		System.out.println("-----------------------------------------------------");	
		System.out.println("Создадим исходный массив для статического метода, введите размер исходного массива:");
		int insize=in.nextInt(); //размер исходного массива
		int[] initarr = new int[insize]; // Создание исходного массива 
		System.out.println("Исходный массив создан генератором случайных чисел в диапазоне от 0 до 200:");
		for (int i=0 ; i<initarr.length ; i++) {initarr[i] = rnd.nextInt(200); // Присвоение i-тому элементу массива случайного значения
        System.out.print(initarr[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");	
		System.out.println("Введите размер нового массива для обработки статическим методом:");
		int size=in.nextInt(); //размер нового массива
		int[] newarr = new int[size];
		newarr=NewArray(initarr, size);
		System.out.println("Новый массив, созданный статическим методом:");
		for (int i=0 ; i<newarr.length ; i++) {System.out.print(newarr[i]+" ");}
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}
}
