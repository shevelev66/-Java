public class example32_01_8 { //������ 8
	public static int m(){
		try { //���� ������������ ����
				System.out.println("0");
				//��������� ���������� � ������
				throw new RuntimeException();
			}
		//���� ����, ������� ���������� � ������������ �������
		//� ����������� ��� ��� ����
		finally { System.out.println("1");}
		}
		public static void main(String[] args) {
			//����������� ���������� � ������ ���
			//��������� ��������� ������������ ������� Java
		  System.out.println(m());	//����� ������
			}
		}