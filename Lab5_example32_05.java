import java.util.Scanner;
class IntNum {
//класс, содержащий закрытое целочисленное поле
 private int PoleForInt;	//закрытое целочисленное поле
 //открытые метод для обработки поля
public void SetIntPole(int number)//открытый метод с аргументом позволяет присвоить значение полю
 {
	 if (number>100) {this.PoleForInt=100;}
	 else {this.PoleForInt=number;}
 }
public void SetIntPole()//открытый метод без аргумента
 {
	SetIntPole(0); //вызывает метод с аргументом=0
 }
//конструктор с аргументом
IntNum(int number) {
	SetIntPole(number);//по условию конструктор работает как аналогичный метод
}
//конструктор без аргумента
IntNum() {
	SetIntPole();	//по условию конструктор работает как аналогичный метод
}
public void CheckPole()//проверка закрытого поля
{
	System.out.println("Значение закрытого целочисленного поля= "+PoleForInt);
}
} 
public class example32_05 {
public static void main(String[] args) {
try {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа с классом, у которого есть закрытое целочисленное поле.\n"
		+"Если метод вызывается без аргумента, то поле получает значение=0.\n"
		+"Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.\n"
		+"Но если переданное аргументом методу значение >100, то значением полю присваивается число 100.\n"
		+"В классе есть конструктор, который работает по тому же принципу что и метод.");
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация конструктора без аргумента:");
		IntNum Npole=new IntNum(); //конструктор без аргумента
		Npole.CheckPole(); //проверка
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация конструктора c аргументом:");
		System.out.println("Введите целое число для передачи конструктору:");
		int number=in.nextInt(); //ввод целого числа для аргумента 
		IntNum Npole1=new IntNum(number);//конструктор с аргументом
		Npole1.CheckPole(); //проверка
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация вызова метода без аргумента:");
		Npole.SetIntPole();
		Npole.CheckPole(); //проверка
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация вызова метода c аргументом:");
		System.out.println("Введите целое число для передачи методу:");
		number=in.nextInt(); //ввод целого числа для аргумента 
		Npole.SetIntPole(number); //вызов метода с аргументом
		Npole.CheckPole(); //проверка
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
		}		
	}

}
