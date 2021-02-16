import java.util.InputMismatchException;
import java.util.Scanner;
public class example32_02_1 {//���������� ��� �������
	public static void main(String[] args) {
		try {		
			    System.out.println("� ��������� ����������� ������� �������� ����� ������������� ��������� ����������� ������� (��� ��������� int), ��������� � ����������:");
			    Scanner in=new Scanner(System.in); //������������� �����
			    //���� � ���������� ������ �� n ����� �����		
				System.out.print("������� ����� �������: ");
				//���������� - �������������� ����� InputMismatchException
				// ���� ������ ������ ��� ����� � ������� ������� ������ int
				//����� ������� + �������� �������
				// ��� ����� ������� NegativeArraySizeException - ���� ������ ������������� ��������
				int size=in.nextInt();
				int[] array=new int[size]; //�������� �������
				System.out.println("������� ������ ����� �����:");
				for (int i=0; i<array.length; ++i) {array[i]=in.nextInt();}  
				//������ �������� �������� �� ������������� ���������
				System.out.print("������������� �������� �������:");
				int n=0; //����� ������������� ���������
				int sum=0; //����� ������������� ���������
				for (int i=0; i<array.length; ++i) {
		        	if (array[i]>0) { 
		        		System.out.print("["+i+"]="+array[i]+" ");
		        		sum=sum+array[i];
		        		n++; }
				                 }
				//��� ���������� ������������� ����� ���������������� NaN=sum/n=0/0 - ���������� �� �����
				// ������� �������� ��� :)
				if (n==0) throw new ArithmeticException ("������� �� ����!");
				else {double midle=(double) sum/n;  System.out.printf("������� �������� =%.2f ", midle);} 
		     }
		catch (InputMismatchException error) { System.out.println("�� ����������� ����� ������ �������!"); } //��������� ����������
		catch (ArithmeticException error) { System.out.println("� ������� ��� ������������� �����!"); } //��������� ����������
		catch (NegativeArraySizeException error) { System.out.println("�� ����� ������������� ����� �������!"); } //��������� ����������
		 }
		}	