import java.util.Scanner;
import java.util.Random;
public class example32_09 {
	//статический метод для расчета среднего значаения
    static char ObmenCh(char arr[]) [] { 
    	char temp; //буфер обмена
    	for (int j=0; j<arr.length/2; ++j) { //алгоритм обмена пол массива на пол массива
    		temp=arr[j];
    		arr[j]=arr[arr.length-1-j];
    		arr[arr.length-1-j]=temp;
    	}
	return arr;
    }
	public static void main(String[] args) {
try {	
	    System.out.println("Программа со статическим методом, аргументом которому передается одномерный символьный массив.\n"
			+"В результате вызова метода элементы массива попарно меняются местами:\n"
			+ "первый — с последним, второй — с предпоследним и так далее.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random для "случайного" заполнения символьного массива
		System.out.println("-----------------------------------------------------");	
		System.out.println("Введите длину символьного массива:");
		int size=in.nextInt(); //размер символьного массива
		char arrchar[]=new char[size]; //создаем символьный массив
		System.out.println("Исходный массив создан генератором случайных чисел в диапазоне от A до z:");
		for (int i=0; i<arrchar.length; ++i) {arrchar[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(arrchar[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		arrchar=ObmenCh(arrchar);
		System.out.println("Массив после обработки методом (обмена элементов):");
		for (int i=0; i<arrchar.length; ++i) {System.out.print(arrchar[i]+" ");}
		System.out.println();
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}	
	}

}
