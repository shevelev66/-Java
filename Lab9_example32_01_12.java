public class example32_01_12 { //������ 12
	public static void m(String str, double chislo) {
	    //��������� ���������� IllegalArgumentException
	    if (str==null) { throw new IllegalArgumentException("������ ������� �������"); } //����������
		if (chislo>0.001) {throw new IllegalArgumentException("�������� �����"); } // �� ����������
		}
public static void main(String[] args) {
    //����� ������ � ��������� �����������
	m(null,0.000001);
	//�.�. ����������� ����������� ��
	//��������� ���������� ������������ ������� java
	}
}