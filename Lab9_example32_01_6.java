public class example32_01_6 { //������ 6
	public static void main(String[] args) {
		try { //���� ������������ ����
					System.out.println("0");
					//��������� ���������� NullPointerException
					throw new NullPointerException("������");
			}
		catch (ArithmeticException e) { System.out.println("1" ); }
		//�������� ������� �����������
		//RuntimeException ������� Exception ���� ������ ������ ������
		catch (RuntimeException e) { System.out.println("3" ); } 
		catch (Exception e) { System.out.println("2" ); }
		           //���������� ��������� ����� ��������� ����������
					System.out.println("4");
					}
}
