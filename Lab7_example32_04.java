import java.util.Scanner;
class First {//����������
	public char CharPole; //�������� ���������� ����
	//����������� � ������ �������
	First (First obj) {
		CharPole=obj.CharPole;
		System.out.print("������ ����� ����� ����������� � ������ �������: "+CharPole+"\n");
	}
	//����������� � ����������
	First (char ch) {
		CharPole=ch;
		System.out.print("������ ����� ����� ����������� � ����������: "+CharPole+"\n");
	}
}
class Second extends First {//�������� ����������� 
	public String StrPole; //�������� ��������� ����
	//����������� � ������ �������
	Second (Second obj) {
	super(obj);
	StrPole=obj.StrPole;
	System.out.print("����� ����� ����� ����������� � ������ �������: "+StrPole+"\n");
	}
	//����������� � �����������
	Second (char cha, String Str) {
	super(cha);
	StrPole=Str;
	System.out.print("����� ����� ����� ����������� � ����������: "+StrPole+"\n");
	}
}
class Third extends Second {//�������� ���������
	public int InPole; //�������� ������������� ����
	//����������� � ������ �������
	Third (Third obj) {
		super(obj);
		InPole=obj.InPole;
		System.out.print("����� ������ ����� ����������� � ������ �������: "+InPole+"\n");
	}
	//����������� � �����������
	Third (char chb, String StrA, int n) {
	super(chb,StrA);
	InPole=n;
	System.out.print("����� ������ ����� ����������� � ����������: "+InPole+"\n");
	}
}
public class example32_04 { 
	public static void main(String[] args) {
try {	
	 Scanner in = new Scanner(System.in); //������� ��� �������
	 Scanner numb = new Scanner(System.in); //������� ��� �����
	 Scanner st = new Scanner(System.in); //������� ��� ������
	 System.out.println("*************�������� ������������ � �����������:******************");
	 System.out.println("������� ������ ��� �������� ������������ � ����������:");
	 char c=in.next().charAt(0);
	 First A=new First(c); //����������� � ��������
	 System.out.println("������ ������ �����������: "+A.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("������� ����� ��� �������� ������������ � ����������:");
	 String Str=st.nextLine();
	 Second B=new Second(c,Str); //����������� � �������
	 System.out.println("������ ������ ���������: "+B.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("������� ����� ��� �������� ������������ � ����������:");
	 int num=numb.nextInt();
	 Third C=new Third(c, Str, num); //����������� � ������
	 System.out.println("������ ������ ���������: "+C.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 System.out.println("*************�������� ������������ � ������:******************");
	 First A1=new First(A); //����������� � ������ �������
	 System.out.println("������� ����� ������� �����������: "+A1.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 Second B1=new Second(B); //����������� � ������ �������
	 System.out.println("������� ����� ������� ���������: "+B1.getClass().getName());
	 System.out.println("-----------------------------------------------------");
	 Third C1=new Third(C); //����������� � ������ �������
	 System.out.println("������� ����� ������� ���������: "+C1.getClass().getName());
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
		 }
	}

}
