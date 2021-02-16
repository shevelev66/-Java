class superClassTest {
	//�������� ��������� ����
	private String str1;
	//����������� � ��������� ����������
	superClassTest(String strEx){
		this.str1 = strEx; }
//@Override - ��������� ����������� ��� ����, ����� �������� ��� ����� �� ���������� �������������� ����� ����������� 
@Override
public String toString() {
	String superClassNameAndFieldValue;
	superClassNameAndFieldValue = "super" + "\n" + 
	" Class name: " + this.getClass().getSimpleName() + "\n" +
	" �������� ��������� ���� = " + this.getStr1();
	return superClassNameAndFieldValue ;
	}
public String getStr1() {
	return str1; 
	}
}
class subClassTest extends superClassTest {
	private String str2; //��� ���� �������� ����
	//����������� � ����� ����������
	subClassTest(String strEx) {
		super(strEx); }
//����������� � ����� �����������
	subClassTest(String strEx1, String strEx2){
		super(strEx1);
		this.str2 = strEx2;
	  }
//@Override - ��������� ��� ����������� ��� ����, ����� �������� ��� ����� �� ���������� �������������� ����� �����������
	@Override
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub" + "\n" +
		" Class name: " + this.getClass().getSimpleName() + "\n" +
		" �������� �������� ���� 1 = " + this.getStr1() + "\n" + 
		" �������� �������� ���� 2 = " + this.str2;  
		return ClassNameAndFieldValue ;
		}
public String getStr2() {
	return str2;
	}
}
public class example32_01 {
	public static void main(String[] args) {
	superClassTest superClassObject = new superClassTest("������ ����� ����������� �����������");
	System.out.println(superClassObject.toString());
	subClassTest subClassObject1 = new subClassTest("������ ����� ����������� ���������, ��� 1 ��������");
	System.out.println(subClassObject1.toString());
	subClassTest subClassObject2 = new subClassTest("������ ����� ����������� ���������", "��� ��� ���������");
	System.out.println(subClassObject2.toString());	
	}
}
