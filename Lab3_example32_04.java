import java.util.Scanner;
public class example32_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
try {		
		int arr[] = new int [2];
    	System.out.println("Введите 1-е число:"); //запрос
    	arr[0] = in.nextInt(); //1-е число
    	System.out.println("Введите 2-е число:"); //запрос
    	arr[1] = in.nextInt(); //2-е число
    	//метод сортировки выбором
    	//-----------------------------FOR--------------------------------
	    System.out.println("--------Алгоритм сортировки выбором------------------------------");
	    System.out.println("Последовательность сформирована циклом for:");
    	int i, j, k, x;
    	for( i=0; i < 2; i++) { 
    		k=i; x=arr[i];
    	for( j=i+1; j < 2; j++) // цикл выбора наименьшего элемента
    	if ( arr[j] < x ) { k=j; x=arr[j];} // k - индекс наименьшего элемента
    	arr[k] = arr[i]; arr[i] = x;} // меняем местами наименьший с a[i]
    	System.out.print("Последовательность Min -> Max: ");
    	for ( i=0; i<2; ++i) { System.out.print(arr[i]+" "); } //вывод массива данных на консоль
        System.out.println();
        //
        System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована циклом do:");
	    i=0;
	    do {
	    k=i; x=arr[i];
	    j=i+1;
	    if (j>=2) j=1; //доп условие из за пост проверки цикла
	    do {
    	 // цикл выбора наименьшего элемента
    	if ( arr[j] < x ) { k=j; x=arr[j];}// k - индекс наименьшего элемента
	    ++j;
	    }
	    while (j<2);
    	arr[k] = arr[i]; arr[i] = x;
    	++i;
	    }
	    while (i<2);
	    System.out.print("Последовательность Min -> Max: ");
	    i=0;
	    do {
	    	System.out.print(arr[i]+" "); //вывод массива данных на консоль
	    	++i;
	    }
	    while (i<2);
	    //
	    System.out.println();
	    System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована циклом while:");
	    i=0;
	    while (i<2) {
	    k=i; x=arr[i];
	    j=i+1;
	    if (j>=2) j=1; //доп условие из за пост проверки цикла
	    while (j<2) {
    	 // цикл выбора наименьшего элемента
    	if ( arr[j] < x ) { k=j; x=arr[j];}// k - индекс наименьшего элемента
	    ++j;
	    }
	    arr[k] = arr[i]; arr[i] = x;
    	++i;
	    }
	    System.out.print("Последовательность Min -> Max: ");
	    i=0;
	    while (i<2) {
	    	System.out.print(arr[i]+" "); //вывод массива данных на консоль
	    	++i;
	    }
}    
catch (Exception error) {
	    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
		System.out.println("Возможно вы некорректно ввели данные!");
		 }
in.close();
	  }
}