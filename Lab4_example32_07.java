public class example32_07 {
	public static void main(String[] args) {
try {
		System.out.println("Программа создает двумерный числовой массив и этот массив заполняется змейкой: \n"+"сначала первая строка (слева направо), затем последний столбец (снизу вверх), \n"+"вторая строка (слева направо) и так далее. \n");
		 // Количество столбцов.
        int m = 5;
        // Количество строк.
        int n = 6;
        int i; //счетчик строк
        int j;//счетчик столбцов
        int[][] mass = new int[n][m];
        // Начальное значение.
        int value = 1;
        // Проход по строкам.
        for (i = 0; i < n; i++)
        {
                // Проход по столбцам
                for (j = 0; j < m; j++)
                {
                	if (mass[i][j]==0) {mass[i][j] = value; value++;} //if  пропускает уже заполненный элемент
                	if (j==m-1-i) {int temp=i;
                		for (i=n-1; i>0; --i) {if (mass[i][j]==0) {mass[i][j] = value; value++;}}
                		i=temp;
                				}
                }
         }
      //вывод массива
		for (i = 0 ; i <mass.length; ++i) {
			for (j=0; j<mass[i].length; ++j) {System.out.printf("%5d", mass[i][j]); }
			System.out.println(); 
        	}
}		
catch (Exception error) {
    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	   }	
	}
}