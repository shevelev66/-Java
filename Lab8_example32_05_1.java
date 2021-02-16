class Node051 { // описание элемента
public int value;
public Node051 next;
Node051(int value, Node051 next) { // конструктор
this.value = value;
this.next = next;
 }
}
//главный класс Наращивание с хвоста
public class example32_05_1 { //class DSD_create пример 2 раздела 2 методички
	public static void main(String[] args) {
		 // создание 1-го узла, который изначально является и головой, и хвостом списка
		Node051 head=new Node051(0, null);
		Node051 tail=head;
		// добавление элементов с наращиванием хвоста
		for (int i = 0; i <9; i++) {
		tail.next=new Node051(i+1, null);
		tail=tail.next; // указатель на созданный элемент запоминается
		} // как указатель на новый хвост
		// вывод элементов на экран
		Node051 ref = head; // ref – рабочая переменная для текущего узла
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}
	}
}
