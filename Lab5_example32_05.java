import java.util.Scanner;
class IntNum {
//�����, ���������� �������� ������������� ����
 private int PoleForInt;	//�������� ������������� ����
 //�������� ����� ��� ��������� ����
public void SetIntPole(int number)//�������� ����� � ���������� ��������� ��������� �������� ����
 {
	 if (number>100) {this.PoleForInt=100;}
	 else {this.PoleForInt=number;}
 }
public void SetIntPole()//�������� ����� ��� ���������
 {
	SetIntPole(0); //�������� ����� � ����������=0
 }
//����������� � ����������
IntNum(int number) {
	SetIntPole(number);//�� ������� ����������� �������� ��� ����������� �����
}
//����������� ��� ���������
IntNum() {
	SetIntPole();	//�� ������� ����������� �������� ��� ����������� �����
}
public void CheckPole()//�������� ��������� ����
{
	System.out.println("�������� ��������� �������������� ����= "+PoleForInt);
}
} 
public class example32_05 {
public static void main(String[] args) {
try {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� � �������, � �������� ���� �������� ������������� ����.\n"
		+"���� ����� ���������� ��� ���������, �� ���� �������� ��������=0.\n"
		+"���� ����� ���������� � ������������� ����������, �� ��� �������� ������������� ����.\n"
		+"�� ���� ���������� ���������� ������ �������� >100, �� ��������� ���� ������������� ����� 100.\n"
		+"� ������ ���� �����������, ������� �������� �� ���� �� �������� ��� � �����.");
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������������ ��� ���������:");
		IntNum Npole=new IntNum(); //����������� ��� ���������
		Npole.CheckPole(); //��������
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������������ c ����������:");
		System.out.println("������� ����� ����� ��� �������� ������������:");
		int number=in.nextInt(); //���� ������ ����� ��� ��������� 
		IntNum Npole1=new IntNum(number);//����������� � ����������
		Npole1.CheckPole(); //��������
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������ ������ ��� ���������:");
		Npole.SetIntPole();
		Npole.CheckPole(); //��������
		System.out.println("-----------------------------------------------------");
		System.out.println("������������ ������ ������ c ����������:");
		System.out.println("������� ����� ����� ��� �������� ������:");
		number=in.nextInt(); //���� ������ ����� ��� ��������� 
		Npole.SetIntPole(number); //����� ������ � ����������
		Npole.CheckPole(); //��������
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
		}		
	}

}
