public class example32_07 {
	public static void main(String[] args) {
try {
		System.out.println("��������� ������� ��������� �������� ������ � ���� ������ ����������� �������: \n"+"������� ������ ������ (����� �������), ����� ��������� ������� (����� �����), \n"+"������ ������ (����� �������) � ��� �����. \n");
		 // ���������� ��������.
        int m = 5;
        // ���������� �����.
        int n = 6;
        int i; //������� �����
        int j;//������� ��������
        int[][] mass = new int[n][m];
        // ��������� ��������.
        int value = 1;
        // ������ �� �������.
        for (i = 0; i < n; i++)
        {
                // ������ �� ��������
                for (j = 0; j < m; j++)
                {
                	if (mass[i][j]==0) {mass[i][j] = value; value++;} //if  ���������� ��� ����������� �������
                	if (j==m-1-i) {int temp=i;
                		for (i=n-1; i>0; --i) {if (mass[i][j]==0) {mass[i][j] = value; value++;}}
                		i=temp;
                				}
                }
         }
      //����� �������
		for (i = 0 ; i <mass.length; ++i) {
			for (j=0; j<mass[i].length; ++j) {System.out.printf("%5d", mass[i][j]); }
			System.out.println(); 
        	}
}		
catch (Exception error) {
    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	   }	
	}
}