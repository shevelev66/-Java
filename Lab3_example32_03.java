import java.util.Scanner;
public class example32_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ������� ������������������ ����� ���������");
    	System.out.println("������� ���������� ����� ������������������:"); //������
try {		
	    int n = in.nextInt(); //max 47
	    if (n<3) {System.out.println("�� ����� ������� ��������� ����������� ������������������, ������� ��������� ���������� ����������� =3"); n=3;}
	    if (n>47) {System.out.println("�� ����� ������� ������� ����������� ������������������ (> ���� int), ������� ��������� ���������� ����������� =46"); n=46;}
	    int arr[] = new int [n];
	    arr[0]=1; arr[1]=1;
	    //-----------------------------FOR--------------------------------
	    System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ ������ for:");
	    for (int i=2; i<n; ++i) {arr[i] =arr[i-1]+arr[i-2];}  //���������� ������� �������
	    for (int i=0; i<n; ++i) { System.out.print(arr[i]+" "); } //����� ������� ������ �� �������
        System.out.println();
        //-----------------------------DO--------------------------------
        System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ ������ do:");
	    int j=2; //��������� �������
	    do {
	    	arr[j] =arr[j-1]+arr[j-2]; //���������� ������� �������
	    	++j;
	    }
	    while (j<n);
	    j=0; //��������� �������
	    do {
	    	System.out.print(arr[j]+" "); //����� ������� ������ �� �������
	    	++j;
	    }
	    while (j<n);
	    System.out.println();
        //-----------------------------WHILE--------------------------------
        System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������ ������ while:");
	    int k=2;
	    while (k<n) {
	    	arr[k] =arr[k-1]+arr[k-2];  //���������� ������� �������
	        ++k;
	    }
	    k=0;
	    while (k<n) {
	    	System.out.print(arr[k]+" ");  //����� ������� ������ �� �������
	        ++k;
	    }
      System.out.println();
        
 }    
catch (Exception error) {
	    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
		System.out.println("�������� �� ����������� ����� ������!");
		 }
	    in.close();

	}

}

