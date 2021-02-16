public class example32_01_3 { //ПРИМЕР 3
	public static void main(String[] args) {
		try {//блок проверяемого кода
					System.out.println("0");
					//генерация исключения RuntimeException
					throw new RuntimeException("ошибка");
			}
		//при выполнении исключение будет перехваченно подходящим классом
		catch (NullPointerException e) { System.out.println("1" ); } //обработка исключения
		catch (RuntimeException e) { System.out.println("2" ); } //обработка исключения RuntimeException
		catch (Exception e) { System.out.println("3" ); } //обработка исключения
		            //выполнение программы после обработки исключения
					System.out.println("4");
					}
}