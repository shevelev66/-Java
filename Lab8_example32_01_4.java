import java.util.Scanner;
public class example32_01_4 {//������ 4 ������ 1 ���������
	public static int fact(int n) { //����� ���������� ���������� ���������
		int result;
		if (n==1) return 1;
		else{ result=fact(n-1)*n; return result; }
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("��������� ��������� ����� n � �������������� ��������.");
			System.out.println("������� ����� ��� ���������� ����������:");
			int n=in.nextInt();
	        System.out.printf("��������� ����� "+n+"!="+fact(n));  
		}
	}