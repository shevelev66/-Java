import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class example32_10 {
	//����������� ����� ��� ����������� ����������� � �����������
    static int MaxMin(int...arr) [] { 
    	Arrays.sort(arr); //��������� ���������� ������
    	int array []=new int[2]; //������� ����� ������ � ��������� ���
    	array[0]=arr[arr.length-1]; //���������� ��������
    	array[1]=arr[0]; //���������� ��������  	
    return array;
    }
	public static void main(String[] args) {
try {
	System.out.println("��������� �� ����������� �������, ���������� �������� ���������� ������������ ���������� ������������� ����������.\n"
			+"����������� ����� ���������� ������ �� ���� ���������:\n"
			+ "��� �������� ����������� � ����������� �������� ����� ����������, ���������� ������.");
	Scanner in = new Scanner(System.in);
	Random rnd = new Random(); // Random ��� "����������" ���������� �������
	System.out.println("-----------------------------------------------------");	
	System.out.println("������� ����� ����������:");
	int size=in.nextInt(); //����� ����������
	int[] arr = new int[size]; // �������� ��������� ������� ����������
	System.out.println("��������� ��� ������ ������� ����������� ��������� ����� � ��������� �� 0 �� 100:");
	for (int i=0 ; i<arr.length ; i++) {arr[i] = rnd.nextInt(100); // ���������� i-���� �������� ������� ���������� ��������
    System.out.print(arr[i]+" ");}
	System.out.println();
	System.out.println("-----------------------------------------------------");
	System.out.println("���������-������ � ���������� � ���������� ���������: "+MaxMin(arr)[0]+" "+MaxMin(arr)[1]);
}		
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
