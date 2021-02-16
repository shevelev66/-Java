import java.util.InputMismatchException;
import java.util.Scanner;
public class example32_02_3_M { //РЕАЛИЗАЦИЯ С МЕТОДАМИ
	public static int EnterSize() throws InputMismatchException, NegativeArraySizeException { //метод ввода длины массива
	    Scanner in=new Scanner(System.in); //инициализация ввода
	    //Ввод с клавиатуры списка из n целых чисел		
		System.out.print("Введите длину массива: ");
		//исключение - несоответствие ввода InputMismatchException
		// если ввести строку или число с плавающ запятой вместо int
		//длина массива + элементы массива
		// для длины массива NegativeArraySizeException - если ввести отрицательное значение
		int size=in.nextInt();
		//если размер введен отрицательный генерируем исключение
		if (size<0) throw new NegativeArraySizeException();
		return size;
}
public static Byte [] EnterArr(Byte [] array) throws InputMismatchException {//метод заполнения массива элементами
	Scanner in=new Scanner(System.in); //инициализация ввода
	System.out.println("Введите массив целых чисел в диапазоне от -128 до 127:");
	for (int i=0; i<array.length; ++i) {array[i]=in.nextByte();}
	return array;
}
public static void SumByte(Byte [] array) throws InputMismatchException {
	//при выходе СУММЫ ЗА ПРЕДЕЛЫ ДИАПАЗОНА BYTE ОШИБКИ НЕ ВОЗНИКАЕТ
	//ну мы можем ее создать :)
	int sum=0;
	for (int i=0; i<array.length; ++i) { sum=sum+array[i]; }
	if (sum>Byte.MAX_VALUE | sum<Byte.MIN_VALUE) throw new InputMismatchException ("Ошибка переполнения типа Byte!");
	else System.out.println("Сумма элементов массива="+(byte) sum);
}
	public static void main(String[] args) {
try {		
	        System.out.println("В программе вычисляется сумму элементов типа byte одномерного массива, вводимого с клавиатуры:");	
		    Byte[] array=new Byte[EnterSize()]; //создание массива + метод ввода длины
		    array=EnterArr(array); //метод ввода элементов
		    SumByte(array); //метод суммирования элементов
    }
	catch (InputMismatchException error) { System.out.println("Вы некорректно ввели данные массива!"+error); } //обработка исключения
	catch (NegativeArraySizeException error) { System.out.println("Вы ввели отрицательную длину массива!"); } //обработка исключения
	 }
	}	