import java.util.Scanner;
public class example32_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		    	System.out.println("������� ����� ����� � ��������� �� 1 �� 7:"); //������
		try {		
			    int day = in.nextInt();
			    String dayString;
			    switch (day) {
			        case 1:  dayString = "�����������";
			                 break;
			        case 2:  dayString = "�������";
			                 break;
			        case 3:  dayString = "�����";
			                 break;
			        case 4:  dayString = "�������";
			                 break;
			        case 5:  dayString = "�������";
			                 break;
			        case 6:  dayString = "�������";
			                 break;
			        case 7:  dayString = "�����������";
			                 break;
			        default: dayString = "������� ������������ ��������";
			                 break;
			                 }
			    System.out.println("--------------------------------------");
		        System.out.println("���� ������: "+dayString);
		 }    
		catch (Exception error) {
			    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
				System.out.println("�������� �� ����������� ����� ������!");
				 }
			    in.close();
		}
	}
