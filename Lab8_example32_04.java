class Node04 { // ����� � ��������� �������� ������
public int value; // ��������
public Node04 next; // ���� � ������ (���������) �� ��������� ����
Node04(int value, Node04 next) { // ����������� ������
this.value = value;
this.next = next;
  }
}
//������� �����
public class example32_04 { //class DSD_manual ������ 1 ������ 2 ���������
	public static void main(String[] args) { 
		// �������� ����������� ����� � ������� ������������
		Node04 node0 = new Node04(0, null); // 0-� ���� � ����� ������� � ������
		Node04 node1 = new Node04(1, null);
		Node04 node2 = new Node04(2, null);
		Node04 node3 = new Node04(3, null); // ��������� ���� � ����� ������� � ������
		// ���������� ����� � ������ � ������� ������
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		// ����� ������ � �������������� ��������������� ���������� ref,
		// ��������������� �������� �������� ������ ��� ����������� �� ������
		Node04 ref = node0; // ��� ����������� �� ������ ���������� ������� ������
		while (ref != null) {
		System.out.print(" " + ref.value); ref = ref.next;
		}
	}
}