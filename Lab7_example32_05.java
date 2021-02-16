class SuperPrivateTxTPole { //����������
	protected  String TxtPole; //�������� ��������� ����
	SuperPrivateTxTPole (String txt) { //����������� � ��������� ����������
		TxtPole=txt;
	}
	void Show () {//����� ���������� �������� ������ � �������� ����
	System.out.println("-----------------------------------------------------");	
	System.out.println("��� ������: "+this.getClass().getSimpleName());
	System.out.println("�������� ��������� ����:"+this.TxtPole);
	}
}
class FirstSubPrivetePole extends SuperPrivateTxTPole {//������ ��������
	protected int IntPole; //�������� ������������� ����
	FirstSubPrivetePole (String text, int n) { //����������� ��������� � �����������
		super(text);
		IntPole=n;
	}
	void Show () { //��������������� ������
		super.Show();
		System.out.println("�������� ������������� ����:"+this.IntPole);
	}
}
class SecondSubPrivatePole extends SuperPrivateTxTPole {//������ ��������
	protected char CharPole; //�������� ���������� ����
	SecondSubPrivatePole (String text, char ch) { //����������� ��������� � �����������
		super(text);
		CharPole=ch;
	}
	void Show () { //��������������� ������
		super.Show();
		System.out.println("�������� ���������� ����:"+this.CharPole);
	}
}
public class example32_05 {

	public static void main(String[] args) {
try {		
	    SuperPrivateTxTPole superobj=new SuperPrivateTxTPole("������ ����� ����������� �����������");
		superobj.Show(); //����� �����������
		FirstSubPrivetePole subobj1=new FirstSubPrivetePole("������ ����� ����������� 1 ���������",10);
		subobj1.Show(); //����� ��������� 1- �������������
		SecondSubPrivatePole subobj2=new SecondSubPrivatePole("������ ����� ���������� 2 ���������", 'A');
		subobj2.Show(); //����� ��������� 2- �������������
		System.out.println("-----------------------------------------------------");
		System.out.println("������ ������� �������� �����������, ������� ��������� �� ������ ���������:");
		superobj=subobj1; //������ ������� ����������� �� ������ ��������� 1
		superobj.Show(); //�������� ������
		superobj=subobj2; //������ ������� ����������� �� ������ ��������� 2
		superobj.Show(); //�������� ������		
    }
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
		 }
	}

}
