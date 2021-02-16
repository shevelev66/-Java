import java.util.Scanner;
public class example32_09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ïğîãğàììà ïğîâåğÿåò ÷èñëî íà ïîïàäàíèå â äèàïàçîí îò 5 äî 10 âêëş÷èòåëüíî"); //îïèñàíèå
		System.out.println("Ââåäèòå ÷èñëî äëÿ ïğîâåğêè:"); //çàïğîñ
		try {
		float number = in.nextFloat(); //ââîä ÷èñëà
		if (number >= 5 && number<=10) { //ïğîâåğêà ïğè äåëåíèè íà 4 and íå ìåíüøå 10
			System.out.println("Óğà!×èñëî ïîïàäàåò â äèàïàçîí îò 5 äî 10 âêëş÷èòåëüíî.");
				}
		else {System.out.println("Óâû! ÷èñëî ÍÅ ïîïàäàåò â íóæíûé äèàïàçîí");
		       }
		}
		catch (Exception error) {System.out.println("Ïğè ğàáîòå ïğîãğàììû ïğîèçîøëà îøèáêà!"); //îáğàáîòêà èñêëş÷åíèÿ
		System.out.println("Âîçìîæíî âû íåêîğğåêòíî ââåëè äàííûå!");}
		in.close();
	}

}
