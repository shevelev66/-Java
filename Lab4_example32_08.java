import java.util.Scanner;
public class example32_08 {
//����� ����������
	public static String getEncryptString(String encryptString, int shift, Boolean flag) {
		char[] ArrayChar = encryptString.toCharArray(); // ����������� ���������� � ����� ������ � ���������� ������
		long[] ArrayInt = new long[ArrayChar.length]; // ������� ������ � ����� ������ long, ������ ������� ����� ������� ����������� �������
		char[] ArrayCharNew = new char[ArrayChar.length]; // ������� ���������� ������ � ������� ����� ���������� ��������������� ������� 
		//� ����� ���������� ��� ������� �� ������� ������� ���������� ���� ������ � ���������� � ��� �����, ���� (�����)
        for (int i = 0; i< ArrayChar.length; i++) {
        	//����������� flag - ���������� ������������ ����� ��������(true)/����������(false)
	     if (flag==true) { ArrayInt[i] = ArrayChar[i] + shift;} // ���������� � ������� � �������� i �����
	     if (flag==false) { ArrayInt[i] = ArrayChar[i] - shift;} // �������� �� ������� � �������� i �����
	     ArrayCharNew[i] = (char)ArrayInt[i]; // ��������������� ����� � ������ char � ���������� �� ������ ����� � ����� ������
	    }
        encryptString = new String (ArrayCharNew); // ��������������� ����� ������ �������� � ������
        return encryptString; // ���������� ������ � ����� �� �������� ��� ������ ������� ����� 
}
	public static void main(String[] args) {
try {
	System.out.println("��������� ���� ������:");
	System.out.println("---------------------------------------------------------------");
	Scanner in = new Scanner(System.in);
	int password; //������ ��� ����������
	System.out.println("������� ����� ��� ����������:");
	String textFcrypt = in.nextLine();
	System.out.println("������� ����(����� �����):");
	if (in.hasNextInt()==true) {password = in.nextInt();}  //��� ������������ ����� ������, �� ����� ������� ���������� ������� ���������
	   else {password=123; in.next(); System.out.println("�� ����� ������������ ����, �� ��������� ������� ��� �� ����)"); }
	String textAftercrypt=getEncryptString(textFcrypt, password, true);
	System.out.println("����� ����� ��������������: "+textAftercrypt);
	System.out.println("��������� �������� ��������������? (y/n ��� �/�)");
	char answer=in.next().charAt(0);
	switch (answer) {
	case 'y': System.out.println("�������� ��������������: "+getEncryptString(textAftercrypt, password, false)); break;
	case 'n': System.out.println("�� ��������!"); break;
	case '�':  System.out.println("�������� ��������������: "+getEncryptString(textAftercrypt, password, false)); break;
	case '�': System.out.println("�� ��������!"); break;
	default: System.out.println("������� ���������� �����!"); break; 
	}
	in.close();
}
catch (Exception error) {
    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	   }	
	}
}