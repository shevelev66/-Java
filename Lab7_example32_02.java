import java.util.Scanner;
class SuperTxtPole { //����������
	//�������� ��������� ����
	private String TxtPole;
	//����������� � 1 �������� ����������
	SuperTxtPole (String str) {
		this.TxtPole=str;
	}
	//����� ��� ���������� ���� ��� ���������
	void SetTxTPole () {
		this.TxtPole="��������� ������� ��� ���������";
	}
	//����� ��� ���������� ���� � ����������
	void SetTxTPole (String str1) {
		this.TxtPole=str1;
	}
	//����� ������������ ����� ������
	int getlength () {
		return this.TxtPole.length();
	}
	void showtxtpole () { //����� ��� �������� ��������� ����
		System.out.println("� �������� ��������� ����(��������): "+TxtPole);
	}
}
class SubTxtPole extends SuperTxtPole  { //��������
    public int IntPole; //�������� ������������� ����
	//����������� � 2 �����������
	SubTxtPole(int n, String str) {
		super(str);
		IntPole=n;
	}
	//����� ��� ���������
	void SetTxtPole () {
	super.SetTxTPole();
	this.IntPole=1;
	}
	//����� c ��������� ����������
	void SetTxtPole (String str2) {
	super.SetTxTPole(str2);
	this.IntPole=2;
		}
	//����� c ������������� ����������
	void SetTxtPole (int num) {
	super.SetTxTPole("����� � ������������� ���������� ���������");
	this.IntPole=num;
			}
	//����� c ��������� ���������� � ������������� ����������
	void SetTxtPole (String str2, int num) {
	super.SetTxTPole(str2);
	this.IntPole=num;
				}
	void showtxtpole () { //����� ��� �������� ��������� ����
		super.showtxtpole();
		System.out.println("� �������� ������������� ����(��������):"+IntPole);
	}
}
public class example32_02 {
	public static void main(String[] args) {
try {		
	 Scanner in = new Scanner(System.in); //������� ��� ������
	 Scanner numb = new Scanner(System.in); //������� ��� �����
	 System.out.println("*************�������� �����������:******************");	
	 SuperTxtPole superobj=new SuperTxtPole("������ ������������� �����������");
	 superobj.showtxtpole(); //�������� ������������ �����������
	 System.out.println("-----------------------------------------------------");
	 superobj.SetTxTPole(); //����� ��� ��������� �����������
	 superobj.showtxtpole(); //�������� ������ ��� ��������� �����������
	 System.out.println("-----------------------------------------------------");
	 superobj.SetTxTPole("������ ������� � ���������� � �����������"); //����� � ���������� �����������
	 superobj.showtxtpole(); //�������� ������ � ���������� �����������
	 System.out.println("-----------------------------------------------------");
	 System.out.println("����� ����������� ���������� ����� ��������� ������:"+superobj.getlength());
	  System.out.println("**************�������� ���������:********************");
	 SubTxtPole subobj=new SubTxtPole(10,"������ ������������� ���������");
	 subobj.showtxtpole(); //�������� ������������ ���������
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole(); //����� ��� ��������� ���������
	 subobj.showtxtpole(); // �������� ����� ��� ��������� ���������
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole("������ ������� � ���������� � ���������");//����� � ��������� ���������� ���������
	 subobj.showtxtpole(); //�������� ������ � ��������� ���������� ���������
	 System.out.println("-----------------------------------------------------");
	 subobj.SetTxtPole(101);//����� � ������������� ���������� ���������
	 subobj.showtxtpole();//�������� ������ � ������������� ���������� ���������
	 System.out.println("-----------------------------------------------------");
	 System.out.println("������� ������ ��� �������� ������ � ��������� � � ������������� ����������:");
	 String instr=in.nextLine();
	 System.out.println("������� ����� ��� �������� ������ � ��������� � � ������������� ����������:");
	 int num=numb.nextInt();
	 subobj.SetTxtPole(instr, num);//����� � ��������� � � ������������� ���������� ���������
	 subobj.showtxtpole();//�������� ������ � ��������� � � ������������� ����������
	 System.out.println("-----------------------------------------------------");
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	 }	 
	}
}
