import java.util.Scanner;
class IntPoleTwo {
//�����, � �������� 2 ������������� ����
 int FirstPole;	//1-� ������������� ����
 int SecondPole;	//2-� ������������� ����
 //������������
 IntPoleTwo() { //��� ������� ���������
	 System.out.println("��������������� ������� � 2 �������������� ������ ��� ����������:");
	 FirstPole=5;
	 SecondPole=10;
	 System.out.println("1-� ����="+FirstPole+";"+" 2-� ����="+SecondPole+";"+" -������ � ������������");
	 System.out.println("-----------------------------------------------------");
 }
 IntPoleTwo(int first) { //� �������� ���������
	 System.out.println("��������������� ������� � 2 �������������� ������ � ��������� 1 ���������:");
	 FirstPole=first;
	 SecondPole=10;
	 System.out.println("1-� ����="+FirstPole+";"+" -������ ����� ��������"+" 2-� ����="+SecondPole+";"+" -������ � ������������");
	 System.out.println("-----------------------------------------------------"); 
 } 
 IntPoleTwo(int first, int second) { //� �������� 2-� ����������
	 System.out.println("��������������� ������� � 2 �������������� ������ � ��������� 2-� ����������:");
	 FirstPole=first;
	 SecondPole=second;
	 System.out.println("1-� ����="+FirstPole+";"+" 2-� ����="+SecondPole+";"+" -������ ����� ��������");
	 System.out.println("-----------------------------------------------------"); 
 } 
} 
public class example32_03 {
	public static void main(String[] args) {
try {		
	Scanner in = new Scanner(System.in);	
	System.out.println("��������� � �������, � �������� ���� ��� ������������� ����.\n"+"� ������ ������� ������������, ����������� ��������� ������� ��� �������� ����������,\n"+"� ��������� ������ ��������� � � ��������� ���� ����������.");
	System.out.println("-----------------------------------------------------");
	IntPoleTwo ipole=new IntPoleTwo();	
	System.out.println("��� ������������ ������ ���������");
	System.out.println("������� ����� �����:");
	int number=in.nextInt(); //���� ������ ����� ��� ��������� ������������
	IntPoleTwo ipole1=new IntPoleTwo(number);
	System.out.println("��� ������������ ������ ���������");
	System.out.println("������� 1-� ����� �����:");
	int num1=in.nextInt(); //���� ������ ����� ��� ��������� ������������
	System.out.println("������� 2-� ����� �����:");
	int num2=in.nextInt(); //���� ������ ����� ��� ��������� ������������
	IntPoleTwo ipole2=new IntPoleTwo(num1, num2);
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
