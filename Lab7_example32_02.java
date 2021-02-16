import java.util.Scanner;
class SuperTxtPole { //суперкласс
	//закрытое текстовое поле
	private String TxtPole;
	//конструктор с 1 тестовым аргументом
	SuperTxtPole (String str) {
		this.TxtPole=str;
	}
	//метод для присваения полю без аргумента
	void SetTxTPole () {
		this.TxtPole="присвоено методом без аргумента";
	}
	//метод для присваения полю с аргументом
	void SetTxTPole (String str1) {
		this.TxtPole=str1;
	}
	//метод возвращающий длину строки
	int getlength () {
		return this.TxtPole.length();
	}
	void showtxtpole () { //метод для проверки закрытого поля
		System.out.println("В закрытом текстовом поле(проверка): "+TxtPole);
	}
}
class SubTxtPole extends SuperTxtPole  { //подкласс
    public int IntPole; //открытое целочисленное поле
	//конструктор с 2 аргументами
	SubTxtPole(int n, String str) {
		super(str);
		IntPole=n;
	}
	//метод без аргумента
	void SetTxtPole () {
	super.SetTxTPole();
	this.IntPole=1;
	}
	//метод c текстовым аргументом
	void SetTxtPole (String str2) {
	super.SetTxTPole(str2);
	this.IntPole=2;
		}
	//метод c целочисленным аргументом
	void SetTxtPole (int num) {
	super.SetTxTPole("метод с целочисленным аргументом подкласса");
	this.IntPole=num;
			}
	//метод c текстовым аргументом и целочисленным аргументом
	void SetTxtPole (String str2, int num) {
	super.SetTxTPole(str2);
	this.IntPole=num;
				}
	void showtxtpole () { //метод для проверки закрытого поля
		super.showtxtpole();
		System.out.println("В открытом целочисленном поле(проверка):"+IntPole);
	}
}
public class example32_02 {
	public static void main(String[] args) {
try {		
	 Scanner in = new Scanner(System.in); //сканнер для текста
	 Scanner numb = new Scanner(System.in); //сканнер для чисел
	 System.out.println("*************Проверка суперкласса:******************");	
	 SuperTxtPole superobj=new SuperTxtPole("задано конструктором суперкласса");
	 superobj.showtxtpole(); //проверка конструктора суперкласса
	 System.out.println("-----------------------------------------------------");
	 superobj.SetTxTPole(); //метод без аргумента суперкласса
	 superobj.showtxtpole(); //проверка метода без аргумента суперкласса
	 System.out.println("-----------------------------------------------------");
	 superobj.SetTxTPole("Задано методом с аргументом в суперклассе"); //метод с аргументом суперкласса
	 superobj.showtxtpole(); //проверка метода с аргументом суперкласса
	 System.out.println("-----------------------------------------------------");
	 System.out.println("Метод суперкласса возвращает длину текстовой строки:"+superobj.getlength());
	  System.out.println("**************Проверка подкласса:********************");
	 SubTxtPole subobj=new SubTxtPole(10,"задано конструктором подкласса");
	 subobj.showtxtpole(); //проверка конструктора подкласса
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole(); //метод без аргумента подкласса
	 subobj.showtxtpole(); // проверка метод без аргумента подкласса
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole("Задано методом с аргументом в подклассе");//метод с текстовым аргументом подкласса
	 subobj.showtxtpole(); //проверка метода с текстовым аргументом подкласса
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole(101);//метод с целочисленным аргументом подкласса
	 subobj.showtxtpole();//проверка метода с целочисленным аргументом подкласса
	 System.out.println("-----------------------------------------------------");
	 System.out.println("Введите строку для проверки метода с текстовым и с целочисленным аргументом:");
	 String instr=in.nextLine();
	 System.out.println("Введите число для проверки метода с текстовым и с целочисленным аргументом:");
	 int num=numb.nextInt();
	 subobj.SetTxtPole(instr, num);//метод с текстовым и с целочисленным аргументом подкласса
	 subobj.showtxtpole();//проверка метода с текстовым и с целочисленным аргументом
	 System.out.println("-----------------------------------------------------");
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	 }	 
	}
}
