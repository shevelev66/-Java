import java.util.Arrays; // ����� ��� ����������� ������ Arrays, ��� ���������� ��������� ������� �� �����������
import java.util.Scanner;
class MaxMin {
//�����, ���������� 2 �������� ������������� ����
 private int max;	//�������� ������������� ���� 1
 private int min;	//�������� ������������� ���� 2
 //�������� ����� ��� ��������� ����� � ����� �����������
 public void SetMaxMin(int one, int two)
 {
    int [] arr= {min, one, two, max}; //�������� ������ ���������
    Arrays.sort(arr); // ���������� ������� �� ����������� ��� ���������
    min=arr[0]; max=arr[3];
 }
//�������� ����� ��� ��������� ����� � ����� ����������
public void SetMaxMin(int one)
{
   SetMaxMin(one, 0);
}
//����������� � 2-� �����������
MaxMin (int one, int two) {
  SetMaxMin(one, two); //�� ������� ����������� �������� ��� ����������� �����
}
//����������� � 1-� ����������
MaxMin (int one) {
	SetMaxMin(one); //�� ������� ����������� �������� ��� ����������� �����
}
 public void ShowPole() //�������� ����� ��������� ������� � ���������� ����
 {
     System.out.println("� �������� ���� �������(��������): max="+max+ " min="+min);
 }
} 
public class example32_06 {
	public static void main(String[] args) {
try {		
		Scanner in = new Scanner(System.in);
		int num1, num2; //���� ����������
		System.out.println("��������� � �������, � ������� ���� ��� �������� ������������� ���� (max � min).\n"
				+"�������� ����� ������������� � ������� ��������� ������.\n"
				+"����� ����� ���������� � ����� ��� ����� �������������� �����������.\n"
				+"����� ������� �� �������� ������������� ���� max, � ����� ��������� �� �������� ������������� ���� min.");
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ��� �������� ������� MaxMin max=1 � min=-1 (����������� c �����������):");
		MaxMin Comper=new MaxMin(1,-1);
    	Comper.ShowPole();
metka1:{	while (true) {		//
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������ ������ � 2 �����������:");
		System.out.println("������� 1-� ����� ����� ��� ��������� ����� ������ MaxMin:");
		num1=in.nextInt();//���� 1-�� �����
		System.out.println("������� 2-� ����� ����� ��� ��������� ����� ������ MaxMin:");
		num2=in.nextInt();//���� 2-�� �����
		Comper.SetMaxMin(num1, num2);
		Comper.ShowPole();
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������ ������ � 1 ����������:");
		System.out.println("������� ����� ����� ��� ��������� ����� ������ MaxMin:");
		num1=in.nextInt();//���� 1-�� �����
		Comper.SetMaxMin(num1);
		Comper.ShowPole();
	metka:{	while (true) {
		System.out.println("����������? (�/� ��� y/n)"); 
			char answer=in.next().charAt(0); 
			switch (answer) {
			case 'y': break metka;
			case 'n': System.out.println("�� ��������!"); break metka1; 
			case '�': break metka;
			case '�': System.out.println("�� ��������!"); break metka1;
			default: System.out.println("������� ���������� �����!"); continue; 
			}
		   }
	     }
		}} //
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}
}
