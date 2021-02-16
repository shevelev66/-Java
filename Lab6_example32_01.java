import java.util.Random;
import java.util.Scanner;
class SymText {
//класс с 2-мя полями
	char SymPole; // символьное поле
	String TextPole; // тестовое поле
	//метод присваивает сивол поле
	void SetSymText(char ch) {
		this.SymPole=ch;
		System.out.println("Символьное поле(проверка)="+SymPole);
	}
	//метод присваивает текстовое поле
	void SetSymText(String txt) {
			this.TextPole=txt;
			System.out.println("Текстовое поле(проверка)="+TextPole);
		}
	//метод с символьным массивом
	void SetSymText(char charr[]) {
		if (charr.length==1) { SetSymText(charr[0]);}
		else { SetSymText(String.valueOf(charr));}
		System.out.println("Строка(символ) обработан методом как массив символов");
	}
}
public class example32_01 {
	public static void main(String[] args) {
try {
	System.out.println("Программу с классом, в котором есть два поля: символьное и текстовое.\n"
			+"В классе есть перегруженный метод для присваивания значений полям.\n"
			+"Метод может вызваться с символьным аргументом-присваивается символьному полю.\n"
			+"Метод может вызваться с текстовым аргументом-присваивается текстовому полю.\n"
			+"Метод может вызваться с символьным массивом-присваивается символьному полю, если 1 элемент\n"
			+"присваивается текстовому полю, если >1 элемента");
		Scanner in = new Scanner(System.in); //сканер для символов и строк
		Scanner num = new Scanner(System.in); //сканер для чисел
		Random rnd = new Random(); // Random для "случайного" заполнения символьного массива
		SymText obj=new SymText(); //объект класса
        System.out.println("-----------------------------------------------------");
		System.out.println("Введите символ или строку:");
		String str=in.nextLine();//ввод строки или символа
		if (str.length()>1) {obj.SetSymText(str);}
		else {obj.SetSymText(str.charAt(0));}
		System.out.println("-----------------------------------------------------");
		System.out.println("Введите размер символьного массива:");
		int size=num.nextInt();
		char array[]=new char[size];
		System.out.println("Символьный массив создан генератором случайных чисел в диапазоне от A до z:");
		for (int i=0; i<array.length; ++i) {array[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(array[i]+" ");}
		System.out.println();
		obj.SetSymText(array);
		in.close();
		num.close();
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}
}
