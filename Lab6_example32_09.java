import java.util.Scanner;
import java.util.Random;
public class example32_09 {
	//����������� ����� ��� ������� �������� ���������
    static char ObmenCh(char arr[]) [] { 
    	char temp; //����� ������
    	for (int j=0; j<arr.length/2; ++j) { //�������� ������ ��� ������� �� ��� �������
    		temp=arr[j];
    		arr[j]=arr[arr.length-1-j];
    		arr[arr.length-1-j]=temp;
    	}
	return arr;
    }
	public static void main(String[] args) {
try {	
	    System.out.println("��������� �� ����������� �������, ���������� �������� ���������� ���������� ���������� ������.\n"
			+"� ���������� ������ ������ �������� ������� ������� �������� �������:\n"
			+ "������ � � ���������, ������ � � ������������� � ��� �����.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random ��� "����������" ���������� ����������� �������
		System.out.println("-----------------------------------------------------");	
		System.out.println("������� ����� ����������� �������:");
		int size=in.nextInt(); //������ ����������� �������
		char arrchar[]=new char[size]; //������� ���������� ������
		System.out.println("�������� ������ ������ ����������� ��������� ����� � ��������� �� A �� z:");
		for (int i=0; i<arrchar.length; ++i) {arrchar[i]=(char) ('A'+rnd.nextInt(56)); System.out.print(arrchar[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		arrchar=ObmenCh(arrchar);
		System.out.println("������ ����� ��������� ������� (������ ���������):");
		for (int i=0; i<arrchar.length; ++i) {System.out.print(arrchar[i]+" ");}
		System.out.println();
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}	
	}

}
