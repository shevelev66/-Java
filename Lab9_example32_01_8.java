public class example32_01_8 { //ПРИМЕР 8
	public static int m(){
		try { //блок проверяемого кода
				System.out.println("0");
				//генерация исключения в методе
				throw new RuntimeException();
			}
		//блок кода, который выполнится в обязательном порядке
		//с исключением или без него
		finally { System.out.println("1");}
		}
		public static void main(String[] args) {
			//обработчика исключения в методе нет
			//обработка выполнена обработчиком системы Java
		  System.out.println(m());	//вызов метода
			}
		}