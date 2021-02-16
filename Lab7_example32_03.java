import java.util.Scanner;
class SuperA {//суперкласс
	public int InPole; //открытое целочисленное поле
	//конструктор с параметром
	SuperA (int n) {
		InPole=n;
	}
	//метод с параметром
	void SetInPole (int m) {
		InPole=m;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "super:" +  
		" Class name: " + this.getClass().getSimpleName() +";"+ 
		" InPole=" + this.InPole+" -целочисленное поле";
		return ClassNameAndFieldValue ;
		}
}
class SubB extends SuperA {//подкласс суперкласса 
	public char CharPole; //открытое символьное поле
	//конструктор с параметрами
	SubB (int n, char ch) {
	super(n);
	CharPole=ch;
	}
	//метод с параметрами
	void SetInPole (int m, char cha) {
	super.SetInPole(m);
	CharPole=cha;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub:" +  
		" Class name: " + this.getClass().getSimpleName() + ";"+
		" InPole=" + this.InPole+" -целочисленное поле"+";"+
		" CharPole="+this.CharPole+" -символьное поле";
		return ClassNameAndFieldValue ;
		}
}
class SubC extends SubB {//подкласс подкласса
	public String StrPole; //открытое текстовое поле
	//конструктор с параметрами
	SubC (int n, char ch, String st) {
	super(n,ch);
	StrPole=st;
	}
	//метод с параметрами
	void SetInPole (int m, char cha, String strin) {
	super.SetInPole(m, cha);
	StrPole=strin;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub sub:" +  
		" Class name: " + this.getClass().getSimpleName() + ";" +
		" InPole=" + this.InPole+" -целочисленное поле"+";"+
		" CharPole="+this.CharPole+" -символьное поле"+";"+
		" StrPole="+this.StrPole+" -текстовое поле";
		return ClassNameAndFieldValue ;
		}
}
public class example32_03 {
	public static void main(String[] args) {
try {	
	 Scanner in = new Scanner(System.in); //сканнер для символа
	 Scanner numb = new Scanner(System.in); //сканнер для чисел
	 Scanner st = new Scanner(System.in); //сканнер для текста
	 System.out.println("*************Проверка конструктора:******************");
	//конструктор суперкласса
	SuperA objA=new SuperA (1);
	System.out.println(objA.toString());
	System.out.println("-----------------------------------------------------");
	//конструтор подкласса суперкласса
	SubB objB=new SubB (2,'B');
	System.out.println(objB.toString());
	System.out.println("-----------------------------------------------------");
	//конструтор подкласса подкласса
	SubC objC=new SubC (3,'C',"задано конструктором");
	System.out.println(objC.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("*************Проверка методов:******************");
	System.out.println("Введите число для проверки метода с целочисленным аргументом:");
	int num=numb.nextInt();
	objA.SetInPole(num); //метод с целочисленным аргументом
	System.out.println(objA.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("Введите число для проверки метода с целочисленным аргументом  и символом:");
	num=numb.nextInt();
	System.out.println("Введите символ для проверки метода с целочисленным аргументом и символом:");
	char c=in.next().charAt(0);
	objB.SetInPole(num, c); //метод с целочисленным аргументом и символом
	System.out.println(objB.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("Введите число для проверки метода с целочисленным аргументом, символом и текстом:");
	num=numb.nextInt();
	System.out.println("Введите символ для проверки метода с целочисленным аргументом, символом и текстом:");
	c=in.next().charAt(0);
	System.out.println("Введите текст для проверки метода с целочисленным аргументом, символом и текстом:");
	String Str=st.nextLine();
	objC.SetInPole(num, c, Str);
	System.out.println(objC.toString());
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	 }	
	}
}
