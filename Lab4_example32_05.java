import java.util.Random; //��������� ��������� �����
public class example32_05 {
	public static void main(String[] args) {
		System.out.println("��������� ������� ��������� ������, ��������� ���������� �������, � �� ��� ��������� ������������ ����� � ��������"); 
try {		
		int [][] array = new int [3][5];
		int [][] Tarray=new int [5][3]; //��������������� ������, �.�. ������� �� ����������
		Random rnd=new Random();
		int i ;		// ���������� ������ �����, ����������� ��� ������� ���������� �����
		int j ; // ���������� ������ �����, ����������� ��� ������� ���������� ������� (�������� � ������)
		System.out.println("---------------------------------------------------------------");
		//���������� ������� ���������� ������� �� 0 �� 200
		System.out.println("�������� ������ (������� 3 x 5), ����������� ���������� ������� �� 0 �� 200: ");
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {array[i][j]=rnd.nextInt(200); }
			   }
		//����� �������
		for (i = 0 ; i <array.length; ++i) {
			for (j=0; j<array[i].length; ++j) {System.out.printf("%5d", array[i][j]); }
			System.out.println(); 
        	}
		System.out.println("---------------------------------------------------------------");
		//������������
		for (i=0; i<array.length; i++) {
			for (j=0; j<array[i].length; j++) {
				Tarray[j][i]=array[i][j];
			}
		}
		//����� �������
		System.out.println("������ (������� 5 x 3) ����� ������������ ����� � ��������: ");
				for (i = 0 ; i <Tarray.length; ++i) {
					for (j=0; j<Tarray[i].length; ++j) {System.out.printf("%5d", Tarray[i][j]); }
					System.out.println(); 
		        	}
}		
		catch (Exception error) {
		    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
			   }
	}
}