public class example32_01_4 { //������ 4
	public static void main(String[] args) {
		try { //���� ������������ ����
					System.out.println("0");
					//��������� ���������� RuntimeException
					throw new RuntimeException("������");
			} 
		//����������� ���������� - �������� ���������� ���������� �������
		catch (NullPointerException e) { System.out.println("1" ); }
		//Exception ������ RuntimeException
		catch (Exception e) { System.out.println("2" ); } //�������� RuntimeException
		catch (Error e) { System.out.println("3" ); }
					System.out.println("4");
				}
}
