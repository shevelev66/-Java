import java.util.Scanner;
public class example32_02 {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
System.out.println("��������� ��������� ����� �� ��� �������"); //��������
System.out.println("����� ��� ������� �� 5 � ������� ���������� 2, � ��� ������� �� 7 � ������� ���������� 1");
System.out.println("������� ����� ��� ��������:"); //������
try {
int number = in.nextInt(); //���� �����
if ((number % 5)==2) { //�������� ��� ������� �� 5
	System.out.println("1-� ������� ���������.��������� ����� ��� ������� �� 5 � ������� ���� 2.");
		}
else {System.out.println("1-� ������� �� ���������.��������� ����� ��� ������� �� 5 � ������� �� ���� 2. �������="+(number % 5));
       }
if ((number % 7)==1) { //��� ������� �� 7
	System.out.println("2-� ������� ���������.��������� ����� ��� ������� �� 7 � ������� ���� 1.");
	}
else {System.out.println("2-� ������� �� ���������.��������� ����� ��� ������� �� 7 � ������� �� ���� 1. �������="+(number % 7));
     }
}
catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
System.out.println("�������� �� ����������� ����� ������!");}
in.close();
	}

}
