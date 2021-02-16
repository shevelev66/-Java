public class example32_01_14 { // ПРИМЕР 14
	public static void m(int x) throws ArithmeticException{ //объявление исключения, которое может генерировать метод
		//сам метод исключение не обрабатывает
		int h=10/x;
		}
	public static void main(String[] args) {
	try { //блок проверяемого кода
			int l = args.length;
			System.out.println("размер массива= " + l); m(l); //вызов метода
		} 
	//обработка исключения деление на ноль
	catch (ArithmeticException e) { System.out.println("Ошибка: Деление на ноль"); }
		}
	}