import java.util.Scanner;
import java.util.Random;
public class example32_06 {
	//����������� ����� ��� �������� ������ �������
    static int NewArray(int arr[], int size) [] { 
    	int newsize;
    	if (arr.length>size) {newsize=size;}
    	else {newsize=arr.length;}
    	int newarr[]=new int[newsize]; 
    	for (int j=0;j<newsize;++j) {newarr[j]=arr[j];}
	return newarr;
    }
	public static void main(String[] args) {
try {	
	   System.out.println("��������� �� ����������� �������, �������� ���������� ���������� ������������� ������ � ����� �����.\n"
			+"����� ���������� ������ �� ����� ������, ������� ���������� �� ��������� �������,\n"
			+"���������� ���������, ������� ����� ����� �� ��������� �������, ������������ ������ ���������� ������.\n"
			+"���� ������ �������� ������ ������ ����� ��������� �������, �� ������� ��������� ����� ��������� �������.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random ��� "����������" ���������� ��������� �������
		System.out.println("-----------------------------------------------------");	
		System.out.println("�������� �������� ������ ��� ������������ ������, ������� ������ ��������� �������:");
		int insize=in.nextInt(); //������ ��������� �������
		int[] initarr = new int[insize]; // �������� ��������� ������� 
		System.out.println("�������� ������ ������ ����������� ��������� ����� � ��������� �� 0 �� 200:");
		for (int i=0 ; i<initarr.length ; i++) {initarr[i] = rnd.nextInt(200); // ���������� i-���� �������� ������� ���������� ��������
        System.out.print(initarr[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");	
		System.out.println("������� ������ ������ ������� ��� ��������� ����������� �������:");
		int size=in.nextInt(); //������ ������ �������
		int[] newarr = new int[size];
		newarr=NewArray(initarr, size);
		System.out.println("����� ������, ��������� ����������� �������:");
		for (int i=0 ; i<newarr.length ; i++) {System.out.print(newarr[i]+" ");}
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}
}
