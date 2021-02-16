
public class alfavit {

	public static void main(String[] args) {
	char [] rus=new char [32]; //задание русского алфавита
	char [] eng=new char [26]; //задание английского алфавита
	char [] rusalf=new char [32]; //замена русского алфавита
	char [] engalf=new char [26]; //замена английского алфавита
	for (int i=0; i<rus.length;++i) {rus[i]=(char) (1072+i);} //заполнение алфавита
	for (int i=0; i<eng.length;++i) {eng[i]=(char) (97+i);} //заполнение алфавита
	//
	for (int i=0; i<rusalf.length;++i) {if ((i % 2)==0) {rusalf[i]=(char) (9672+i);}
	else {rusalf[i]=(char) (5792+i);} } //заполнение моего алфавита
	for (int i=0; i<engalf.length;++i) {if ((i % 2)==0) {engalf[i]=(char) (5792+i);}
	else {engalf[i]=(char) (9672+i);} } //заполнение моего алфавита
	//
	for (int i=0; i<rusalf.length;++i) {System.out.print(rusalf[i]);}
	System.out.println();
	for (int i=0; i<engalf.length;++i) {System.out.print(engalf[i]);} 
	System.out.println();
	for (int i=0; i<rus.length;++i) {System.out.print(rus[i]);}
	System.out.println();
	for (int i=0; i<eng.length;++i) {System.out.print(eng[i]);}
	
	}

}
