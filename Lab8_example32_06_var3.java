import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class example32_06_var3 {//�������������� �������	 
    public static void Show(ArrayList<Integer> list) { //����� ������ ������
    	//����� �� ����� ����������� ������
    	System.out.print("������ ����� �����: ");
	    for (int i = 0; i < list.size(); i++)  { System.out.print("["+i+"]="+list.get(i)+" ");}
	    System.out.println();
	    System.out.println("-----------------------------------------------------------");
    }
    public static void Show7(ArrayList<Integer> list) { //����� ������ ������
    	//����� �� ����� �����, �������� �� 7
    	System.out.print("����� ����� �� ������, ��������� �� 7 : ");
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i)%7)==0) { System.out.print("["+i+"]="+list.get(i)+" ");}
               }
    	 System.out.println();
    }
    public static void ShowPos(ArrayList<Integer> list) { //����� ������ ������
    	//����� �� ����� ������������� ����� 
    	System.out.print("������������� ����� �� ������: ");
    	for (int i = 0; i < list.size(); i++) {
            if (((int) list.get(i))>0) { System.out.print("["+i+"]="+list.get(i)+" ");}
               }
    	 System.out.println();
    }
    public static int Sum(ArrayList<Integer> list) {// ����� ������� �����
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
    
    public static void MinMaxPos(ArrayList<Integer> list) { //����� ������ min max
    	ArrayList<Integer> listPos = new ArrayList<Integer>() ; //������� ������ ����� ������������� �����
    	for (int i=0, j=0; i<list.size(); ++i) { if (((int) list.get(i))>0) {listPos.add(list.get(i)); ++j;} } // ���������� ������ ������������� �����
    	if (listPos.size()!=0) {
    	 ShowPos(list); //����� ������������� �����	
    	 int min=Collections.min(listPos); //min ������������� �� ������ 
    	 int max=Collections.max(listPos); //max ������������� �� ������
    	 int inmin=list.indexOf(min); //������ min
    	 int inmax=list.indexOf(max); //������ max
    	 System.out.println("����������� ������������� �������� �� ������: ["+inmin+"]="+min);
    	 System.out.println("������������ ������������� �������� �� ������: ["+inmax+"]="+max);
    	 list.set(inmin, max); //������
    	 list.set(inmax, min); //������ 
    	 System.out.println("������ ����� ������ ������������� max � min:");
  	     Show(list); //����� ������
    	                        }
    	else {System.out.println("� ������ ��� ������������� �����!");}
   }
	public static void main(String[] args) {
		try {		
			System.out.println("������ � ���������� ������ �� n ����� �����.\n"+
			"�) ����� �����, ���������� � ������� �������� ����� �����, ��������� �� 7.\n"+
			"�) ����� ����� ������������� ����� ������� ������� ����������� � ������������ �������� � �� ������ � �������� �� �������.");
			System.out.println("-----------------------------------------------------------");
	//���� � ���������� ������ �� n ����� �����		
			Scanner in=new Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<Integer>() ; //������ ����� �����
			System.out.println("������� ������ ����� ����� (����� Enter, � ����� ������ ������ ����):");
		    while (true) {
		        String s = in.nextLine();
		        if (s.isEmpty()) break;
		        list.add(Integer.parseInt(s));
		         }
		   Show(list); //����� ������
		   System.out.println("����� �):");
		   if (Num(list)!=0) {
		   Show7(list); //����� ��������� �� 7 ��� ��������
		   System.out.println("�����, ��������� �� 7 = "+Sum(list));  //����� ��������� �� 7
		   System.out.println("����������, ��������� �� 7 = "+Num(list));  //���������� ��������� �� 7 
		   System.out.printf("������� ��������, ��������� �� 7 =%.2f ", Midl(list));  //���������� ��������� �� 7 
		   System.out.println();
		                      }
		   else {System.out.println("�����, ��������� �� 7, � ������ ���!");}
		   System.out.println("-----------------------------------------------------------");
		   System.out.println("����� �):");
		   MinMaxPos(list); //����� max & min ������������� � �� ������	   
	    }  
	catch (Exception error) { System.out.println("��� ��������� ������ ��������� ������! �������� �� ����������� ����� ������!"); } //��������� ����������
		}
	}
