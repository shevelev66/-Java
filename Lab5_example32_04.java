import java.util.Scanner;
class IntSymbol {
//�����, ���������� ���������� � ������������� ����
 char SymbolPole;	//���������� ���� 
 int IntPole;	//������������� ����
 //����������� � ����� ����������� int � char
IntSymbol (int num, char ch) { 
	IntPole=num;
	SymbolPole=ch;
	System.out.println("������������� ����="+IntPole+";"+" ���������� ����="+SymbolPole+";"+" -������ ����� ������� �����������");
}
//����������� � ���� ���������� double 
IntSymbol (double k) { 
	SymbolPole=(char) k; //��������� ����� ����� � �������������� � ������
	IntPole=(int) ((k-(int) k)*100); // ��������� ������� ����� �� ����� � �������������� � �����
	System.out.println("������������� ����="+IntPole+";"+" ���������� ����="+SymbolPole+";"+" -������ ����� ������� �����������");
}
}
public class example32_04 {
	public static void main(String[] args) {
try {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� � �������, � �������� ���� ���������� � ������������� ����.\n"+"� ������ ������� ������������, ����������� ��������� ������� � ��������� 2 ����������(int � char),\n"+"� ��������� ������ ��������� (double).");
		System.out.println("-----------------------------------------------------");	
		System.out.println("��� ������������ ������ ���������");
		System.out.println("������� ����� �����:");
		int number=in.nextInt(); //���� ������ ����� ��� ��������� ������������
		System.out.println("������� ������:");
		char cha = in.next().charAt(0); //�������� ������ ������ �������� �������������
		IntSymbol ipole=new IntSymbol(number, cha); //����������� � 2 �����������
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ������������ �����:");
		double dk=in.nextDouble();
		IntSymbol ipole1=new IntSymbol(dk);
        in.close();
   }
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
