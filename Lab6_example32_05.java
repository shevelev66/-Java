import java.util.Scanner;
public class example32_05 {
	//����������� ����� ��� ���������� ����� ��������� ����������� �����
    static int SumSQR(int n) { 
    	int result = 0; //�������������
    	System.out.print("������ ������� ����� ����: "); 
    	for (int i=1; i<=n; ++i) {
    		System.out.print(i+"^2"); //����������� ������������� ����� (��������)
    		if (i!=n) System.out.print("+");
    		result=result+i*i;
    		}
    	System.out.println();
	return result;
    }	
  //����������� ����� ��� ���������� ����� ��������� ����������� ����� ����� ��������
    static int SumSQR_R(int n) { 
    	int result=0; //�������������
    	if (n<1) {System.out.print("-������ ������� ����� ��������"); System.out.println(); return 0;}
    	System.out.print(n+"^2"); //����������� ������������� ����� (��������)
    	if (n>1) System.out.print("+"); 
    	result=n*n+SumSQR_R(n-1); //��������
    return result;
}   
	public static void main(String[] args) {
try {	
	    System.out.println("���������, � ������� ����������� ����� ��������� ����������� ����� 1^2+2^2+3^2+...+n^2.\n"
			+"���������� �������������� � ������ ����� ���������� ��������.\n"
			+"������������ ������ ������ ��� �������� (����� ����) � ������ � ���������.\n"
			+"��� �������� ���������� ������������ ������� 1^2+2^2+3^2+�+n^2=n(n+l)(2n+1)/6");
	    Scanner in = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("������� ����� ��� ������� ����� ��������� ����������� ����� �� n:");
		int num=in.nextInt();
		System.out.println("-----------------------------------------------------");
		System.out.println("����� ��������� ����������� ����� �� "+num+"="+SumSQR(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("����� ��������� ����������� ����� �� "+num+"="+SumSQR_R(num));
		System.out.println("-----------------------------------------------------");
		System.out.println("�������� ���������� �� ������� n*(n+1)*(2*n+1)/6="+num*(num+1)*(2*num+1)/6);
	}	
catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
}		
	}

}