import java.util.Scanner;
public class example32_02 {
	public static int DectoBin(int n){ //����� �������� �� Dec � Bin ����� ��������
		if (n==0) {return 0;}
		return (n%2+10*DectoBin(n/2)); //���������� ������������������ 1 � 0
		}
public static void main(String[] args) {
try {		
			Scanner in=new Scanner(System.in);
			System.out.println("��������� ���������� �������� ������ �����, ���������� � ����������, � �������� ������� ��������� � �������������� ��������");
			System.out.println("������� ����� ��� �������� � 2-� ��:");	 
			int n=in.nextInt();
			System.out.printf("� �������� ������� ����� "+n+"= "+DectoBin(n));
		}	
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); } //��������� ����������
		}
}