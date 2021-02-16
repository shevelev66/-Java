public class example32_01_10 { //ПРИМЕР 10
	public static int m(){
		try {//блок проверяемого кода
				System.out.println("0"); return 15; //выход из метода
			}
		//блок кода, который выполнится обязательно
		finally { System.out.println("1"); return 20;} //выход из метода
		}
		public static void main(String[] args) {
			//вызов метода
			System.out.println(m());
			}
}