class Node04 { //  Ћј—— Ц —“–” “”–ј ЁЋ≈ћ≈Ќ“ј —ѕ»— ј
public int value; // значение
public Node04 next; // поле Ц ссылка (указатель) на следующий узел
Node04(int value, Node04 next) { // конструктор класса
this.value = value;
this.next = next;
  }
}
//√Ћј¬Ќџ…  Ћј——
public class example32_04 { //class DSD_manual пример 1 раздел 2 методички
	public static void main(String[] args) { 
		// создание несв€занных узлов с помощью конструктора
		Node04 node0 = new Node04(0, null); // 0-й узел Ц будет головой в списке
		Node04 node1 = new Node04(1, null);
		Node04 node2 = new Node04(2, null);
		Node04 node3 = new Node04(3, null); // последний узел Ц будет хвостом в списке
		// св€зывание узлов в список с помощью ссылок
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		// вывод списка с использованием вспомогательной переменной ref,
		// соответствующей текущему значению ссылки при прохождении по списку
		Node04 ref = node0; // дл€ перемещени€ по списку достаточно помнить голову
		while (ref != null) {
		System.out.print(" " + ref.value); ref = ref.next;
		}
	}
}