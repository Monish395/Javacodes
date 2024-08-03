// 36. String buffer Example

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello");
sb.append("java");
System.out.println(sb);
}
}

// 37. String buffer Example2

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello ");
sb.insert(6,"java");
System.out.println(sb);
}
}

// 38. String buffer Example3

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello");
sb.replace(1,3,"java");
System.out.println(sb);
}
}



// 39. String buffer Example4
class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello");
sb.delete(1,3);
System.out.println(sb);
}
}

// 40. String buffer Example5

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("hello");
sb.reverse();
System.out.println(sb);
}
}

// 41. String buffer Example6

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());//(16*2)+2=34 i.e (old capacity*2)*2
System.out.println(sb);
}
}

// 42. String buffer Example7

class StringBufferExample{
public static void main(String args[]){
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());//(16*2)+2=34 i.e (old capacity*2)*2
sb.ensureCapacity(10);
System.out.println(sb.capacity());//34
sb.ensureCapacity(50);
System.out.println(sb.capacity());//70 , (34*2)+2
}
}

//43.String Builder example

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("hello ");
sb.append("java");
System.out.println(sb);
}
}

//44.String Builder example2

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("hello ");
sb.insert(6,"java");
System.out.println(sb);
}
}

//45.String Builder example3

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("hello ");
sb.replace(1,3,"java");
System.out.println(sb);
}
}

//46.String Builder example4

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("hello ");
sb.delete(1,3);
System.out.println(sb);
}
}

//47.String Builder example5

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("hello ");
sb.reverse();
System.out.println(sb);
}
}

//48.String Builder example6

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());//(16*2)+2=34 i.e (old capacity*2)*2
}
}

//49.String Builder example7

class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());//(16*2)+2=34 i.e (old capacity*2)*2
sb.ensureCapacity(10);
System.out.println(sb.capacity());//34
sb.ensureCapacity(50);
System.out.println(sb.capacity());//70 , (34*2)+2
}
}

//50.Third Largest number in an array

import java.util.Scanner;

public class thirdlargest_num {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len = in.nextInt();
        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=in.nextInt();
        }

        int temp=0;
        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
                if(arr[j-1]<arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("The thrid largest number in the given array is : "+arr[2]);
    }
}

//51.String tokenizer

import java.util.StringTokenizer;

public class Simple {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is khan",” ”);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    
}
//52.nextToken with delimiter

import java.util.*;

public class Simple {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my,name,is,khan");
            System.out.println("next token is : "+st.nextToken(","));
    }
    
}

//53.String tokenizer 2

import java.util.StringTokenizer;

public class Simple {
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("I am present in java lab right now\ni need to give input as a paragraph\nnow i am in third line and gonna end the string.","");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}

// 54. hasmoreElement

import java.util.StringTokenizer;

public class Simple {
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("I am present in java lab right now"," ");
while(st.hasMoreElements()){
System.out.println(st.nextToken());
}
}
}

// 55.nextElement

import java.util.StringTokenizer;

public class Simple {
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("Hello everyone have a nice day"," ");
while(st.hasMoreElements()){
System.out.println(st.nextElement());
}
}
}

// 56.countTokens

import java.util.StringTokenizer;

public class Simple {
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("Hello everyone have a nice day"," ");
System.out.println("Total number of tokens : "+st.countTokens());
}
}

// 57.Arrays

import java.util.Scanner;

public class array {
public static void main(String[] args) {
int arr[];
arr=new int[5] ;
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

for(int i=0;i<5;i++)
System.out.println("Element at index "+i+" : "+arr[i]);
}
}

// 58.Arrays example 2

class student{
    public int roll_no;
    public String name;
    public student(int i, String string) {
        this.roll_no = i;
        this.name=string;
    }
}

public class array{
    public static void main(String[] args) {
        student[] arr;
        arr=new student[5] ;
        arr[0]=new student(1,"aman");
        arr[1]=new student(2,"vaibhav");
        arr[2]=new student(3,"shikar");
        arr[3]=new student(4,"dharmesh");
        arr[4]=new student(5,"mohit");

        for(int i=0;i<arr.length;i++)
            System.out.println("Element at index "+i+" : "+arr[i].roll_no+" "+arr[i].name);
    }
}

