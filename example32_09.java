import java.util.Scanner;
public class example32_09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ��������� ����� �� ��������� � �������� �� 5 �� 10 ������������"); //��������
		System.out.println("������� ����� ��� ��������:"); //������
		try {
		float number = in.nextFloat(); //���� �����
		if (number >= 5 && number<=10) { //�������� ��� ������� �� 4 and �� ������ 10
			System.out.println("���!����� �������� � �������� �� 5 �� 10 ������������.");
				}
		else {System.out.println("���! ����� �� �������� � ������ ��������");
		       }
		}
		catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");}
		in.close();
	}

}
