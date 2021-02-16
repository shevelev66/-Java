public class example32_01_1 { //ПРИМЕР 1
	public static void main(String[] args) {
		try {   //блок проверяемого кода
				System.out.println("0");
				//генерация исключения
				throw new RuntimeException("Непроверяемая ошибка"); //создан экземпляр RuntimeException с сообщением
				} 
		catch (RuntimeException e) { // исключение перехвачено
				System.out.println("1 "+ e); // исключение обработано
				}
		       //выполнение программы после обработки исключения
				System.out.println("2"); 
			}
}
