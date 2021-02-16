import java.util.Scanner;
public class example32_09 {
	public static String getEncryptString(String encryptString, int shift, Boolean flag) {
			encryptString = encryptString.toLowerCase(); //преобразует введенную строку в строчную
			char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
			long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
			char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
			//модификация шифрования
			char [] rus=new char [32]; //задание русского алфавита
			char [] eng=new char [26]; //задание английского алфавита
			char [] rusalf=new char [32]; //замена русского алфавита моего
			char [] engalf=new char [26]; //замена английского алфавита моего
			for (int i=0; i<rus.length;++i) {rus[i]=(char) (1072+i);} //заполнение алфавита
			for (int i=0; i<eng.length;++i) {eng[i]=(char) (97+i);} //заполнение алфавита
			//
			for (int i=0; i<rusalf.length;++i) {if ((i % 2)==0) {rusalf[i]=(char) (9672+i);}
			else {rusalf[i]=(char) (5792+i);} } //заполнение моего алфавита
			for (int i=0; i<engalf.length;++i) {if ((i % 2)==0) {engalf[i]=(char) (5792+i);}
			else {engalf[i]=(char) (9672+i);} } //заполнение моего алфавита
	        for (int i = 0; i< ArrayChar.length; i++) {
	    //модификация flag - переменная определяющая режим шифровки(true)/дешифровки(false)
	        if (flag==true) { //шифровка
	        	for (int j=0; j<rus.length;++j) { if (ArrayChar[i]==rus[j]) {ArrayChar[i]=rusalf[j];} }	//замена алфавита для rus
		        for (int j=0; j<eng.length;++j) { if (ArrayChar[i]==eng[j]) {ArrayChar[i]=engalf[j];} }	//замена алфавита для eng
		        ArrayInt[i] = ArrayChar[i] + shift;	} //сдвиг
		     if (flag==false) { //дешифровка
		    	 ArrayInt[i] = ArrayChar[i] - shift; //убираем сдвиг
		    	 ArrayChar[i]=(char) ArrayInt[i]; //для замены алфавита назад
		    	 for (int j=0; j<rus.length;++j) { if (ArrayChar[i]==rusalf[j]) {ArrayChar[i]=rus[j];} }	//замена алфавита
			     for (int j=0; j<eng.length;++j) { if (ArrayChar[i]==engalf[j]) {ArrayChar[i]=eng[j];} }	//замена алфавита
			     ArrayInt[i] = ArrayChar[i];
		    	 } 
		     ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
		    }
	        encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
	        return encryptString; // возвращаем строку в метод из которого был вызван текущий метод 
	}
	 public static void main(String[] args) {
			try {
				System.out.println("Программа Шифр Цезаря с заменой алфавита:");
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
				case 'д':  System.out.println("Обратное преобразование: "+getEncryptString(textAftercrypt, password, false)); 
				break;
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