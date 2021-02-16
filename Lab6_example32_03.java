import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class MaxMinMidle {
	//����� ���������� ���������� �������
	static int Max(int...arr) {
		Arrays.sort(arr); //��������� ���������� ������
		return arr[arr.length-1]; //���������� ����������
	}
	//����� ���������� ���������� �������
	static int Min(int...arr) {
		Arrays.sort(arr); //��������� ���������� ������
		return arr[0];//���������� ����������
	}
	//����� ���������� ������� ��������
	static double Midle(int...arr) {
		double sum = 0;
		for (int i=0; i<arr.length;++i) {sum+=arr[i];}
		return sum/arr.length;
	}
}
public class example32_03 {
	public static void main(String[] args) {
try {
	System.out.println("��������� � �������, � ������� ���� ����������� ������.\n"
			+"�� ����� ���������� ������������ ���������� ������������� ���������� (��� ������������� ������).\n"
		    +"������ ��������� ���������: ���������� ��������, ���������� ��������, � ����� ������� �������� �� ������ ����������.");
		Scanner in = new Scanner(System.in);
		Random rnd = new Random(); // Random ��� "����������" ���������� ��������� �������
		MaxMinMidle obj=new MaxMinMidle();
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ���������� ����������:");
		int size=in.nextInt();
		int array[]=new int[size];
		System.out.println("��������� ������� ����������� ��������� ����� � ��������� �� 0 �� 200:");
		for (int i=0 ; i<array.length ; i++) {array[i] = rnd.nextInt(200); // ���������� i-���� �������� ������� ���������� ��������
        System.out.print(array[i]+" ");}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("���������� ��������:"+obj.Max(array));
		System.out.println("���������� ��������:"+obj.Min(array));
		System.out.printf("������� �������� ��������� �������= %.2f", obj.Midle(array));
	}
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}		
	}
}
