import java.util.Scanner;
class First {//суперкласс
	public char CharPole; //открытое символьное поле
	//конструктор с копией объекта
	First (First obj) {
		CharPole=obj.CharPole;
		System.out.print("Символ задан через конструктор с копией объекта: "+CharPole+"\n");
	}
	//конструктор с параметром
	First (char ch) {
		CharPole=ch;
		System.out.print("Символ задан через конструктор с аргументом: "+CharPole+"\n");
	}
}
class Second extends First {//подкласс суперкласса 
	public String StrPole; //открытое текстовое поле
	//конструктор с копией объекта
	Second (Second obj) {
	super(obj);
	StrPole=obj.StrPole;
	System.out.print("Текст задан через конструктор с копией объекта: "+StrPole+"\n");
	}
	//конструктор с параметрами
	Second (char cha, String Str) {
	super(cha);
	StrPole=Str;
	System.out.print("Текст задан через конструктор с аргументом: "+StrPole+"\n");
	}
}
class Third extends Second {//подкласс подкласса
	public int InPole; //открытое целочисленное поле
	//конструктор с копией объекта
	Third (Third obj) {
		super(obj);
		InPole=obj.InPole;
		System.out.print("Число задано через конструктор с копией объекта: "+InPole+"\n");
	}
	//конструктор с параметрами
	Third (char chb, String StrA, int n) {
	super(chb,StrA);
	InPole=n;
	System.out.print("Число задано через конструктор с аргументом: "+InPole+"\n");
	}
}
public class example32_04 { 
	public static void main(String[] args) {
try {	
	 Scanner in = new Scanner(System.in); //сканнер для символа
	 Scanner numb = new Scanner(System.in); //сканнер для чисел
	 Scanner st = new Scanner(System.in); //сканнер для текста
	 System.out.println("*************Проверка конструктора с параметрами:******************");
	 System.out.println("Введите символ для проверки конструктора с аргументом:");
	 char c=in.next().charAt(0);
	 First A=new First(c); //конструктор с символом
	 System.out.println("Создан объект суперкласса: "+A.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("Введите текст для проверки конструктора с аргументом:");
	 String Str=st.nextLine();
	 Second B=new Second(c,Str); //конструктор с текстом
	 System.out.println("Создан объект подкласса: "+B.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("Введите число для проверки конструктора с аргументом:");
	 int num=numb.nextInt();
	 Third C=new Third(c, Str, num); //конструктор с числом
	 System.out.println("Создан объект подкласса: "+C.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("*************Проверка конструктора с копией:******************");
	 First A1=new First(A); //конструктор с копией объекта
	 System.out.println("Создана копия объекта суперкласса: "+A1.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 Second B1=new Second(B); //конструктор с копией объекта
	 System.out.println("Создана копия объекта подкласса: "+B1.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 Third C1=new Third(C); //конструктор с копией объекта
	 System.out.println("Создана копия объекта подкласса: "+C1.getClass().getName());
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
		 }
	}

}
