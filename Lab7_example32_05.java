class SuperPrivateTxTPole { //суперкласс
	protected  String TxtPole; //закрытое текстовое поле
	SuperPrivateTxTPole (String txt) { //конструктор с текстовым параметром
		TxtPole=txt;
	}
	void Show () {//метод отображает название класса и значение поле
	System.out.println("-----------------------------------------------------");	
	System.out.println("»м€ класса: "+this.getClass().getSimpleName());
	System.out.println("«акрытое текстовое поле:"+this.TxtPole);
	}
}
class FirstSubPrivetePole extends SuperPrivateTxTPole {//первый подкласс
	protected int IntPole; //закрытое целочисленное поле
	FirstSubPrivetePole (String text, int n) { //конструктор подкласса с параметрами
		super(text);
		IntPole=n;
	}
	void Show () { //переопределение метода
		super.Show();
		System.out.println("«акрытое целочисленное поле:"+this.IntPole);
	}
}
class SecondSubPrivatePole extends SuperPrivateTxTPole {//второй подкласс
	protected char CharPole; //закрытое символьное поле
	SecondSubPrivatePole (String text, char ch) { //конструктор подкласса с параметрами
		super(text);
		CharPole=ch;
	}
	void Show () { //переопределение метода
		super.Show();
		System.out.println("«акрытое символьное поле:"+this.CharPole);
	}
}
public class example32_05 {

	public static void main(String[] args) {
try {		
	    SuperPrivateTxTPole superobj=new SuperPrivateTxTPole("задано через конструктор суперкласса");
		superobj.Show(); //метод суперкласса
		FirstSubPrivetePole subobj1=new FirstSubPrivetePole("задано через конструктор 1 подкласса",10);
		subobj1.Show(); //метод подкласса 1- переопределен
		SecondSubPrivatePole subobj2=new SecondSubPrivatePole("задано через конструтор 2 подкласса", 'A');
		subobj2.Show(); //метод подкласса 2- переопределен
		System.out.println("-----------------------------------------------------");
		System.out.println("ћетоды вызваны объектом суперкласса, который ссылаетс€ на объект подкласса:");
		superobj=subobj1; //ссылка объекта суперкласса на объект подкласса 1
		superobj.Show(); //проверка метода
		superobj=subobj2; //ссылка объекта суперкласса на объект подкласса 2
		superobj.Show(); //проверка метода		
    }
catch (Exception error) { System.out.println("ѕри обработке данных произошла ошибка!"); //обработка исключени€
		 }
	}

}
