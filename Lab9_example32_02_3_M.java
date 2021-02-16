import java.util.InputMismatchException;
import java.util.Scanner;
public class example32_02_3_M { //���������� � ��������
	public static int EnterSize() throws InputMismatchException, NegativeArraySizeException { //����� ����� ����� �������
	    Scanner in=new Scanner(System.in); //������������� �����
	    //���� � ���������� ������ �� n ����� �����		
		System.out.print("������� ����� �������: ");
		//���������� - �������������� ����� InputMismatchException
		// ���� ������ ������ ��� ����� � ������� ������� ������ int
		//����� ������� + �������� �������
		// ��� ����� ������� NegativeArraySizeException - ���� ������ ������������� ��������
		int size=in.nextInt();
		//���� ������ ������ ������������� ���������� ����������
		if (size<0) throw new NegativeArraySizeException();
		return size;
}
public static Byte [] EnterArr(Byte [] array) throws InputMismatchException {//����� ���������� ������� ����������
	Scanner in=new Scanner(System.in); //������������� �����
	System.out.println("������� ������ ����� ����� � ��������� �� -128 �� 127:");
	for (int i=0; i<array.length; ++i) {array[i]=in.nextByte();}
	return array;
}
public static void SumByte(Byte [] array) throws InputMismatchException {
	//��� ������ ����� �� ������� ��������� BYTE ������ �� ���������
	//�� �� ����� �� ������� :)
	int sum=0;
	for (int i=0; i<array.length; ++i) { sum=sum+array[i]; }
	if (sum>Byte.MAX_VALUE | sum<Byte.MIN_VALUE) throw new InputMismatchException ("������ ������������ ���� Byte!");
	else System.out.println("����� ��������� �������="+(byte) sum);
}
	public static void main(String[] args) {
try {		
	        System.out.println("� ��������� ����������� ����� ��������� ���� byte ����������� �������, ��������� � ����������:");	
		    Byte[] array=new Byte[EnterSize()]; //�������� ������� + ����� ����� �����
		    array=EnterArr(array); //����� ����� ���������
		    SumByte(array); //����� ������������ ���������
    }
	catch (InputMismatchException error) { System.out.println("�� ����������� ����� ������ �������!"+error); } //��������� ����������
	catch (NegativeArraySizeException error) { System.out.println("�� ����� ������������� ����� �������!"); } //��������� ����������
	 }
	}	