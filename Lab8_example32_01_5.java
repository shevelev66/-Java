import java.util.Scanner;
public class example32_01_5 {//������ 5 ������ 1 ������������������ ���������
	//��������� ����������� �������
	private static int step=0; //���� ���� - ������� ��������
	public static int f(int n) { //����� ���������� ����� ��������� �� ��������� ������ � ������������������.
		int result=0;
		space();
		System.out.println(""+n+"->"); step++; 
		if (n==0){step--; return 0;}
		else if (n==1){step--; return 1; }
		else {result=f(n-1)+f(n-2); }
		step--;
		space(); 
		System.out.println(""+n+ "<-");
		return result;
		}
public static void space() { 
		for (int i = 0; i < step; i++) {System.out.print("-");}
		}
	public static void main(String[] args) {
try {		
		Scanner in=new Scanner(System.in);
		System.out.println("��������� ������� ����� ��������� �� ��������� ������ � ������������������.");
		System.out.println("������������������ ��������� ����������� ���:"+
		   "������� ���� ������������������ ����� ����,\n"+
		   "������ � �������, � ������ ��������� � ����� ���� ����������.");
		System.out.println("������� ����� ����� � ������������������:");
		int n=in.nextInt();
		System.out.println("������������� ��������� ������������������ ������ ������ ����������� �������:");
		System.out.printf("����� ��������� ��� ������� "+n+"="+f(n));
}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������! �������� �� ����������� ����� ������!"); } //��������� ����������
	}
}
