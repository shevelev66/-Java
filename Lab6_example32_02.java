import java.util.Scanner;
class IntPoleSt {
	private static int IntPole=0; //�������� ����������� ������������� ���� =0
	static void ShowPoleInc() {
		System.out.println("�������� ���������� ������������� ����="+IntPole);
		IntPole++;
	}
}
public class example32_02 {
	public static void main(String[] args) {
try {		
		Scanner in = new Scanner(System.in); 
		IntPoleSt obj=new IntPoleSt();
		System.out.println("��������� � �������, � ������� ���� �������� ����������� ������������� ���� � ���. ���������=0\n"
				+"� ������ ������ ����������� �����, ������������ ������� �������� ������������ ����\n"
				+"����� ���� �������� ���� ������������� �� �������.");
metka1:{	while (true) {		//
	        System.out.println("-----------------------------------------------------");
			obj.ShowPoleInc(); //����������� ���� + Inc
metka:{	while (true) {
			System.out.println("����������? (�/� ��� y/n)"); 
				char answer=in.nextLine().charAt(0); 
				switch (answer) {
				case 'y': break metka;
				case 'n': System.out.println("�� ��������!"); break metka1; 
				case '�': break metka;
				case '�': System.out.println("�� ��������!"); break metka1;
				default: System.out.println("������� ���������� �����!"); continue; 
				}
			   }
		     }
			}}		
	}		
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}
	}

}
