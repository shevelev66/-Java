import java.util.Scanner;
class Symbol {
//�����, ���������� �������� ���������� ����
 private char PoleForSymbol;	//�������� ���������� ����
 //�������� ������ ��� ��������� ����
 public void SetSymbol(char symbol)//������ �������� ����� ��������� ��������� �������� ����
 {
     this.PoleForSymbol = symbol;
 }
 public int KodSymbol()//������ �������� ����� ���������� ����������� ��� �������
 {
     return (int)  this.PoleForSymbol;
 }
 public void ShowSymbol�ode() //������ �������� ����� ��������� ������� � ���������� ���� ������ (�������� ����) � ��� ���.
 {
     System.out.println("� �������� ���� �������: "+ PoleForSymbol + "  � ��� ����� ������� "+KodSymbol());
 }
} 
public class example32_01 {

	public static void main(String[] args) {
try {		
		Symbol pole = new Symbol();
		Scanner in = new Scanner(System.in);
		System.out.println("��������� � �������, � ������� ���� �������� ���������� ���� � ��� �������� ������.\n"+"���� �� ������� ��������� ��������� �������� ����.\n"+"������ ����� ��� ������ ���������� ����������� ��� �������.\n"+"������ ����� ��������� ������� � ���������� ���� ������ (�������� ����) � ��� ���.");
		System.out.println("---------------------------------------------------------------");
		System.out.println("������� 1 ������ ��� ������������ ������ ���������:");
		char text = in.next().charAt(0); //�������� ������ ������ �������� �������������
		pole.SetSymbol(text);
        pole.KodSymbol();
        pole.ShowSymbol�ode();
        in.close();
}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	}
}
}	


