public class example32_01_11 { //ПРИМЕР 11
	public static void main(String[] args) {
		try {//блок проверяемого кода
		    	System.out.println("0");
		    	//генерация исключения
				throw new NullPointerException("ошибка");
			}
		//обработчик исключения
		catch (NullPointerException e) { System.out.println("1" ); }
		//блок кода, который выполнится обязательно
		finally { System.out.println("2" ); }
		        //выполнение программы после обработчика исключения
				System.out.println("3");
				}
		}