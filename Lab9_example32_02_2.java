import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class example32_02_2 {//���������� ��� �������
	public static void main(String[] args) {
		try {		
			    System.out.println("� ��������� �� ������� ��������� ������� � �������, �������� � ����������:");
				Scanner in=new Scanner(System.in); //������������� �����
				System.out.println("��������� ������� ������� (��������� ������) � ��������� ���������� �������:");
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
				System.out.println("������� ����� �������, ������� ����� ������� �� ������� (��������� � ������� ���������� � 1):");
				// ��� ����� ����� ������ ����������� ������� ArrayIndexOutOfBoundsException
				//��� ����� ������ ��� ����� � ������� ������� InputMismatchException
				int n=in.nextInt();
				System.out.print(n+"-� ������� �������:");
				//����� �������
				for (i = 0 ; i <array.length; ++i) { System.out.printf("%5d", array[i][n-1]);	}
		    }
		catch (InputMismatchException error) { System.out.println("�� ����������� ����� ������ (������ ����)!"); } //��������� ����������
		catch (ArrayIndexOutOfBoundsException error) { System.out.println("� ������� ��� ������� � ����� �������! ���!"); } //��������� ����������
			}

		}