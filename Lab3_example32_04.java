import java.util.Scanner;
public class example32_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
try {		
		int arr[] = new int [2];
    	System.out.println("������� 1-� �����:"); //������
    	arr[0] = in.nextInt(); //1-� �����
    	System.out.println("������� 2-� �����:"); //������
    	arr[1] = in.nextInt(); //2-� �����
    	//����� ���������� �������
    	//-----------------------------FOR--------------------------------
	    System.out.println("--------�������� ���������� �������------------------------------");
	    System.out.println("������������������ ������������ ������ for:");
    	int i, j, k, x;
    	for( i=0; i < 2; i++) { 
    		k=i; x=arr[i];
    	for( j=i+1; j < 2; j++) // ���� ������ ����������� ��������
    	if ( arr[j] < x ) { k=j; x=arr[j];} // k - ������ ����������� ��������
    	arr[k] = arr[i]; arr[i] = x;} // ������ ������� ���������� � a[i]
    	System.out.print("������������������ Min -> Max: ");
    	for ( i=0; i<2; ++i) { System.out.print(arr[i]+" "); } //����� ������� ������ �� �������
        System.out.println();
        //
        System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ ������ do:");
	    i=0;
	    do {
	    k=i; x=arr[i];
	    j=i+1;
	    if (j>=2) j=1; //��� ������� �� �� ���� �������� �����
	    do {
    	 // ���� ������ ����������� ��������
    	if ( arr[j] < x ) { k=j; x=arr[j];}// k - ������ ����������� ��������
	    ++j;
	    }
	    while (j<2);
    	arr[k] = arr[i]; arr[i] = x;
    	++i;
	    }
	    while (i<2);
	    System.out.print("������������������ Min -> Max: ");
	    i=0;
	    do {
	    	System.out.print(arr[i]+" "); //����� ������� ������ �� �������
	    	++i;
	    }
	    while (i<2);
	    //
	    System.out.println();
	    System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ ������ while:");
	    i=0;
	    while (i<2) {
	    k=i; x=arr[i];
	    j=i+1;
	    if (j>=2) j=1; //��� ������� �� �� ���� �������� �����
	    while (j<2) {
    	 // ���� ������ ����������� ��������
    	if ( arr[j] < x ) { k=j; x=arr[j];}// k - ������ ����������� ��������
	    ++j;
	    }
	    arr[k] = arr[i]; arr[i] = x;
    	++i;
	    }
	    System.out.print("������������������ Min -> Max: ");
	    i=0;
	    while (i<2) {
	    	System.out.print(arr[i]+" "); //����� ������� ������ �� �������
	    	++i;
	    }
}    
catch (Exception error) {
	    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");
		 }
in.close();
	  }
}