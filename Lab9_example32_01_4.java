public class example32_01_4 { //ПРИМЕР 4
	public static void main(String[] args) {
		try { //блок проверяемого кода
					System.out.println("0");
					//генерация исключения RuntimeException
					throw new RuntimeException("ошибка");
			} 
		//обработчики исключений - перехват исключения подходящим классом
		catch (NullPointerException e) { System.out.println("1" ); }
		//Exception предок RuntimeException
		catch (Exception e) { System.out.println("2" ); } //перехват RuntimeException
		catch (Error e) { System.out.println("3" ); }
					System.out.println("4");
				}
}
