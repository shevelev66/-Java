public class example32_04 {
	public static void main(String[] args) {
		System.out.println("��������� ������� ��������� ������, ������� ������� � ���������� ���� ������������� ����������� � �������� 8 � 8 "); 
		try {		
				char [][] array = new char [8][8];
				//���������� �������
				for (int i = 0 ; i <array.length; ++i) {
					for (int j=0; j<array[i].length; ++j) {array[i][j]='*'; }
					   }
				//����� �������
				for (int i=0; i<array.length; ++i) {
					for (int j=0; j<=i; ++j) {System.out.print(array[i][j]);}
					System.out.println(); }
		}		
				catch (Exception error) {
				    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
					   }
			}
}