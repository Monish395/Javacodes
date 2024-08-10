//59.Array ex3
class Student{
public String name;
Student(String name){
this.name =name;
}
public String toString(){
return name;
}
}

public class Array {
public static void main(String args[]){
Student[] mystudents = new Student[]{new Student("dharma"),new Student("sanvi"),new Student("rupa"),new Student("Ajay")};
for(Student m:mystudents){
System.out.println(m);
}
}
}

//60.Array ex4
public class Array {
public static void main(String args[]){
int[] arr = new int[4];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
System.out.println("Trying to access element outside the size of array");
System.out.println(arr[5]);
}
}

//61.array ex 5
public class twod_array {
public static void main(String args[]){
int[][] arr = new int[10][20];
arr[0][0]=1;
System.out.println("arr[0][0] = "+arr[0][0]);
}
}

//62.array ex 6
public class Threed_array {
public static void main(String args[]){
int[][][] arr = new int[10][20][30];
arr[0][0][0]=1;
System.out.println("arr[0][0][0] = "+arr[0][0][0]);
}
}

//63.array ex 7
public class test {
public static void main(String args[]){
int arr[] = {3,1,2,5,4};
sum(arr);
}
public static void sum(int[] arr) {
int sum=0;
for(int i=0;i<arr.length;i++){
sum+=arr[i];
}
System.out.println("Sum of array values: "+sum);
}
}

//64.array ex 8
public class test {
public static void main(String args[]){
int arr[] = m1();
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
}
public static int[] m1() {
return new int[]{1,2,3};
}
}

//65.array ex 9
public class test {
public static void main(String args[]){
int intarr[] = new int[3];
byte bytearr[]=new byte[3];
short shortarr[]=new short[3];
String[] strArray = new String[3];
System.out.println(intarr.getClass());
System.out.println(intarr.getClass().getSuperclass());
System.out.println(bytearr.getClass());
System.out.println(shortarr.getClass());
System.out.println(strArray.getClass());
}
}

//66.array ex 10
public class test {
public static void main(String args[]){
int intArray[] = {1,2,3};
int cloneArray[]=intArray.clone();
System.out.println(intArray==cloneArray);
for(int i=0;i<cloneArray.length;i++){
System.out.println(cloneArray[i]+" ");
}
}
}

//67.array ex 11
public class Test {
public static void main(String args[]){
int intArray[][] = {{1,2,3},{4,5}};
int cloneArray[][]=intArray.clone();
System.out.println(intArray==cloneArray);
System.out.println(intArray[0]==cloneArray[0]);
System.out.println(intArray[1]==cloneArray[1]);
}
}

//68.Class ex 1
public class Main {
int x=5;
public static void main(String args[]){
Main myobj=new Main();
System.out.println(myobj.x);
}
}

//69.class ex 2
public class Main {
int x=5;
public static void main(String args[]){
Main myobj=new Main();
Main myobj2=new Main();
System.out.println(myobj.x);
System.out.println(myobj2.x);
}
}

//70.class ex3
file 1:Main.java
public class Main {
int x=5;
}
file 2: Second.java
public class Second {
public static void main(String args[]){
Main myobj=new Main();
System.out.println(myobj.x);
}
}

//71.class ex4
public class Main {
int x;
public static void main(String args[]){
Main myobj=new Main();
myobj.x=40;
System.out.println(myobj.x);
}
}

//72.class ex5
public class Main {
int x=10;
public static void main(String args[]){
Main myobj=new Main();
myobj.x=25;
System.out.println(myobj.x);
}
}

//73.class ex6
public class Main {
final int x=10;
public static void main(String args[]){
Main myobj=new Main();
myobj.x=25;
System.out.println(myobj.x);
}
}

//74.class ex7
public class Main {
int x=5;
public static void main(String args[]){
Main myobj=new Main();
Main myobj2=new Main();
myobj2.x=25;
System.out.println(myobj.x);
System.out.println(myobj2.x);
}
}

//75.class ex8
public class Main {
String fname="john";
String lname="doe";
int age=24;
public static void main(String args[]){
Main myobj=new Main();
System.out.println("Name: "+myobj.fname+" "+myobj.lname);
System.out.println("Age :"+myobj.age);
}
}

//76.class ex9
public class Main {
static void mymethod(){
System.out.println("Hello World!");
}
public static void main(String args[]){
mymethod();
}
}

//77.class ex10 (public vs static)
public class Main {
static void mymethod(){
System.out.println("Static methods can be called without creating objects");
}
public void publicmymethod(){
System.out.println("Public methods must be called by creating objects");
}
  
public static void main(String args[]){
mymethod();
Main myobj=new Main();
myobj.publicmymethod();
}
}

//78.class ex 11
public class Main {
public void fullthrottle(){
System.out.println("The car is going as fast as it can!");
}
public void speed(int maxspeed){
System.out.println("Max speed is : "+maxspeed);
}
public static void main(String args[]){
Main mycar=new Main();
mycar.fullthrottle();
mycar.speed(200);
}
}

//79.constructor
public class Main {
int x;
public Main(){
x=5;
}
public static void main(String args[]){
Main myobj=new Main();
System.out.println(myobj.x);
}
}
