import java.util.Scanner;
public class example32_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		    	System.out.println("Введите целое число в диапазоне от 1 до 7:"); //запрос
		try {		
			    int day = in.nextInt();
			    String dayString;
			    switch (day) {
			        case 1:  dayString = "Понедельник";
			                 break;
			        case 2:  dayString = "Вторник";
			                 break;
			        case 3:  dayString = "Среда";
			                 break;
			        case 4:  dayString = "Четверг";
			                 break;
			        case 5:  dayString = "Пятница";
			                 break;
			        case 6:  dayString = "Суббота";
			                 break;
			        case 7:  dayString = "Воскресенье";
			                 break;
			        default: dayString = "Введено некорректное значение";
			                 break;
			                 }
			    System.out.println("--------------------------------------");
		        System.out.println("День недели: "+dayString);
		 }    
		catch (Exception error) {
			    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
				System.out.println("Возможно вы некорректно ввели данные!");
				 }
			    in.close();
		}
	}
