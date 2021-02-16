import java.util.Scanner;
class SymbolTable {
//класс, содержащий символьные поля и метод вывода таблицы кодов
 char FirstPoleForSymbol;	//символьное поле 1
 char SecondPoleForSymbol;	//символьное поле 2
 public void ShowSymbolTable() // метод вывода кодовой таблицы
 {
	 System.out.print("Символы кодовой таблицы между заданными полями: ");
	 //в зависимости от заданных полей символы выводятся в порядке возрастания или убывания
	 if ((int)FirstPoleForSymbol<(int)SecondPoleForSymbol) for (int i=(int) FirstPoleForSymbol; i<=SecondPoleForSymbol;++i) {System.out.print(" "+(char) i);}
	 else for (int i=(int) FirstPoleForSymbol; i>=SecondPoleForSymbol;--i) {System.out.print(" "+(char) i);}
	 System.out.println();
 }
} 
public class example32_02 {

	public static void main(String[] args) {
try {		
		SymbolTable sytab = new SymbolTable();
		Scanner in = new Scanner(System.in);
		System.out.println("Программа с классом, у которого есть два символьных поля и метод.\n"+"Он возвращает результат, и у него нет аргументов.\n"+"При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между» символами, \n"+"являющимися значениями полей объекта (из которого вызывается метод).");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Введите 1 символ для кодовой таблицы:");
		sytab.FirstPoleForSymbol = in.next().charAt(0); //выбирает первый символ ввденный пользователем
		System.out.println("Введите 2 символ для кодовой таблицы:");
		sytab.SecondPoleForSymbol = in.next().charAt(0); //выбирает первый символ ввденный пользователем
		sytab.ShowSymbolTable();
        in.close();
}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	}
}
}	
