import java.util.Scanner;
public class example32_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ������� ������������������ �� 10 �������� (��� �������):"); //������
try {
	    char glasnarr[] = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'}; //������ �������
		int n = 10; //���������� ����� ����������
		char arr[] = new char [n]; // ������������ ������
		char b='A';
		//������������ ���������� �������
		for (int i=0; i<n; ++i) { 
			boolean flag=true;
			for (int j=0; j<glasnarr.length; ++j) {if (b==glasnarr[j]) {--i; flag=false; break;} }
			if (flag==true) { arr[i]=b;}
			++b;
		}	
		System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ � ������ �������:");
	    for (int i=0; i<n; ++i) {
	    	   System.out.print(arr[i]+" ");  //����� ������� ������ �� �������
	    }
}
catch (Exception error) {
    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	System.out.println("�������� �� ����������� ����� ������!"); }
    in.close();
	}
}
