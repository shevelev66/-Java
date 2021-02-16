public class example32_01_12 { //ПРИМЕР 12
	public static void m(String str, double chislo) {
	    //генерация исключений IllegalArgumentException
	    if (str==null) { throw new IllegalArgumentException("Строка введена неверно"); } //отработает
		if (chislo>0.001) {throw new IllegalArgumentException("Неверное число"); } // не отработает
		}
public static void main(String[] args) {
    //вызов метода с неверными аргументами
	m(null,0.000001);
	//т.к. обработчики отсутствуют то
	//обработка произойдет обработчиком системы java
	}
}