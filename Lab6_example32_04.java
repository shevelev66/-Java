import java.util.Scanner;
public class example32_04 {
//����������� ����� ��� ���������� �������� ���������� ����� ����� ����
    static int Factorial(int n) { 
    	int result = 1; //�������������
    	System.out.print("������ ������� ����� ����: "+n+"!!="); 
    	for (int i=n; i>=1; i=i-2) {
    		System.out.print(i); //����������� ������������� ����� (��������)
    		if (i>2) System.out.print("x");
    		result=result*i;
    		}
    	System.out.println();
	return result;
}
  //����������� ����� ��� ���������� �������� ���������� ����� ����� ��������
    static int FactorialR(int n) { 
    	int result=1; //�������������
    	if (n<1) {System.out.print("-������ ������� ����� ��������"); System.out.println(); return 1;}
    	System.out.print(n); //����������� ������������� ����� (��������)
    	if (n>2) System.out.print("x"); 
    	result=n*FactorialR(n-2); //��������
    return result;
}   
	public static void main(String[] args) {
try {	
	    System.out.println("���������, � ������� ����������� ������� ��������� ����� n!!.\n"
			+"���������� �������������� � ������ ����� ���������� ��������.\n"
			+"������������ ������ ������ ��� �������� (����� ����) � ������ � ���������.");
		Scanner in = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ����� ��� ������� �������� ����������:");
		int num=in.nextInt();
		System.out.println("������� ��������� ����� "+num+"!!="+Factorial(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ��������� ����� "+num+"!!="+FactorialR(num));
	}	
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}		
	}

}
