import java.util.Scanner;
public class example32_06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ��������� ����� �� ��������� 3"); //��������
		System.out.println("������� ����� ����� ��� ��������:"); //������
		try {
		int number = in.nextInt(); //���� �����
		if ((number % 3)==0) { //�������� ���������
			System.out.println("���!��������� ����� ������� �� 3");
			System.out.printf(" %d /3= %.0f \n", number, number/3.0);
			}
		else {System.out.println("���!�������� ����� �� ������� �� 3");
		      System.out.printf(" %d /3= %.2f \n", number, number/3.0);}
		//


		}
		//
		catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");}
		in.close();
	}

}
