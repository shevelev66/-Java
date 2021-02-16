import java.util.Scanner;
class IntPoleTwo {
//класс, у которого 2 целочисленных поля
 int FirstPole;	//1-е целочисленное поле
 int SecondPole;	//2-е целочисленное поле
 //конструкторы
 IntPoleTwo() { //без предачи аргумента
	 System.out.println("Конструирование объекта с 2 целочисленными полями без аргументов:");
	 FirstPole=5;
	 SecondPole=10;
	 System.out.println("1-е поле="+FirstPole+";"+" 2-е поле="+SecondPole+";"+" -задано в конструкторе");
	 System.out.println("-----------------------------------------------------");
 }
 IntPoleTwo(int first) { //с предачей аргумента
	 System.out.println("Конструирование объекта с 2 целочисленными полями с передачей 1 аргумента:");
	 FirstPole=first;
	 SecondPole=10;
	 System.out.println("1-е поле="+FirstPole+";"+" -задано через аргумент"+" 2-е поле="+SecondPole+";"+" -задано в конструкторе");
	 System.out.println("-----------------------------------------------------"); 
 } 
 IntPoleTwo(int first, int second) { //с предачей 2-х аргументов
	 System.out.println("Конструирование объекта с 2 целочисленными полями с передачей 2-х аргументов:");
	 FirstPole=first;
	 SecondPole=second;
	 System.out.println("1-е поле="+FirstPole+";"+" 2-е поле="+SecondPole+";"+" -задано через аргумент");
	 System.out.println("-----------------------------------------------------"); 
 } 
} 
public class example32_03 {
	public static void main(String[] args) {
try {		
	Scanner in = new Scanner(System.in);	
	System.out.println("Программа с классом, у которого есть два целочисленных поля.\n"+"В классе описаны конструкторы, позволяющие создавать объекты без передачи аргументов,\n"+"с передачей одного аргумента и с передачей двух аргументов.");
	System.out.println("-----------------------------------------------------");
	IntPoleTwo ipole=new IntPoleTwo();	
	System.out.println("Для демонстрации работы программы");
	System.out.println("Введите целое число:");
	int number=in.nextInt(); //ввод целого числа для аргумента конструктора
	IntPoleTwo ipole1=new IntPoleTwo(number);
	System.out.println("Для демонстрации работы программы");
	System.out.println("Введите 1-е целое число:");
	int num1=in.nextInt(); //ввод целого числа для аргумента конструктора
	System.out.println("Введите 2-е целое число:");
	int num2=in.nextInt(); //ввод целого числа для аргумента конструктора
	IntPoleTwo ipole2=new IntPoleTwo(num1, num2);
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}

}
