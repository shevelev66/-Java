class superClassTest {
	//закрытое текстовое поле
	private String str1;
	//конструктор с текстовым аргументом
	superClassTest(String strEx){
		this.str1 = strEx; }
//@Override - аннотация указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса 
@Override
public String toString() {
	String superClassNameAndFieldValue;
	superClassNameAndFieldValue = "super" + "\n" + 
	" Class name: " + this.getClass().getSimpleName() + "\n" +
	" Закрытое текстовое поле = " + this.getStr1();
	return superClassNameAndFieldValue ;
	}
public String getStr1() {
	return str1; 
	}
}
class subClassTest extends superClassTest {
	private String str2; //еще одно закрытое поле
	//конструктор с одним параметром
	subClassTest(String strEx) {
		super(strEx); }
//конструктор с двумя параметрами
	subClassTest(String strEx1, String strEx2){
		super(strEx1);
		this.str2 = strEx2;
	  }
//@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
	@Override
	public String toString() {
		String ClassNameAndFieldValue;
		ClassNameAndFieldValue = "sub" + "\n" +
		" Class name: " + this.getClass().getSimpleName() + "\n" +
		" Закрытое тестовое поле 1 = " + this.getStr1() + "\n" + 
		" Закрытое тестовое поле 2 = " + this.str2;  
		return ClassNameAndFieldValue ;
		}
public String getStr2() {
	return str2;
	}
}
public class example32_01 {
	public static void main(String[] args) {
	superClassTest superClassObject = new superClassTest("Задано через конструктор суперкласса");
	System.out.println(superClassObject.toString());
	subClassTest subClassObject1 = new subClassTest("Задано через конструктор подкласса, где 1 параметр");
	System.out.println(subClassObject1.toString());
	subClassTest subClassObject2 = new subClassTest("Задано через конструктор подкласса", "где два параметра");
	System.out.println(subClassObject2.toString());	
	}
}
