import java.util.Random;
public class example32_06 {
  public static void main(String[] args) {
			System.out.println("Программа создает и инициализирует двумерный числовой массив, заполняет случайными числами \n"+"Из созданного массива удаляется строка и столбец, создается новый массив. \n"+"Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.");
try {		
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
			int m=rnd.nextInt(5)+1; //индекс удаляемой строки - random от 0 до 4 работает 
			System.out.println("Индекс удаляемой строки: "+m);
			int n=rnd.nextInt(5)+1;  // индекс удаляемого столбца - random от 0 до 4 работает
			System.out.println("Индекс удаляемого столбца: "+n);
			System.out.println("---------------------------------------------------------------");
			int [][] minor = new int [4][4]; //квадратная матрица - минор исходной
			int im; //задание строк минора
			int jm; //задание столбцов минора
			for (i = 0, im=0 ; i <array.length; ++i) {
				for (j=0, jm=0; j<array[i].length; ++j) {
					if (j!=n-1 & i!=m-1)  {minor[im][jm]=array[i][j]; ++jm; } //заполнение минора if удаляет столбец & контроль строки
					}
				if (i!=m-1) { ++im;} //if удаляет строку	
				   }
			//вывод минора
			System.out.println("Преобразованный массив (матрица 4 x 4) - минор исходной матрицы: ");
			for (im = 0 ; im <minor.length; ++im) {
				for (jm=0; jm<minor[im].length; ++jm) {System.out.printf("%5d", minor[im][jm]); }
				System.out.println(); 
	        	}
	}		
			catch (Exception error) {
			    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
				   }
		}
	}