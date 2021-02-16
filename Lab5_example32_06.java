import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Scanner;
class MaxMin {
//класс, содержащий 2 закрытых целочисленных поля
 private int max;	//закрытое целочисленное поле 1
 private int min;	//закрытое целочисленное поле 2
 //открытый метод для обработки полей с двумя аргументами
 public void SetMaxMin(int one, int two)
 {
    int [] arr= {min, one, two, max}; //создадим массив элементов
    Arrays.sort(arr); // Сортировка массива по возрастанию его элементов
    min=arr[0]; max=arr[3];
 }
//открытый метод для обработки полей с одним аргументом
public void SetMaxMin(int one)
{
   SetMaxMin(one, 0);
}
//конструктор с 2-я аргументами
MaxMin (int one, int two) {
  SetMaxMin(one, two); //по условию конструктор работает как аналогичный метод
}
//конструктор с 1-м аргументом
MaxMin (int one) {
	SetMaxMin(one); //по условию конструктор работает как аналогичный метод
}
 public void ShowPole() //открытый метод позволяет вывести в консольное окно
 {
     System.out.println("В закрытом поле объекта(проверка): max="+max+ " min="+min);
 }
} 
public class example32_06 {
	public static void main(String[] args) {
try {		
		Scanner in = new Scanner(System.in);
		int num1, num2; //ввод аргументов
		System.out.println("Программа с классом, в котором есть два закрытых целочисленных поля (max и min).\n"
				+"Значения полям присваиваются с помощью открытого метода.\n"
				+"Метод может вызываться с одним или двумя целочисленными аргументами.\n"
				+"Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.");
		System.out.println("-----------------------------------------------------");
		System.out.println("Зададим при создании объекта MaxMin max=1 и min=-1 (конструктор c аргументами):");
		MaxMin Comper=new MaxMin(1,-1);
    	Comper.ShowPole();
metka1:{	while (true) {		//
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация вызова метода с 2 аргументами:");
		System.out.println("Введите 1-е целое число для сравнения через объект MaxMin:");
		num1=in.nextInt();//ввод 1-го числа
		System.out.println("Введите 2-е целое число для сравнения через объект MaxMin:");
		num2=in.nextInt();//ввод 2-го числа
		Comper.SetMaxMin(num1, num2);
		Comper.ShowPole();
		System.out.println("-----------------------------------------------------");
		System.out.println("Демонстрация вызова метода с 1 аргументом:");
		System.out.println("Введите целое число для сравнения через объект MaxMin:");
		num1=in.nextInt();//ввод 1-го числа
		Comper.SetMaxMin(num1);
		Comper.ShowPole();
	metka:{	while (true) {
		System.out.println("Продолжить? (д/н или y/n)"); 
			char answer=in.next().charAt(0); 
			switch (answer) {
			case 'y': break metka;
			case 'n': System.out.println("До свидания!"); break metka1; 
			case 'д': break metka;
			case 'н': System.out.println("До свидания!"); break metka1;
			default: System.out.println("Введите корректный ответ!"); continue; 
			}
		   }
	     }
		}} //
	}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}
}
