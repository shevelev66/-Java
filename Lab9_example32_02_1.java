import java.util.InputMismatchException;
import java.util.Scanner;
public class example32_02_1 {//РЕАЛИЗАЦИЯ БЕЗ МЕТОДОВ
	public static void main(String[] args) {
		try {		
			    System.out.println("В программе вычисляется среднее значение среди положительных элементов одномерного массива (тип элементов int), вводимого с клавиатуры:");
			    Scanner in=new Scanner(System.in); //инициализация ввода
			    //Ввод с клавиатуры списка из n целых чисел		
				System.out.print("Введите длину массива: ");
				//исключение - несоответствие ввода InputMismatchException
				// если ввести строку или число с плавающ запятой вместо int
				//длина массива + элементы массива
				// для длины массива NegativeArraySizeException - если ввести отрицательное значение
				int size=in.nextInt();
				int[] array=new int[size]; //создание массива
				System.out.println("Введите массив целых чисел:");
				for (int i=0; i<array.length; ++i) {array[i]=in.nextInt();}  
				//расчет среднего значения из положительных элементов
				System.out.print("Положительные элементы массива:");
				int n=0; //число положительных элементов
				int sum=0; //сумма положительных элементов
				for (int i=0; i<array.length; ++i) {
		        	if (array[i]>0) { 
		        		System.out.print("["+i+"]="+array[i]+" ");
		        		sum=sum+array[i];
		        		n++; }
				                 }
				//при отсутствии положительных чисел неопределенность NaN=sum/n=0/0 - исключения НЕ БУДЕТ
				// поэтому создадим его :)
				if (n==0) throw new ArithmeticException ("Деление на ноль!");
				else {double midle=(double) sum/n;  System.out.printf("Среднее значение =%.2f ", midle);} 
		     }
		catch (InputMismatchException error) { System.out.println("Вы некорректно ввели данные массива!"); } //обработка исключения
		catch (ArithmeticException error) { System.out.println("В массиве нет положительных чисел!"); } //обработка исключения
		catch (NegativeArraySizeException error) { System.out.println("Вы ввели отрицательную длину массива!"); } //обработка исключения
		 }
		}	