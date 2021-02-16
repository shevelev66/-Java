import java.util.Scanner;
class SuperA {//����������
	public int InPole; //�������� ������������� ����
	//����������� � ����������
	SuperA (int n) {
		InPole=n;
	}
	//����� � ����������
	void SetInPole (int m) {
		InPole=m;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "super:" +  
		" Class name: " + this.getClass().getSimpleName() +";"+ 
		" InPole=" + this.InPole+" -������������� ����";
		return ClassNameAndFieldValue ;
		}
}
class SubB extends SuperA {//�������� ����������� 
	public char CharPole; //�������� ���������� ����
	//����������� � �����������
	SubB (int n, char ch) {
	super(n);
	CharPole=ch;
	}
	//����� � �����������
	void SetInPole (int m, char cha) {
	super.SetInPole(m);
	CharPole=cha;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub:" +  
		" Class name: " + this.getClass().getSimpleName() + ";"+
		" InPole=" + this.InPole+" -������������� ����"+";"+
		" CharPole="+this.CharPole+" -���������� ����";
		return ClassNameAndFieldValue ;
		}
}
class SubC extends SubB {//�������� ���������
	public String StrPole; //�������� ��������� ����
	//����������� � �����������
	SubC (int n, char ch, String st) {
	super(n,ch);
	StrPole=st;
	}
	//����� � �����������
	void SetInPole (int m, char cha, String strin) {
	super.SetInPole(m, cha);
	StrPole=strin;
	}
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub sub:" +  
		" Class name: " + this.getClass().getSimpleName() + ";" +
		" InPole=" + this.InPole+" -������������� ����"+";"+
		" CharPole="+this.CharPole+" -���������� ����"+";"+
		" StrPole="+this.StrPole+" -��������� ����";
		return ClassNameAndFieldValue ;
		}
}
public class example32_03 {
	public static void main(String[] args) {
try {	
	 Scanner in = new Scanner(System.in); //������� ��� �������
	 Scanner numb = new Scanner(System.in); //������� ��� �����
	 Scanner st = new Scanner(System.in); //������� ��� ������
	 System.out.println("*************�������� ������������:******************");
	//����������� �����������
	SuperA objA=new SuperA (1);
	System.out.println(objA.toString());
	System.out.println("-----------------------------------------------------");
	//���������� ��������� �����������
	SubB objB=new SubB (2,'B');
	System.out.println(objB.toString());
	System.out.println("-----------------------------------------------------");
	//���������� ��������� ���������
	SubC objC=new SubC (3,'C',"������ �������������");
	System.out.println(objC.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("*************�������� �������:******************");
	System.out.println("������� ����� ��� �������� ������ � ������������� ����������:");
	int num=numb.nextInt();
	objA.SetInPole(num); //����� � ������������� ����������
	System.out.println(objA.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("������� ����� ��� �������� ������ � ������������� ����������  � ��������:");
	num=numb.nextInt();
	System.out.println("������� ������ ��� �������� ������ � ������������� ���������� � ��������:");
	char c=in.next().charAt(0);
	objB.SetInPole(num, c); //����� � ������������� ���������� � ��������
	System.out.println(objB.toString());
	System.out.println("-----------------------------------------------------");
	System.out.println("������� ����� ��� �������� ������ � ������������� ����������, �������� � �������:");
	num=numb.nextInt();
	System.out.println("������� ������ ��� �������� ������ � ������������� ����������, �������� � �������:");
	c=in.next().charAt(0);
	System.out.println("������� ����� ��� �������� ������ � ������������� ����������, �������� � �������:");
	String Str=st.nextLine();
	objC.SetInPole(num, c, Str);
	System.out.println(objC.toString());
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	 }	
	}
}
