import java.util.Random;
import java.util.Scanner;
public class example32_07 {
	//����������� ����� ��� �������� ������ �������
    static int IntArray(char chr[]) [] { 
    	int newarr[]=new int[chr.length]; 
    	for (int j=0; j<newarr.length; ++j) {newarr[j]=(int) chr[j];}
	return newarr;
    }
	public static void main(String[] args) {
try {
	System.out.println("��������� �� ����������� �������, ���������� �������� ���������� ���������� ������\n"
			+"����������� ������������ ������ �� ������������� ������, ��������� �� ����� �������� �� �������-���������.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random ��� "����������" ���������� ����������� �������
		System.out.println("-----------------------------------------------------");	
		System.out.println("������� ����� ����������� �������:");
		int size=in.nextInt(); //������ ����������� �������
		char arrchar[]=new char[size]; //���������� ������
		System.out.println("�������� ������ ������ ����������� ��������� ����� � ��������� �� A �� z:");
		for (int i=0; i<arrchar.length; ++i) {arrchar[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(arrchar[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("������������� ������, ���������� �� �����������:");
		for (int i=0; i<IntArray(arrchar).length; ++i) {System.out.print(IntArray(arrchar)[i]+" "); }
}		
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
