import java.util.Random;
public class example32_06 {
  public static void main(String[] args) {
			System.out.println("��������� ������� � �������������� ��������� �������� ������, ��������� ���������� ������� \n"+"�� ���������� ������� ��������� ������ � �������, ��������� ����� ������. \n"+"������ ��������� ������ � ������ ���������� ������� ������������ � ������� ���������� ��������� �����.");
try {		
			int [][] array = new int [5][5]; //���������� �������
			Random rnd=new Random();
			int i ;		// ���������� ������ �����, ����������� ��� ������� ���������� �����
			int j ; // ���������� ������ �����, ����������� ��� ������� ���������� ������� 
			System.out.println("---------------------------------------------------------------");
			//���������� ������� ���������� ������� �� 0 �� 200
			System.out.println("�������� ������ (������� 5 x 5), ����������� ���������� ������� �� 0 �� 200: ");
			for (i = 0 ; i <array.length; ++i) {
				for (j=0; j<array[i].length; ++j) {array[i][j]=rnd.nextInt(200); }
				   }
			//����� �������
			for (i = 0 ; i <array.length; ++i) {
				for (j=0; j<array[i].length; ++j) {System.out.printf("%5d", array[i][j]); }
				System.out.println(); 
	        	}
			System.out.println("---------------------------------------------------------------");
			int m=rnd.nextInt(5)+1; //������ ��������� ������ - random �� 0 �� 4 �������� 
			System.out.println("������ ��������� ������: "+m);
			int n=rnd.nextInt(5)+1;  // ������ ���������� ������� - random �� 0 �� 4 ��������
			System.out.println("������ ���������� �������: "+n);
			System.out.println("---------------------------------------------------------------");
			int [][] minor = new int [4][4]; //���������� ������� - ����� ��������
			int im; //������� ����� ������
			int jm; //������� �������� ������
			for (i = 0, im=0 ; i <array.length; ++i) {
				for (j=0, jm=0; j<array[i].length; ++j) {
					if (j!=n-1 & i!=m-1)  {minor[im][jm]=array[i][j]; ++jm; } //���������� ������ if ������� ������� & �������� ������
					}
				if (i!=m-1) { ++im;} //if ������� ������	
				   }
			//����� ������
			System.out.println("��������������� ������ (������� 4 x 4) - ����� �������� �������: ");
			for (im = 0 ; im <minor.length; ++im) {
				for (jm=0; jm<minor[im].length; ++jm) {System.out.printf("%5d", minor[im][jm]); }
				System.out.println(); 
	        	}
	}		
			catch (Exception error) {
			    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
				   }
		}
	}