import java.util.Scanner;
class IntPoleSt {
	private static int IntPole=0; //закрытое статическое целочисленное поле =0
	static void ShowPoleInc() {
		System.out.println("«акрытое стаическое целочисленное поле="+IntPole);
		IntPole++;
	}
}
public class example32_02 {
	public static void main(String[] args) {
try {		
		Scanner in = new Scanner(System.in); 
		IntPoleSt obj=new IntPoleSt();
		System.out.println("ѕрограмма с классом, в котором есть закрытое статическое целочисленное поле с нач. значением=0\n"
				+"¬ классе описан статический метод, отображающий текущее значение статического пол€\n"
				+"после чего значение пол€ увеличиваетс€ на единицу.");
metka1:{	while (true) {		//
	        System.out.println("-----------------------------------------------------");
			obj.ShowPoleInc(); //отображение пол€ + Inc
metka:{	while (true) {
			System.out.println("ѕродолжить? (д/н или y/n)"); 
				char answer=in.nextLine().charAt(0); 
				switch (answer) {
				case 'y': break metka;
				case 'n': System.out.println("ƒо свидани€!"); break metka1; 
				case 'д': break metka;
				case 'н': System.out.println("ƒо свидани€!"); break metka1;
				default: System.out.println("¬ведите корректный ответ!"); continue; 
				}
			   }
		     }
			}}		
	}		
catch (Exception error) { System.out.println("ѕри обработке данных произошла ошибка!"); //обработка исключени€
}
	}

}
