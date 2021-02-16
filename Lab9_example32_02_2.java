import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class example32_02_2 {//РЕАЛИЗАЦИЯ БЕЗ МЕТОДОВ
	public static void main(String[] args) {
		try {		
			    System.out.println("В программе из матрицы выводится столбец с номером, заданным с клавиатуры:");
				Scanner in=new Scanner(System.in); //инициализация ввода
				System.out.println("Программа создает матрицу (двумерный массив) и заполняет случайными числами:");
				int [][] array = new int [5][5]; //квадратная матрица
				Random rnd=new Random();
				int i ;		// переменная задает число, необходимое для расчета количества строк
				int j ; // переменная задает число, необходимое для расчета количества колонок 
				System.out.println("---------------------------------------------------------------");
				//заполнение массива случайными числами от 0 до 200
				System.out.println("Исходный массив (матрица 5 x 5), заполненный случайными числами от 0 до 200: ");
				for (i = 0 ; i <array.length; ++i) {
					for (j=0; j<array[i].length; ++j) {array[i][j]=rnd.nextInt(200); }
					   }
				//вывод массива
				for (i = 0 ; i <array.length; ++i) {
					for (j=0; j<array[i].length; ++j) {System.out.printf("%5d", array[i][j]); }
					System.out.println(); 
		        	}
				System.out.println("---------------------------------------------------------------");
				System.out.println("Введите номер столбца, который нужно вывести из матрицы (Нумерация в матрице начинается с 1):");
				// при вводе числа больше размерности матрицы ArrayIndexOutOfBoundsException
				//при вводе строки или числа с плавающ запятой InputMismatchException
				int n=in.nextInt();
				System.out.print(n+"-й столбец матрицы:");
				//вывод массива
				for (i = 0 ; i <array.length; ++i) { System.out.printf("%5d", array[i][n-1]);	}
		    }
		catch (InputMismatchException error) { System.out.println("Вы некорректно ввели данные (ошибка типа)!"); } //обработка исключения
		catch (ArrayIndexOutOfBoundsException error) { System.out.println("В массиве нет столбца с таким номером! Увы!"); } //обработка исключения
			}

		}