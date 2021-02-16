import java.util.Random;
import java.util.Scanner;
class SymText {
//����� � 2-�� ������
	char SymPole; // ���������� ����
	String TextPole; // �������� ����
	//����� ����������� ����� ����
	void SetSymText(char ch) {
		this.SymPole=ch;
		System.out.println("���������� ����(��������)="+SymPole);
	}
	//����� ����������� ��������� ����
	void SetSymText(String txt) {
			this.TextPole=txt;
			System.out.println("��������� ����(��������)="+TextPole);
		}
	//����� � ���������� ��������
	void SetSymText(char charr[]) {
		if (charr.length==1) { SetSymText(charr[0]);}
		else { SetSymText(String.valueOf(charr));}
		System.out.println("������(������) ��������� ������� ��� ������ ��������");
	}
}
public class example32_01 {
	public static void main(String[] args) {
try {
	System.out.println("��������� � �������, � ������� ���� ��� ����: ���������� � ���������.\n"
			+"� ������ ���� ������������� ����� ��� ������������ �������� �����.\n"
			+"����� ����� ��������� � ���������� ����������-������������� ����������� ����.\n"
			+"����� ����� ��������� � ��������� ����������-������������� ���������� ����.\n"
			+"����� ����� ��������� � ���������� ��������-������������� ����������� ����, ���� 1 �������\n"
			+"������������� ���������� ����, ���� >1 ��������");
		Scanner in = new Scanner(System.in); //������ ��� �������� � �����
		Scanner num = new Scanner(System.in); //������ ��� �����
		Random rnd = new Random(); // Random ��� "����������" ���������� ����������� �������
		SymText obj=new SymText(); //������ ������
        System.out.println("-----------------------------------------------------");
		System.out.println("������� ������ ��� ������:");
		String str=in.nextLine();//���� ������ ��� �������
		if (str.length()>1) {obj.SetSymText(str);}
		else {obj.SetSymText(str.charAt(0));}
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ������ ����������� �������:");
		int size=num.nextInt();
		char array[]=new char[size];
		System.out.println("���������� ������ ������ ����������� ��������� ����� � ��������� �� A �� z:");
		for (int i=0; i<array.length; ++i) {array[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(array[i]+" ");}
		System.out.println();
		obj.SetSymText(array);
		in.close();
		num.close();
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}
}
