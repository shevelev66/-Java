import java.util.Scanner;
public class example32_08 {
//метод шифрования
	public static String getEncryptString(String encryptString, int shift, Boolean flag) {
		char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
		long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
		char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы 
		//в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
        for (int i = 0; i< ArrayChar.length; i++) {
        	//модификация flag - переменная определяющая режим шифровки(true)/дешифровки(false)
	     if (flag==true) { ArrayInt[i] = ArrayChar[i] + shift;} // прибавляем к символу с индексом i сдвиг
	     if (flag==false) { ArrayInt[i] = ArrayChar[i] - shift;} // убавляем от символу с индексом i сдвиг
	     ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
	    }
        encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
        return encryptString; // возвращаем строку в метод из которого был вызван текущий метод 
}
	public static void main(String[] args) {
try {
	System.out.println("Программа Шифр Цезаря:");
	System.out.println("---------------------------------------------------------------");
	Scanner in = new Scanner(System.in);
	int password; //пароль для шифрования
	System.out.println("Введите текст для шифрования:");
	String textFcrypt = in.nextLine();
	System.out.println("Введите ключ(целое число):");
	if (in.hasNextInt()==true) {password = in.nextInt();}  //при некорректном вводе пароля, он будет заменен внутренним паролем программы
	   else {password=123; in.next(); System.out.println("Вы ввели некорректный ключ, но программа заменит его на свой)"); }
	String textAftercrypt=getEncryptString(textFcrypt, password, true);
	System.out.println("Текст после преобразования: "+textAftercrypt);
	System.out.println("Выполнить обратное преобразование? (y/n или д/н)");
	char answer=in.next().charAt(0);
	switch (answer) {
	case 'y': System.out.println("Обратное преобразование: "+getEncryptString(textAftercrypt, password, false)); break;
	case 'n': System.out.println("До свидания!"); break;
	case 'д':  System.out.println("Обратное преобразование: "+getEncryptString(textAftercrypt, password, false)); break;
	case 'н': System.out.println("До свидания!"); break;
	default: System.out.println("Введите корректный ответ!"); break; 
	}
	in.close();
}
catch (Exception error) {
    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
	   }	
	}
}