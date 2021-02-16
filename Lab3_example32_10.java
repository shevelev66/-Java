import java.util.Arrays; // ����� ��� ����������� ������ Arrays, ��� ���������� ��������� ������� �� �����������
import java.util.Collections; //�� ��������
import java.util.Random; // ����� ��� ����������� ������ Random � �������� ������� ��� ��������� ���������� �����
import java.util.Scanner; // ����� ��� ����������� ������ Scanner, ��� ���������� � ������� ��������
public class example32_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // �������� ������� ������ Scanner ��� ���������� ����� ��������� � �������
		System.out.println("������ ����� ������ ��������.");
		System.out.println("������� ������ �������"); // ������
	try {		
		int Size = in.nextInt(); // ������ �������
		Integer[] nums = new Integer[Size]; // �������� ������� 
		Random random = new Random(); // �������� ������� ������ Random ��� ��������� "����������" ����� 
		System.out.println("�� ������������� ������ ������ ����������� ��������� ����� � ��������� �� 0 �� 200:");
		for (int i = 0 ; i < nums.length ; i++ ){ nums[i] = random.nextInt(200); // ���������� i-���� �������� ������� ���������� ��������
		                                          System.out.print(nums[i]+" "); 
        }
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		Arrays.sort(nums, Collections.reverseOrder()); // ���������� ������� �� �������� ��� ���������
		System.out.println("����������� ���������� ������� � ������� ��������:"); 
		for (int i = 0 ; i < nums.length ; i++ ){ System.out.print(nums[i]+" ");	}
		System.out.println();
	}    
	catch (Exception error) {
		    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
			System.out.println("�������� �� ����������� ����� ������!");
			 }
	in.close();
	}
}
