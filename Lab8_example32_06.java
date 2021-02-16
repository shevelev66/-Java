import java.util.Scanner;
class Node06 { // �������� ��������
	public int value;
	public Node06 next;
	Node06(int value, Node06 next) { // �����������
	this.value = value;
	this.next = next;
                               }
}
public class example32_06 {
	public static Node06 createHead(Node06 head) {//����� ����� � ������
		Node06 tail=head;
		// ���������� ��������� � ������������ ������
		for (int i = 0; i <9; i++) {
		tail.next=new Node06(i+1, null);
		tail=tail.next; // ��������� �� ��������� ������� ������������
		} // ��� ��������� �� ����� �����	
		return head;
	}
    public static Node06 createTail(Node06 head) {//����� ����� � ������
    	 // ���������� ��������� � ������������ ������ (����������� � ������)
		//head=null; // ��������� �������� ������ �� ������
		for (int i=0; i<=9; i++) { head=new Node06(i, head); }
		return head;
		}
	public static String toString(Node06 head) {// ����� ������ ����� ���� while
	 // ����� ��������� �� �����
	 Node06 ref = head; // ref � ������� ���������� ��� �������� ����
	 String str="";
	 while (ref != null) {
	  str=str+" " +String.valueOf(ref.value);
	  ref = ref.next;
	   			}
	 return str;
	}
	public static Node06 AddFirst(Node06 head, int newValue) {//����� ���������� �������� � ������ ������
	head=new Node06 (newValue, head);
	return head;
	}
    public static Node06 AddLast(Node06 head, int newValue) {//����� ���������� �������� � ����� ������
    Node06 newtail=new Node06(newValue,null);
   	Node06 ref=head;
	while (ref.next !=null) {ref=ref.next;}
	ref.next=newtail;
	return head;
	}
    public static Node06 Insert(Node06 head, int newValue, int num) {//����� ������� �������� � ��������� �������
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
    public static Node06 RemoveFirst(Node06 head) {//����� �������� �������� � ������ ������
    head=head.next;
    return head;
	}
    public static Node06 RemoveLast(Node06 head) {//����� �������� �������� � ������ ������
    	Node06 ref = head;
    	while (ref.next.next != null) { ref = ref.next;
    	}
    	ref.next=null;
    	return head;
	}
    public static Node06 Remove(Node06 head, int delValue) {//����� �������� �������� � ��������� �������
    	Node06 ref = head; // ������� ��������������� ����������
    	int k=1;	
    	// ����� ��������� ����, ��������������� ����������
    	while (ref.next!= null && (k<delValue )) { ref = ref.next;
    	k++;
    	} // ���������� ������ ��� ���������� ��������� �������� �� ������
    	ref.next=ref.next.next;
    	return head;
	}
    //����������� ������
    public static Node06 createHeadRec(int i,Node06 head) {//����� ����� � ������
		if (i<9)  //����������� � 9 ���������
		 {
		Node06 tail=head;	//� ������ ������ - �����
		tail.next=new Node06(i+1, null); //������ ������ ������ �� ����� �������
		tail=tail.next; //����� ������� - ����� �����
		createHeadRec(i+1, tail); // ����� ��������� � ������ ������
		}
		return head;
	}
   public static Node06 createTailRec(int i,Node06 head) {//����� ����� � ������
    	Node06 result=null;
    	if (i<9) {
    		head=new Node06(i+1, head); //�������� ����� ������ � ������ �� ������ ������
    		result=createTailRec(i+1, head); } // ������� ������ � ������ �� ���� �������
    	if (i==9) result=head; //����� ������ �� ��������� ������� ������������������ (����� �� ��������)
    	return result;
	}
	public static String toStringRec(Node06 head) {// ����� ������ ����� ��������
	 // ����� ��������� �� �����
	 Node06 ref = head; // ref � ������� ���������� ��� �������� ����
	 String result="";
	 if (ref != null) { //���� �� ������� ��������� �������
	  String str=" " +String.valueOf(ref.value);
	  result=str+toStringRec(ref.next); //������� �� ������ ������ ������ (������ ��������)
	 	   			}
	 else return result; //������ ������� (��������� �������) ����� �� ��������
	 
	 return result;
	}
public static void main(String[] args) {
		try {		
			Scanner in=new Scanner(System.in);	
			Node06 head1=new Node06(0, null); //��� ����� � ������
			Node06 head2=null; //��� ����� � �������
			head1=createHead(head1); //����� ����� � ������
			System.out.println("-------------����� �) ������ ���������� ����:---------------");
			System.out.println("�������� ������������� ������ ���� � ������:"+toString(head1));
			head2=createTail(head2); //����� ����� � ������
			System.out.println("�������� ������������� ������ ���� � ������:"+toString(head2));
			System.out.println("-------------------------------------------------------");
			System.out.println("������� �������� ������ ��������:");
			int n=in.nextInt();
			System.out.println("-------------------------------------------------------");
		    head1=AddFirst(head1,n);
		    System.out.println("����� ���������� �������� � ������ ������ (������):");
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("����� ���������� �������� � ����� ������:");
		    head1=AddLast(head1, n);
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("����� ���������� �������� � �������� ������� �� ������");
		    System.out.println("������� �����, ���� �������� ����� �������:");
		    int num=in.nextInt();
		    head1=Insert(head1, n, num);
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("����� �������� �������� � ������ ������(������)");
		    head1=RemoveFirst(head1);
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("����� �������� �������� � ����� ������(� ������)");
		    head1=RemoveLast(head1);
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------------------------------------------------");
		    System.out.println("����� �������� �������� � �������� ������� �� ������");
		    System.out.println("������� ����� ��������, ������� ���� �������:");
		    num=in.nextInt();
		    head1=Remove(head1, num);
		    System.out.println("�������� ������������� ������:"+toString(head1));
		    System.out.println("-------------����� �): ������ ���������� ��������---------------");
		    Node06 Rechead1=new Node06(0, null); //��� ����� � ������
			Node06 Rechead2=new Node06(0, null); //��� ����� � �������
			System.out.println("������ ���������� ������������ ��������� ������ � ��� ������ ����� ��������:");
			Rechead1=createHeadRec(0, Rechead1); //����� ����� � ������
			System.out.println("�������� ������������� ������ ���� � ������(���������):"+toStringRec(Rechead1));
			Rechead2=createTailRec(0,Rechead2); //����� ����� � ������
			System.out.println("�������� ������������� ������ ���� � ������(���������):"+toStringRec(Rechead2));
			System.out.println("-------------------------------------------------------");
			} 
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); } //��������� ����������
			}
		}
