import java.util.Scanner;
public class example32_08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ��������� ����� ������� �� ��� �� 4 � �� ������ �� 10"); //��������
		System.out.println("������� ����� ��� ��������:"); //������
		try {
		int number = in.nextInt(); //���� �����
		if ((number % 4)==0 && number>=10) { //�������� ��� ������� �� 4 and �� ������ 10
			System.out.println("���!����� ������� �� 4 � ��� �� ������ 10.");
				}
		else {System.out.println("���! ������� �� �����������");
		       }
		}
		catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");}
		in.close();
	}

}
