import java.util.Scanner;
import java.util.Random;
public class example32_08 {
	//����������� ����� ��� ������� �������� ���������
    static double MidleArr(int arr[]) { 
    	double sum=0;//����� ��������� ������� double ��� ��������� ������� �����
    	for (int j=0; j<arr.length; ++j) {sum=sum+arr[j];}
	return (sum/arr.length);
    }
	public static void main(String[] args) {
try {
	System.out.println("��������� �� ����������� �������, ���������� �������� ���������� ������������� ������,\n"
			+"����������� ������������ ������� �������� ��� ��������� �������");
	Scanner in = new Scanner(System.in);
	Random rnd = new Random(); // Random ��� "����������" ���������� ��������� �������
	System.out.println("-----------------------------------------------------");	
	System.out.println("�������� �������� ������ ��� ������������ ������, ������� ������ ��������� �������:");
	int size=in.nextInt(); //������ ��������� �������
	int[] arr = new int[size]; // �������� ��������� ������� 
	System.out.println("�������� ������ ������ ����������� ��������� ����� � ��������� �� 0 �� 100:");
	for (int i=0 ; i<arr.length ; i++) {arr[i] = rnd.nextInt(100); // ���������� i-���� �������� ������� ���������� ��������
    System.out.print(arr[i]+" ");}
	System.out.println();
	System.out.println("-----------------------------------------------------");
	System.out.printf("������� �������� ��������� �������= %.2f", MidleArr(arr));
}		
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
