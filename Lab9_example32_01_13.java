public class example32_01_13 {  //������ 13
	public static void main(String[] args) {
		try { //���� ������������ ����
					int l = args.length; System.out.println("������ �������= " + l);
					int h=10/l; //����������� ��������� ���������� ��� ������� �� 0
					args[l + 1] = "10"; //����������� ��������� � �������� � ��������������� ��������
			} 
		//��������� ���������� ��� ������� �� ����
		catch (ArithmeticException e) { System.out.println("������� �� ����"); }
		//��������� ���������� ��������� � �������� � ��������������� ��������
		catch (ArrayIndexOutOfBoundsException e) { System.out.println("������ �� ����������"); }
		  }
		}