import java.util.Scanner;
public class example32_03 {
	public static Scanner in=new Scanner(System.in); //переменная для ввода
	public static int [] EnterArray(int i, int [] arr) { //метод ввода
		if (i<0) {return arr;}
		else {
		System.out.print("["+i+"]=");	
		int n=in.nextInt();
		arr[i]=n;
		EnterArray(i-1, arr); //рекурсия
		     }
		return arr;
	}
	public static void PrintArray (int i, int [] arr) //метод вывода
	    {
	        if(i<0) return;
	        else PrintArray(i-1, arr); //рекурсия
	        System.out.print("[" + (i) + "]=" + arr[i]+" ");
	    }	
public static void main(String[] args) {
try {		
			System.out.println("Программа позволяет ввести и вывести одномерный массив целых чисел.\n"
					+ "Для ввода и вывода массива используются рекурсивные методы вместо циклов for.");
			System.out.println("Введите длину массива:");
			int size=in.nextInt(); //ввод длины массива
			int [] array=new int[size]; //создание массива
			System.out.println("Введите элементы массива методом рекурсии:");
			array=EnterArray(size-1, array);
			System.out.println("-------------------------------------------------");
			System.out.println("вывод массива методом рекурсии");
			PrintArray(size-1, array);
		}
	catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); } //обработка исключения
		}
}
