import java.util.Scanner;
class IntSymbol {
//класс, содержащий символьное и целочисленное поле
 char SymbolPole;	//символьное поле 
 int IntPole;	//целочисленное поле
 //конструктор с двумя аргументами int и char
IntSymbol (int num, char ch) { 
	IntPole=num;
	SymbolPole=ch;
	System.out.println("Целочисленное поле="+IntPole+";"+" Символьное поле="+SymbolPole+";"+" -задано через аргмент конструтора");
}
//конструктор с одим аргументом double 
IntSymbol (double k) { 
	SymbolPole=(char) k; //выделение целой части и преобразование в символ
	IntPole=(int) ((k-(int) k)*100); // выделение дробной части до сотых и преобразование в целое
	System.out.println("Целочисленное поле="+IntPole+";"+" Символьное поле="+SymbolPole+";"+" -задано через аргмент конструтора");
}
}
public class example32_04 {
	public static void main(String[] args) {
try {
		Scanner in = new Scanner(System.in);
		System.out.println("Программа с классом, у которого есть символьное и целочисленное поле.\n"+"В классе описаны конструкторы, позволяющие создавать объекты с передачей 2 аргументов(int и char),\n"+"с передачей одного аргумента (double).");
		System.out.println("-----------------------------------------------------");	
		System.out.println("Для демонстрации работы программы");
		System.out.println("Введите целое число:");
		int number=in.nextInt(); //ввод целого числа для аргумента конструктора
		System.out.println("Введите символ:");
		char cha = in.next().charAt(0); //выбирает первый символ ввденный пользователем
		IntSymbol ipole=new IntSymbol(number, cha); //конструктор с 2 аргументами
		System.out.println("-----------------------------------------------------");
		System.out.println("Введите вещественное число:");
		double dk=in.nextDouble();
		IntSymbol ipole1=new IntSymbol(dk);
        in.close();
   }
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
}
	}

}
