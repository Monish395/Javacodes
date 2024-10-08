//string concatenation

public class Main {
    public static void main(String args[]){
        String firstname = "john";
        String lastname = "doe";
        System.out.println(firstname+" "+lastname);
    }
}

//string concatenation 2

public class Main {
    public static void main(String args[]){
        String firstname = "john";
        String lastname = "doe";
        System.out.println(firstname.concat(lastname));
    }
}

// String concatenation 3

public class Main {
    public static void main(String args[]){
        String x = "10";
        int y = 20;
        String z= x+y;
        System.out.println(z);
    }
}

//Escape sequence “/”

public class Main {
    public static void main(String args[]){
        String x = "we are so called \"vikings\"" +
                "from the north";
        System.out.println(x);
    }
}

// Math - max

public class Main {
    public static void main(String args[]){
        System.out.println(Math.max(5,10));
    }
}

//Math - min

public class Main {
    public static void main(String args[]){
        System.out.println(Math.min(5,10));
    }
}

//Math – sqrt

public class Main {
    public static void main(String args[]){
        System.out.println(Math.sqrt(64));
    }
}

//Math – absolute

public class Main {
    public static void main(String args[]){
        System.out.println(Math.abs(-4.561));
    }
}

//Math -  random

public class Main {
    public static void main(String args[]){
        System.out.println(Math.random());
    }
}

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

//strings

public class Main{
public static void main(String[] args){
char[] helloarray = {'h','e','l','l','o'};
String hellostring = new String(helloarray);
System.out.println(hellostring);
}
}

//Calculator

import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int choice,flag=0;
        float num,res=0;

        System.out.println(">>>>>>>>>>>>>>> Calculator <<<<<<<<<<<<<<<<\n");
        while (true) {
            boolean flag_2=true;
            System.out.println("Menu\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");

            System.out.print("Enter choice for operation : ");
            choice = in.nextInt();

            if (choice == 5){
                System.out.println("Exiting...");
                break;  
            }

            else if(choice > 5){
                System.out.println("Invalid Choice\n");
            }

            else{
                if(flag == 0){
                System.out.print("Enter number  : ");
                num = in.nextInt();
                res = num;
                }

                System.out.print("Enter number  : ");
                num = in.nextInt();

                switch (choice) {

                case 1:
                res += num;
                break;

                case 2:
                res -= num;
                break;

                case 3:
                res *= num;
                break;

                case 4:
                if (num==0){
                    flag_2=false;
                    System.out.println("Can't divide by Zero");
                    break;
                }

                else{
                res /= (float)num;
                break;
                }

                default:
                continue;
                }

                if (flag_2)
                System.out.println("Total = "+res);
                System.out.print("\nDo you want to continue(y/n) : ");
                char ctn;
                ctn=in.next().charAt(0);
                if((ctn == 'n')||(ctn == 'N')){
                    System.out.println("Exiting...");
                    break;
                }
                
                flag++;

            }
            
        }

    } 
    
}
