public class example32_03 {
	public static void main(String[] args) {
		System.out.println("��������� ������� ��������� ������, ������� ������� ������������� �� ���� 2 (10 x 20) "); 
try {		
		int [][] array = new int [10][20];
		int i ;		// ���������� ������ �����, ����������� ��� ������� ���������� �����
		int j ; // ���������� ������ �����, ����������� ��� ������� ���������� ������� (�������� � ������)
		//���������� �������
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {array[i][j]=2; }
			   }
		//����� �������
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {System.out.print(array[i][j]); }
			System.out.println();
        	}
}		
		catch (Exception error) {
		    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
			   }
	}
}