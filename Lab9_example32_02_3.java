import java.util.InputMismatchException;
import java.util.Scanner;
public class example32_02_3 {//���������� ��� �������
	public static void main(String[] args) {
		try {		
		        System.out.println("� ��������� ����������� ����� ��������� ���� byte ����������� �������, ��������� � ����������:");	
			    Scanner in=new Scanner(System.in); //������������� �����
				//���� � ���������� ������ �� n ����� �����		
				System.out.print("������� ����� �������: ");
				//���������� - �������������� ����� InputMismatchException
				// ���� ������ ������ ��� ����� � ������� ������� ������ ��� ����� �� byte (-127; 127)
				//����� ������� + �������� �������
				// ��� ����� ������� NegativeArraySizeException - ���� ������ ������������� ��������
				int size=in.nextInt();
				Byte[] array=new Byte[size]; //�������� �������
				System.out.println("������� ������ ����� ����� � ��������� �� -128 �� 127:");
				for (int i=0; i<array.length; ++i) {array[i]=in.nextByte();}  
				//��� ������ ����� �� ������� ��������� BYTE ������ �� ���������
				//�� �� ����� �� ������� :)
				int sum=0;
				for (int i=0; i<array.length; ++i) { sum=sum+array[i]; }
				 // ������ ������������ ���� Byte!
				if (sum>Byte.MAX_VALUE | sum<Byte.MIN_VALUE) throw new InputMismatchException ("������ ������������ ���� Byte!");
				else System.out.println("����� ��������� �������="+(byte) sum); 
		    }
		catch (InputMismatchException error) { System.out.println("�� ����������� ����� ������ �������!"+error); } //��������� ����������
		catch (NegativeArraySizeException error) { System.out.println("�� ����� ������������� ����� �������!"); } //��������� ����������
		 }
		}