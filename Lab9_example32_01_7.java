public class example32_01_7 { //������ 7
	public static void main(String[] args) {
		try {//���� ������������ ����
					System.out.println("0");
					//��������� ����������
					throw new NullPointerException("������");
			} 
		//���������� ���������� NullPointerException
		catch (NullPointerException e) {
					System.out.println("1" ); //���������� ��� ��������� ����������
					//� ����������� ������������ ��� ���� ����������
					throw new ArithmeticException(); //������������ �� � ����� ������������ ����
					}
		// �� ArithmeticException �� ������������, �.�. ������������ �� � ����� ������������ ����
		catch (ArithmeticException e) { System.out.println("2" ); //���������� ��� ����� try
					}
		           //ArithmeticException ������������ ������������ ������� Java
		           //���� ��������� ����� ��������� ���������� �� ����������
					System.out.println("3");

			}

}	