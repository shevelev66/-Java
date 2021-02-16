public class example32_01_6 { //ПРИМЕР 6
	public static void main(String[] args) {
		try { //блок проверяемого кода
					System.out.println("0");
					//генерация исключения NullPointerException
					throw new NullPointerException("ошибка");
			}
		catch (ArithmeticException e) { System.out.println("1" ); }
		//поменять местами обработчики
		//RuntimeException потомок Exception идет раньше своего предка
		catch (RuntimeException e) { System.out.println("3" ); } 
		catch (Exception e) { System.out.println("2" ); }
		           //выполнение программы после обработки исключения
					System.out.println("4");
					}
}
