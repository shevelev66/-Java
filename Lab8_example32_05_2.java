class Node052 { // �������� ��������
public int value;
public Node052 next;
Node052(int value, Node052 next) { // �����������
this.value = value;
this.next = next;
 }
}
//������� ����� ����������� ������
public class example32_05_2 {//class DSD_create ������ 2 ������2 ���������
	public static void main(String[] args) {
		 // ���������� ��������� � ������������ ������ (����������� � ������)
		Node052 head=null; // ��������� �������� ������ �� ������
		for (int i =9; i>=0; i--) { head=new Node052(i, head);
		} // ����� ��������� �� �����
		Node052 ref = head;
		while (ref != null) {
		System.out.print(" " + ref.value); ref = ref.next;
		}
   }
}
