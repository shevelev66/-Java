import java.util.Scanner;
class Node06 { // описание элемента
	public int value;
	public Node06 next;
	Node06(int value, Node06 next) { // конструктор
	this.value = value;
	this.next = next;
                               }
}
public class example32_06 {
	public static Node06 createHead(Node06 head) {//метод ввода с головы
		Node06 tail=head;
		// добавление элементов с наращиванием хвоста
		for (int i = 0; i <9; i++) {
		tail.next=new Node06(i+1, null);
		tail=tail.next; // указатель на созданный элемент запоминается
		} // как указатель на новый хвост	
		return head;
	}
    public static Node06 createTail(Node06 head) {//метод ввода с хвоста
    	 // добавление элементов с перемещением головы (наращивание с головы)
		//head=null; // начальное значение ссылки на голову
		for (int i=0; i<=9; i++) { head=new Node06(i, head); }
		return head;
		}
	public static String toString(Node06 head) {// метод вывода через цикл while
	 // вывод элементов на экран
	 Node06 ref = head; // ref – рабочая переменная для текущего узла
	 String str="";
	 while (ref != null) {
	  str=str+" " +String.valueOf(ref.value);
	  ref = ref.next;
	   			}
	 return str;
	}
	public static Node06 AddFirst(Node06 head, int newValue) {//метод добавления элемента в начало списка
	head=new Node06 (newValue, head);
	return head;
	}
    public static Node06 AddLast(Node06 head, int newValue) {//метод добавления элемента в конец списка
    Node06 newtail=new Node06(newValue,null);
   	Node06 ref=head;
	while (ref.next !=null) {ref=ref.next;}
	ref.next=newtail;
	return head;
	}
    public static Node06 Insert(Node06 head, int newValue, int num) {//метод вставки элемента с указанным номером
	Node06 newNode=new Node06(newValue, null);
	Node06 ref=head;
	int k=1;
	while (ref.next !=null && (k<num)) {
		ref=ref.next;
		k++;
	  }
	newNode.next=ref.next.next;
	ref.next=newNode;
	return head;
	}
    public static Node06 RemoveFirst(Node06 head) {//метод удаления элемента с головы списка
    head=head.next;
    return head;
	}
    public static Node06 RemoveLast(Node06 head) {//метод удаления элемента с хвоста списка
    	Node06 ref = head;
    	while (ref.next.next != null) { ref = ref.next;
    	}
    	ref.next=null;
    	return head;
	}
    public static Node06 Remove(Node06 head, int delValue) {//метод удаления элемента с указанным номером
    	Node06 ref = head; // создаем вспомогательную переменную
    	int k=1;	
    	// поиск положения узла, предшествующего удаляемому
    	while (ref.next!= null && (k<delValue )) { ref = ref.next;
    	k++;
    	} // переброска ссылки для исключения ненужного элемента из списка
    	ref.next=ref.next.next;
    	return head;
	}
    //рекурсивные методы
    public static Node06 createHeadRec(int i,Node06 head) {//метод ввода с головы
		if (i<9)  //ограничение в 9 элементов
		 {
		Node06 tail=head;	//в начале голова - хвост
		tail.next=new Node06(i+1, null); //хвосту делаем ссылку на новый элемент
		tail=tail.next; //новый элемент - новый хвост
		createHeadRec(i+1, tail); // чтобы приделать к новому хвосту
		}
		return head;
	}
   public static Node06 createTailRec(int i,Node06 head) {//метод ввода с хвоста
    	Node06 result=null;
    	if (i<9) {
    		head=new Node06(i+1, head); //создание новой головы с сылкой на старую голову
    		result=createTailRec(i+1, head); } // возврат головы с сылкой на след элемент
    	if (i==9) result=head; //выход головы на последний элемент последовательности (выход из рекурсий)
    	return result;
	}
	public static String toStringRec(Node06 head) {// метод вывода через рекурсию
	 // вывод элементов на экран
	 Node06 ref = head; // ref – рабочая переменная для текущего узла
	 String result="";
	 if (ref != null) { //пока не попался последний элемент
	  String str=" " +String.valueOf(ref.value);
	  result=str+toStringRec(ref.next); //переход по ссылке внутри списка (внутрь рекурсии)
	 	   			}
	 else return result; //ссылка нулевая (последний элемент) выход из рекурсии
	 
	 return result;
	}
public static void main(String[] args) {
		try {		
			Scanner in=new Scanner(System.in);	
			Node06 head1=new Node06(0, null); //для ввода с головы
			Node06 head2=null; //для ввода с ховоста
			head1=createHead(head1); //метод ввода с головы
			System.out.println("-------------Пункт а) методы используют цикл:---------------");
			System.out.println("Линейный односвязанный список ввод с головы:"+toString(head1));
			head2=createTail(head2); //метод ввода с хвоста
			System.out.println("Линейный односвязанный список ввод с хвоста:"+toString(head2));
			System.out.println("-------------------------------------------------------");
			System.out.println("Введите значение нового элемента:");
			int n=in.nextInt();
			System.out.println("-------------------------------------------------------");
		    head1=AddFirst(head1,n);
		    System.out.println("Метод добавления элемента в начало списка (головы):");
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Метод добавления элемента в конец списка:");
		    head1=AddLast(head1, n);
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Метод добавления элемента с заданным номером из списка");
		    System.out.println("Введите номер, куда вставить новый элемент:");
		    int num=in.nextInt();
		    head1=Insert(head1, n, num);
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Метод удаления элемента с начала списка(головы)");
		    head1=RemoveFirst(head1);
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Метод удаления элемента с конца списка(с хвоста)");
		    head1=RemoveLast(head1);
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Метод удаления элемента с заданным номером из списка");
		    System.out.println("Введите номер элемента, который надо удалить:");
		    num=in.nextInt();
		    head1=Remove(head1, num);
		    System.out.println("Линейный односвязанный список:"+toString(head1));
		    System.out.println("-------------Пункт б): методы используют рекурсию---------------");
		    Node06 Rechead1=new Node06(0, null); //для ввода с головы
			Node06 Rechead2=new Node06(0, null); //для ввода с ховоста
			System.out.println("Методы заполнения односвязного линейного списка и его вывода через рекурсию:");
			Rechead1=createHeadRec(0, Rechead1); //метод ввода с головы
			System.out.println("Линейный односвязанный список ввод с головы(рекурсией):"+toStringRec(Rechead1));
			Rechead2=createTailRec(0,Rechead2); //метод ввода с хвоста
			System.out.println("Линейный односвязанный список ввод с хвоста(рекурсией):"+toStringRec(Rechead2));
			System.out.println("-------------------------------------------------------");
			} 
catch (Exception error) { System.out.println("При обработке данных произошла ошибка!"); } //обработка исключения
			}
		}
