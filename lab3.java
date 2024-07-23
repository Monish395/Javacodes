//boolean

public class Main{
public static void main(String[] args){
boolean isjavafun = true;
boolean isfishtasty = false;
System.out.println(isjavafun);
System.out.println(isfishtasty);
}
}



//boolean expression

public class Main{
public static void main(String[] args){
int x=10;
int y=5;
System.out.println(x>y);
}
}

//boolean expression 2

public class Main{
public static void main(String[] args){
System.out.println(10==15);
}
}

//if statement

public class Main{
public static void main(String[] args){
if(20>18)
System.out.println("20 greeater than 18");
}
}



//if - else statement

public class Main{
public static void main(String[] args){
int time=20;
if(time<18)
System.out.println("good day");
else
System.out.println("good evening");
}
}



//if - elseif - else statement

public class Main{
public static void main(String[] args){
int time=22;
if(time<10)
System.out.println("good morning");
else if(time<20)
System.out.println("good day");
else
System.out.println("good evening");
}
}



//switch case

public class Main{
public static void main(String[] args){
int day =4;
switch (day){
case 1:
System.out.println("monday");
break;

case 2:
System.out.println("tuesday");
break;

case 3:
System.out.println("wednesday");
break;

case 4:
System.out.println("thursday");
break;

case 5:
System.out.println("friday");
break;

case 6:
System.out.println("saturday");
break;

case 7:
System.out.println("sunday");
break;

default:
System.out.println("Invalid input");
}
}
}

//while loop

public class Main{
public static void main(String[] args){
int i =0;
while(i<5){
System.out.println(i);
i++;
}
}
}



//do while

public class Main{
public static void main(String[] args){
int i =0;
do{
System.out.println(i);
i++;
}
while(i<5);
}
}



//for loop

public class Main{
public static void main(String[] args){
for(int i=0;i<5;i++){
System.out.println(i);
}
}
}

//for each

public class Main{
public static void main(String[] args){
String cars[] = {"volvo","BMW","ford","mazda"};
for(String i:cars){
System.out.println(i);
}
}
}

//continue

public class Main{
public static void main(String[] args){
for(int i=0;i<10;i++){
if(i==4)
continue;
System.out.println(i);
}
}
}

//scanner
import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner myobj = new Scanner(System.in);
String username;
System.out.print("Enter username : ");
username=myobj.nextLine();
System.out.println("username is : "+username);
}
}
