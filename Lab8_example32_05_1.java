class Node051 { // �������� ��������
public int value;
public Node051 next;
Node051(int value, Node051 next) { // �����������
this.value = value;
this.next = next;
 }
}
//������� ����� ����������� � ������
public class example32_05_1 { //class DSD_create ������ 2 ������� 2 ���������
	public static void main(String[] args) {
		 // �������� 1-�� ����, ������� ���������� �������� � �������, � ������� ������
		Node051 head=new Node051(0, null);
		Node051 tail=head;
		// ���������� ��������� � ������������ ������
		for (int i = 0; i <9; i++) {
		tail.next=new Node051(i+1, null);
		tail=tail.next; // ��������� �� ��������� ������� ������������
		} // ��� ��������� �� ����� �����
		// ����� ��������� �� �����
		Node051 ref = head; // ref � ������� ���������� ��� �������� ����
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}
	}
}
