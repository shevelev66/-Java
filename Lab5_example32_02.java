import java.util.Scanner;
class SymbolTable {
//�����, ���������� ���������� ���� � ����� ������ ������� �����
 char FirstPoleForSymbol;	//���������� ���� 1
 char SecondPoleForSymbol;	//���������� ���� 2
 public void ShowSymbolTable() // ����� ������ ������� �������
 {
	 System.out.print("������� ������� ������� ����� ��������� ������: ");
	 //� ����������� �� �������� ����� ������� ��������� � ������� ����������� ��� ��������
	 if ((int)FirstPoleForSymbol<(int)SecondPoleForSymbol) for (int i=(int) FirstPoleForSymbol; i<=SecondPoleForSymbol;++i) {System.out.print(" "+(char) i);}
	 else for (int i=(int) FirstPoleForSymbol; i>=SecondPoleForSymbol;--i) {System.out.print(" "+(char) i);}
	 System.out.println();
 }
} 
public class example32_02 {

	public static void main(String[] args) {
try {		
		SymbolTable sytab = new SymbolTable();
		Scanner in = new Scanner(System.in);
		System.out.println("��������� � �������, � �������� ���� ��� ���������� ���� � �����.\n"+"�� ���������� ���������, � � ���� ��� ����������.\n"+"��� ������ ����� ������� � ���������� ���� ��� ������� �� ������� �������, ������� ��������� ������ ���������, \n"+"����������� ���������� ����� ������� (�� �������� ���������� �����).");
		System.out.println("---------------------------------------------------------------");
		System.out.println("������� 1 ������ ��� ������� �������:");
		sytab.FirstPoleForSymbol = in.next().charAt(0); //�������� ������ ������ �������� �������������
		System.out.println("������� 2 ������ ��� ������� �������:");
		sytab.SecondPoleForSymbol = in.next().charAt(0); //�������� ������ ������ �������� �������������
		sytab.ShowSymbolTable();
        in.close();
}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	}
}
}	
