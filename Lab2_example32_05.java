import java.util.Scanner;
public class example32_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ��������� ����� ����� � ��������� �����"); //��������
		System.out.println("������� �����, � ������� �� ����� 4-� ��������, ��� �������� :"); //������
	try {
		double number = in.nextDouble(); //���� �����
		if (number<0) {number = Math.abs(number);} //���������� ����
		int r4 = (int) ((number % 10000)/1000); //��������� 4-�� �������
		System.out.printf("��������� ����� �������� %d ����� . \n", r4); //������
		}
		catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");}
		in.close();
	}

}
