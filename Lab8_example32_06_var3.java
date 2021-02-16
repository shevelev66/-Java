import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class example32_06_var3 {//ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ	 
    public static void Show(ArrayList<Integer> list) { //метод вывода списка
    	//вывод на экран содержимого списка
    	System.out.print("Список целых чисел: ");
	    for (int i = 0; i < list.size(); i++)  { System.out.print("["+i+"]="+list.get(i)+" ");}
	    System.out.println();
	    System.out.println("-----------------------------------------------------------");
    }
    public static void Show7(ArrayList<Integer> list) { //метод вывода списка
    	//вывод на экран чисел, делящхся на 7
    	System.out.print("Целые числа из списка, делящиеся на 7 : ");
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i)%7)==0) { System.out.print("["+i+"]="+list.get(i)+" ");}
               }
    	 System.out.println();
    }
    public static void ShowPos(ArrayList<Integer> list) { //метод вывода списка
    	//вывод на экран положительных чисел 
    	System.out.print("Положительные числа из списка: ");
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i))>0) { System.out.print("["+i+"]="+list.get(i)+" ");}
               }
    	 System.out.println();
    }
    public static int Sum(ArrayList<Integer> list) {// метод расчета суммы
    	int summa=0;
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i)%7)==0) { summa=summa+((int) list.get(i));}
               }
    	return summa;
    }
    public static int Num(ArrayList<Integer> list) {
    	int n=0;
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i)%7)==0) { n++;}
               }
    	return n;
    }
    public static double Midl(ArrayList<Integer> list) {
    	return (double) Sum(list)/Num(list) ;
    }
    
    public static void MinMaxPos(ArrayList<Integer> list) { //метод поиска min max
    	ArrayList<Integer> listPos = new ArrayList<Integer>() ; //создаем список целых положительных чисел
    	for (int i=0, j=0; i<list.size(); ++i) { if (((int) list.get(i))>0) {listPos.add(list.get(i)); ++j;} } // заполнения списка положительных чисел
    	if (listPos.size()!=0) {
    	 ShowPos(list); //вывод положительных чисел	
    	 int min=Collections.min(listPos); //min положительный из списка 
    	 int max=Collections.max(listPos); //max положительный из списка
    	 int inmin=list.indexOf(min); //индекс min
    	 int inmax=list.indexOf(max); //индекс max
    	 System.out.println("Минимальное положительное значение из списка: ["+inmin+"]="+min);
    	 System.out.println("Максимальное положительное значение из списка: ["+inmax+"]="+max);
    	 list.set(inmin, max); //замена
    	 list.set(inmax, min); //замена 
    	 System.out.println("Список после замены положительных max и min:");
  	     Show(list); //вывод списка
    	                        }
    	else {System.out.println("В списке нет положительных чисел!");}
   }
	public static void main(String[] args) {
		try {		
			System.out.println("Ввести с клавиатуры список из n целых чисел.\n"+
			"а) Найти сумму, количество и среднее значение среди чисел, делящихся на 7.\n"+
			"б) Найти среди положительных чисел данного массива минимальное и максимальное значения и их номера и поменять их местами.");
			System.out.println("-----------------------------------------------------------");
	//Ввод с клавиатуры списка из n целых чисел		
			Scanner in=new Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<Integer>() ; //список целых чисел
			System.out.println("Введите список целых чисел (через Enter, в конце списка пустой ввод):");
		    while (true) {
		        String s = in.nextLine();
		        if (s.isEmpty()) break;
		        list.add(Integer.parseInt(s));
		         }
		   Show(list); //вывод списка
		   System.out.println("Пункт а):");
		   if (Num(list)!=0) {
		   Show7(list); //вывод делящихся на 7 для удобства
		   System.out.println("Сумма, делящихся на 7 = "+Sum(list));  //сумма делящихся на 7
		   System.out.println("Количество, делящихся на 7 = "+Num(list));  //количество делящихся на 7 
		   System.out.printf("Среднее значение, делящихся на 7 =%.2f ", Midl(list));  //количество делящихся на 7 
		   System.out.println();
		                      }
		   else {System.out.println("Чисел, делящихся на 7, в списке нет!");}
		   System.out.println("-----------------------------------------------------------");
		   System.out.println("Пункт б):");
		   MinMaxPos(list); //поиск max & min положительных и их замена	   
	    }  
	catch (Exception error) { System.out.println("При обработке данных произошла ошибка! Возможно Вы некорректно ввели данные!"); } //обработка исключения
		}
	}
