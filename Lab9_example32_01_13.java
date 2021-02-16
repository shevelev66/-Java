public class example32_01_13 {  //ПРИМЕР 13
	public static void main(String[] args) {
		try { //блок проверяемого кода
					int l = args.length; System.out.println("размер массива= " + l);
					int h=10/l; //вероятность генерации исключения при делении на 0
					args[l + 1] = "10"; //вероятность обращения к элементу с несуществующием индексом
			} 
		//обработка исключения при делении на ноль
		catch (ArithmeticException e) { System.out.println("Деление на ноль"); }
		//обработка исключения обращения к элементу с несуществующием индексом
		catch (ArrayIndexOutOfBoundsException e) { System.out.println("Индекс не существует"); }
		  }
		}