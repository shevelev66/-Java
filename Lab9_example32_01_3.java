public class example32_01_3 { //������ 3
	public static void main(String[] args) {
		try {//���� ������������ ����
					System.out.println("0");
					//��������� ���������� RuntimeException
					throw new RuntimeException("������");
			}
		//��� ���������� ���������� ����� ������������ ���������� �������
		catch (NullPointerException e) { System.out.println("1" ); } //��������� ����������
		catch (RuntimeException e) { System.out.println("2" ); } //��������� ���������� RuntimeException
		catch (Exception e) { System.out.println("3" ); } //��������� ����������
		            //���������� ��������� ����� ��������� ����������
					System.out.println("4");
					}
}