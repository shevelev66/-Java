import java.util.Arrays; // ����� ��� ����������� ������ Arrays, ��� ���������� ��������� ������� �� �����������
import java.util.Random; // ����� ��� ����������� ������ Random � �������� ������� ��� ��������� ���������� �����
import java.util.Scanner; // ����� ��� ����������� ������ Scanner, ��� ���������� � ������� ��������
public class example32_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // �������� ������� ������ Scanner ��� ���������� ����� ��������� � �������
		System.out.println("������ ����� ������ ��������.");
		System.out.println("������� ������ �������"); // ������
	try {		
		int Size = in.nextInt(); // ������ �������
		int[] nums = new int[Size]; // �������� ������� 
		Random random = new Random(); // �������� ������� ������ Random ��� ��������� "����������" ����� 
		System.out.println("�� ������������� ������ ������ ����������� ��������� ����� � ��������� �� 0 �� 200:");
		for (int i = 0 ; i < nums.length ; i++ ){ nums[i] = random.nextInt(200); // ���������� i-���� �������� ������� ���������� ��������
		                                          System.out.print("["+i+"]="+nums[i]+" "); 
        }
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		Arrays.sort(nums); // ���������� ������� �� ����������� ��� ���������
		System.out.println("����������� ���������� �������:"); 
		for (int i = 0 ; i < nums.length ; i++ ){ System.out.print("["+i+"]="+nums[i]+" ");	}
		System.out.println();
		System.out.println("������� � ����������� ���������: "+nums[0]);
		for (int i = 0 ; i < nums.length ; i++ ){ if (nums[i]==nums[0]) {System.out.print("["+i+"]="+nums[i]+" ");	} }
	 }    
	catch (Exception error) {
		    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
			System.out.println("�������� �� ����������� ����� ������!");
			 }
		    in.close();
	}
}