public class example32_01_5 { //������ 5
	public static void main(String[] args) {
		try { //���� ������������ ����
					System.out.println("0");
					//��������� ����������
					throw new RuntimeException("������");
			} 
		//������ ���������� �� ���������� ����������,�.�. �� ������������� ������
		catch (NullPointerException e) { System.out.println("1" ); } //���������� ����������
		            //��������� ���������� ������� ������������ ������� Java
					//��������� ����� ����������� ��������� �� �����
		            System.out.println("2");
					}
}
