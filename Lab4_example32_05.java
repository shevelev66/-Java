import java.util.Random; //генератор случайных чисел
public class example32_05 {
	public static void main(String[] args) {
		System.out.println("ѕрограмма создает двумерный массив, заполн€ет случайными числами, а за тем выполн€ет перестановку строк и столбцов"); 
try {		
		int [][] array = new int [3][5];
		int [][] Tarray=new int [5][3]; //перестановочный массив, т.к. матрица не квадратна€
		Random rnd=new Random();
		int i ;		// переменна€ задает число, необходимое дл€ расчета количества строк
		int j ; // переменна€ задает число, необходимое дл€ расчета количества колонок (символов в строке)
		System.out.println("---------------------------------------------------------------");
		//заполнение массива случайными числами от 0 до 200
		System.out.println("»сходный массив (матрица 3 x 5), заполненный случайными числами от 0 до 200: ");
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {array[i][j]=rnd.nextInt(200); }
			   }
		//вывод массива
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {System.out.printf("%5d", array[i][j]); }
			System.out.println(); 
        	}
		System.out.println("---------------------------------------------------------------");
		//перестановка
		for (i=0; i<array.length; i++) {
			for (j=0; j<array[i].length; j++) {
				Tarray[j][i]=array[i][j];
			}
		}
		//вывод массива
		System.out.println("ћассив (матрица 5 x 3) после перестановки строк и столбцов: ");
				for (i = 0 ; i <Tarray.length; ++i) {
					for (j=0; j<Tarray[i].length; ++j) {System.out.printf("%5d", Tarray[i][j]); }
					System.out.println(); 
		        	}
}		
		catch (Exception error) {
		    System.out.println("ѕри обработке данных произошла ошибка!"); //обработка исключени€
			   }
	}
}