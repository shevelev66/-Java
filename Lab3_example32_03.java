import java.util.Scanner;
public class example32_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа выводит последовательность чисел Фибоначчи");
    	System.out.println("Введите количество чисел последовательности:"); //запрос
try {		
	    int n = in.nextInt(); //max 47
	    if (n<3) {System.out.println("Вы ввели слишком маленькую размерность последовательности, поэтому программа установить размерность =3"); n=3;}
	    if (n>47) {System.out.println("Вы ввели слишком большую размерность последовательности (> типа int), поэтому программа установить размерность =46"); n=46;}
	    int arr[] = new int [n];
	    arr[0]=1; arr[1]=1;
	    //-----------------------------FOR--------------------------------
	    System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована циклом for:");
	    for (int i=2; i<n; ++i) {arr[i] =arr[i-1]+arr[i-2];}  //заполнение массива данными
	    for (int i=0; i<n; ++i) { System.out.print(arr[i]+" "); } //вывод массива данных на консоль
        System.out.println();
        //-----------------------------DO--------------------------------
        System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована циклом do:");
	    int j=2; //начальное условие
	    do {
	    	arr[j] =arr[j-1]+arr[j-2]; //заполнение массива данными
	    	++j;
	    }
	    while (j<n);
	    j=0; //начальное условие
	    do {
	    	System.out.print(arr[j]+" "); //вывод массива данных на консоль
	    	++j;
	    }
	    while (j<n);
	    System.out.println();
        //-----------------------------WHILE--------------------------------
        System.out.println("--------------------------------------");
	    System.out.println("Последовательность сформирована циклом while:");
	    int k=2;
	    while (k<n) {
	    	arr[k] =arr[k-1]+arr[k-2];  //заполнение массива данными
	        ++k;
	    }
	    k=0;
	    while (k<n) {
	    	System.out.print(arr[k]+" ");  //вывод массива данных на консоль
	        ++k;
	    }
      System.out.println();
        
 }    
catch (Exception error) {
	    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
		System.out.println("Возможно вы некорректно ввели данные!");
		 }
	    in.close();

	}

}

