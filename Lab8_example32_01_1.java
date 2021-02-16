public class example32_01_1 {//ПРИМЕР 1 РАЗДЕЛ 1 class Rec1
	public static void m(int x) { 
		System.out.println("x="+x); 
		if ( (2*x+1) <20) {m(2*x+1);
		}
	}	
	public static void main(String[] args) {
		System.out.println("Для заданного параметра x вывести последовательность значений элементов числового ряда в соответствии со следующими требованиями:\n"+
			"– очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);\n"+
			"– 0 ≤ x < 20.");
		m(1);	
	}

}
