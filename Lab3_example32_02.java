import java.util.Scanner;
public class example32_02 {


	public static void main(String[] args) {
		     		Scanner in = new Scanner(System.in);
			    	System.out.println("������� �������� ��� ������:"); //������
			try {		
				    String dayString = in.next();
				    dayString = dayString.toLowerCase(); //����������� ��������� ������ � ��������
				    int day;
				    System.out.println("-----------------�� ������ ��������� switch---------------------");
				    switch (dayString) {
				        case "�����������":  day = 1;
				                 break;
				        case "�������":  day = 2;
				                 break;
				        case "�����":  day = 3;
				                 break;
				        case "�������":  day = 4;
				                 break;
				        case "�������":  day = 5;
				                 break;
				        case "�������":  day = 6;
				                 break;
				        case "�����������":  day = 7;
				                 break;
				        default: day = 0;
				                 break;
				                 }
				    if (day==0) {System.out.println("�� ����������� ����� ������! ������ ��� ���!");}
			        if (day!=0) { System.out.println("���������� ����� ��� � ������: "+day);}
			        System.out.println("----------------�� ������ ��������� �������� ���������� if----------------------");
			        day=0; //����� ���������
			        if (dayString.equals("�����������")) {day=1; }
			         else {if (dayString.equals("�������")) {day=2;}
			                else {if (dayString.equals("�����")) {day=3;}
			                       else {if (dayString.equals("�������")) {day=4;}
			                              else { if (dayString.equals("�������")) {day=5;}
			                                      else { if (dayString.equals("�������")) {day=6;}
			                                              else {if (dayString.equals("�����������")) {day=7;}
			                                                     else {day=0;}
			                                              }
			                            	  
			                              }
			                            	  
			                              }
			                       }
			                }
			        	}
			        if (day==0) {System.out.println("�� ����������� ����� ������! ������ ��� ���!");}
			        if (day!=0) { System.out.println("���������� ����� ��� � ������: "+day);}
			 }    
			catch (Exception error) {
				    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
					System.out.println("�������� �� ����������� ����� ������!");
					 }
				    in.close();
	}

}