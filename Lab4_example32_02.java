public class example32_02 {
	public static void main(String[] args) {
		System.out.println("Программа выводит в консольное окно прямоугольный треугольник с катетами 8 и 8 "); //со сторонами 3 и 4
try {
		for (int i=1; i<=8; ++i) {
			for (int j=1; j<=i; ++j) {System.out.print("*");}
			System.out.println();
		} 
}
catch (Exception error) {
System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
                        }
	}
}