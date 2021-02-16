import java.util.Scanner;
public class example32_02 {


	public static void main(String[] args) {
		     		Scanner in = new Scanner(System.in);
			    	System.out.println("Введите название дня недели:"); //запрос
			try {		
				    String dayString = in.next();
				    dayString = dayString.toLowerCase(); //преобразует введенную строку в строчную
				    int day;
				    System.out.println("-----------------на основе оператора switch---------------------");
				    switch (dayString) {
				        case "понедельник":  day = 1;
				                 break;
				        case "вторник":  day = 2;
				                 break;
				        case "среда":  day = 3;
				                 break;
				        case "четверг":  day = 4;
				                 break;
				        case "пятница":  day = 5;
				                 break;
				        case "суббота":  day = 6;
				                 break;
				        case "воскресенье":  day = 7;
				                 break;
				        default: day = 0;
				                 break;
				                 }
				    if (day==0) {System.out.println("Вы некорректно ввели данные! Такого дня нет!");}
			        if (day!=0) { System.out.println("Порядковый номер дня в неделе: "+day);}
			        System.out.println("----------------на основе вложенных условных операторов if----------------------");
			        day=0; //сброс параметра
			        if (dayString.equals("понедельник")) {day=1; }
			         else {if (dayString.equals("вторник")) {day=2;}
			                else {if (dayString.equals("среда")) {day=3;}
			                       else {if (dayString.equals("четверг")) {day=4;}
			                              else { if (dayString.equals("пятница")) {day=5;}
			                                      else { if (dayString.equals("суббота")) {day=6;}
			                                              else {if (dayString.equals("воскресенье")) {day=7;}
			                                                     else {day=0;}
			                                              }
			                            	  
			                              }
			                            	  
			                              }
			                       }
			                }
			        	}
			        if (day==0) {System.out.println("Вы некорректно ввели данные! Такого дня нет!");}
			        if (day!=0) { System.out.println("Порядковый номер дня в неделе: "+day);}
			 }    
			catch (Exception error) {
				    System.out.println("При обработке данных произошла ошибка!"); //обработка исключения
					System.out.println("Возможно вы некорректно ввели данные!");
					 }
				    in.close();
	}

}