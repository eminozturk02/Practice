package ReviewclassArrays;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="Marvin";
String name2="Ahmet";
//if we have to store multiple values of same type we should use arrays
String [] names;
names=new String[5];
names[0]="Farhad";
System.out.println(names[0]);
names[1]="Yogita";
System.out.println(names[1]);
names[2]="Henok";
names[3]="Psiyasri";
names[4]="Ecaterina";
//System.out.println(names[5]); out of boundary
System.out.println(names.length);

for(int i=0; i<names.length; i++){
 System.out.println(names[i]);
}System.out.println("*************************");
for(String name:names) {
	System.out.println(name);
}
System.out.println("***************************");
int i=0;
while(i<names.length) {
	System.out.println(names[i]);
	i++;
}
	
}

}
