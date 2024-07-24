//type casting

public class Main{
public static void main(String[] args) {
String name="John";
int myint = 395;
double mydouble = myint;
System.out.println("int : "+myint);
System.out.println("double : "+mydouble);
}
}

//explicit type casting

public class Main{
public static void main(String[] args) {
double mydouble = 9.78d;
int myint = (int)mydouble;
System.out.println("int : "+myint);
System.out.println("double : "+mydouble);
}
}

//operator -> +

public class Main{
public static void main(String[] args){
int s1 = 100+20;
int s2 = s1+50;
int s3 = s1+s2;
System.out.println("s1 : "+s1);
System.out.println("s2 : "+s2);
System.out.println("s3 : "+s3);
}
}

//ternary operator ?:

public class Main{
public static void main(String[] args){
int x,y;
x=20;
y=(x==1)?61:90;
System.out.println("y : "+y);
y=(x==20)?61:90;
System.out.println("y : "+y);
}
}

//length of a string

public class Main{
public static void main(String[] args){
String txt = "hello world";
System.out.println("the length of the string is : "+txt.length());
}
}


//case conversions

public class Main{
public static void main(String[] args){
String txt = "hello world";
System.out.println("uppercase : "+txt.toUpperCase());
System.out.println("lowercase : "+txt.toLowerCase());
}
}


//index of a char/string

public class Main{
public static void main(String[] args){
String txt = "Please locate where 'locate' occurs!";
System.out.println("index : "+txt.indexOf("locate"));
}
}

