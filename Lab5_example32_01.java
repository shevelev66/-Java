import java.util.Scanner;
class Symbol {
//класс, содержащий закрытое символьное поле
 private char PoleForSymbol;	//закрытое символьное поле
 //открытые методы для обработки поля
 public void SetSymbol(char symbol)//первый открытый метод позволяет присвоить значение полю
 {
     this.PoleForSymbol = symbol;
 }
 public int KodSymbol()//второй открытый метод возвращает результатом код символа
 {
     return (int)  this.PoleForSymbol;
 }
 public void ShowSymbolСode() //третий открытый метод позволяет вывести в консольное окно символ (значение поля) и его код.
 {
     System.out.println("В закрытом поле объекта: "+ PoleForSymbol + "  и код этого символа "+KodSymbol());
 }
} 
public class example32_01 {

	public static void main(String[] args) {
try {		
		Symbol pole = new Symbol();
		Scanner in = new Scanner(System.in);
		System.out.println("Программа с классом, в котором есть закрытое символьное поле и три открытых метода.\n"+"Один из методов позволяет присвоить значение полю.\n"+"Второй метод при вызове возвращает результатом код символа.\n"+"Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Введите 1 символ для демонстрации работы программы:");
		char text = in.next().charAt(0); //выбирает первый символ ввденный пользователем
		pole.SetSymbol(text);
        pole.KodSymbol();
        pole.ShowSymbolСode();
        in.close();
}
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	}
}
}	


