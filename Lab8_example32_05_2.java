class Node052 { // описание элемента
public int value;
public Node052 next;
Node052(int value, Node052 next) { // конструктор
this.value = value;
this.next = next;
 }
}
//главный класс Ќаращивание головы
public class example32_05_2 {//class DSD_create пример 2 раздел2 методички
	public static void main(String[] args) {
		 // добавление элементов с перемещением головы (наращивание с головы)
		Node052 head=null; // начальное значение ссылки на голову
		for (int i =9; i>=0; i--) { head=new Node052(i, head);
		} // вывод элементов на экран
		Node052 ref = head;
		while (ref != null) {
		System.out.print(" " + ref.value); ref = ref.next;
		}
   }
}
