public class example32_01_2 {//ПРИМЕР 2
	public static void main(String[] args) {
		try {       //блок проверяемого кода
					System.out.println("0");
					//генерация исключения
					throw new RuntimeException("Непроверяемая ошибка"); 
					//System.out.println("1"); - код не выполнится-ошибка при компилировании
		    }
		//RuntimeException является подклассом Exception 
		catch (Exception e) { System.out.println("2 "+ e ); } //обработка исключения суперклассом
					//выполнение программы после обработки исключения
		            System.out.println("3"); 
					}
}
