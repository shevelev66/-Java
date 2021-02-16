public class example32_01_3 {//ПРИМЕР 3 РАЗДЕЛ 1 class Rec3
	private static int step=0; //закрытое поле шага
	public static void m(int x) { //метод с рекурсией
	space();
	System.out.println(""+x+"-> "); step++;
	if ((2*x+1) <20) {m(2*x+1);}
	step--;
	space(); 
	System.out.println(""+x+ " <-");
	}
	public static void space() { 
		for (int i = 0; i < step; i++) {System.out.print(" ");}
		}
	public static void main(String[] args) {
	  System.out.println("Вывод последовательности (перед вхождением в рекурсивный вызов и после него) значений элементов числового ряда в соответствии с требованиями:\n"+
				"– очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);\n"+
				"– 0 ≤ x < 20.");
      m(1);	
	}
}