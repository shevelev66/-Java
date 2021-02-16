public class example32_01_2 {// ПРИМЕР 2 РАЗДЕЛ 1 class Rec2
	public static void m(int x) {
		if ( (2*x+1) <20) {m(2*x+1); }
		System.out.println("x="+x);
		}
	public static void main(String[] args) {
		System.out.println("Для заданного параметра x вывести последовательность значений элементов числового ряда В ОБРАТНОМ ПОРЯДКЕ в соответствии с требованиями:\n"+
				"– очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);\n"+
				"– 0 ≤ x < 20.");
		m(1);
	}
}
