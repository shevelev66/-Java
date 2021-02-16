public class example32_01_7 { //ПРИМЕР 7
	public static void main(String[] args) {
		try {//блок проверяемого кода
					System.out.println("0");
					//генерация исключения
					throw new NullPointerException("ошибка");
			} 
		//обработчик исключения NullPointerException
		catch (NullPointerException e) {
					System.out.println("1" ); //выполнится при обработке исключения
					//в обработчике генерируется еще одно исключение
					throw new ArithmeticException(); //генерируется не в блоке проверяемого кода
					}
		// но ArithmeticException не обработается, т.к. генерируется не в блоке проверяемого кода
		catch (ArithmeticException e) { System.out.println("2" ); //обработчик для блока try
					}
		           //ArithmeticException обработается обработчиком системы Java
		           //блок программы после обработки исключения не выполнится
					System.out.println("3");

			}

}	