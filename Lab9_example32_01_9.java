public class example32_01_9 { //ПРИМЕР 9
	public static int m(){
		try { //блок проверяемого кода
				System.out.println("0");
				return 55; // выход из метода
			} 
		//блок кода, который обязательно выполнится
		finally { System.out.println("1");}
		}
			public static void main(String[] args) {
				//вызов метода
				System.out.println(m());
				//исключение не генерируется
			}
}