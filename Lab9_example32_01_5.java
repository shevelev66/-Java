public class example32_01_5 { //ПРИМЕР 5
	public static void main(String[] args) {
		try { //блок проверяемого кода
					System.out.println("0");
					//генерация исключения
					throw new RuntimeException("ошибка");
			} 
		//данный обработчик не перехватит исключение,т.к. не соответствует классу
		catch (NullPointerException e) { System.out.println("1" ); } //обработчик исключения
		            //обработка исключения пройдет обработчиком системы Java
					//программа после обработчика выполнена не будет
		            System.out.println("2");
					}
}
