import java.util.Random;
import java.util.Scanner;
public class example32_07 {
	//статический метод для создания нового массива
    static int IntArray(char chr[]) [] { 
    	int newarr[]=new int[chr.length]; 
    	for (int j=0; j<newarr.length; ++j) {newarr[j]=(int) chr[j];}
	return newarr;
    }
	public static void main(String[] args) {
try {
	System.out.println("Программа со статическим методом, аргументом которому передастся символьный массив\n"
			+"Результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива-аргумента.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random для "случайного" заполнения символьного массива
		System.out.println("-----------------------------------------------------");	
		System.out.println("Введите длину символьного массива:");
		int size=in.nextInt(); //размер символьного массива
		char arrchar[]=new char[size]; //символьный массив
		System.out.println("Исходный массив создан генератором случайных чисел в диапазоне от A до z:");
		for (int i=0; i<arrchar.length; ++i) {arrchar[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(arrchar[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Целочисленный массив, полученный из символьного:");
		for (int i=0; i<IntArray(arrchar).length; ++i) {System.out.print(IntArray(arrchar)[i]+" "); }
}		
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}

}
