public class example32_01_1 { //������ 1
	public static void main(String[] args) {
		try {   //���� ������������ ����
				System.out.println("0");
				//��������� ����������
				throw new RuntimeException("������������� ������"); //������ ��������� RuntimeException � ����������
				} 
		catch (RuntimeException e) { // ���������� �����������
				System.out.println("1 "+ e); // ���������� ����������
				}
		       //���������� ��������� ����� ��������� ����������
				System.out.println("2"); 
			}
}
