import java.util.Scanner;
public class example32_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ������� ������������������ �� 10 ��������:"); //������
try {
		int n = 10; //���������� ����� ����������
		char arr[] = new char [n]; // ������������ ������
		char b='a';
		//������������ ���������� �������
		for (int i=0; i<n; ++i) { 
			arr[i]=b;
			b+=2;
		}	
		System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ � ������ �������:");
	    for (int i=0; i<n; ++i) {
	    	   System.out.print(arr[i]+" ");  //����� ������� ������ �� �������
	    }
	    System.out.println();
	    System.out.println("������������������ ������������ � �������� �������:");
	    for (int i=arr.length-1; i>=0; --i) {
	    	   System.out.print(arr[i]+" ");  //����� ������� ������ �� �������
	    }
}
catch (Exception error) {
    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	System.out.println("�������� �� ����������� ����� ������!"); }
    in.close();
	}
}
