import java.util.Scanner;
public class example32_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ��������� ����� �������� � 8-���� ������������� �����"); //��������
		System.out.println("������� ����� ��� �������� :"); //������
	try {
		int number = in.nextInt(); //���� �����
		if (number<0) {number = Math.abs(number);} //���������� ����
		String num8 = Integer.toOctalString(number); //������������� � 8-� �� � ���� ������
		int num_r = Integer.parseInt(num8); // �������������� ������ � �����, �� ����� �������������� ��� 10-� ��
		int r2 =((num_r % 100)/10); //��������� 2-�� �������
		System.out.println("��������� ����� � 8-���� �������: "+num8); //�����
		System.out.printf("��������� ����� �������� %d �������� 8-� ������� . \n", r2); //�����
		}
		catch (Exception error) {System.out.println("��� ������ ��������� ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");}
		in.close();
	}

}
