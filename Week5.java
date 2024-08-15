//80.parameterized Constructor
public class Main {
int x;

public Main(int y){
x=y;
}
public static void main(String args[]){
Main myobj=new Main(5);
System.out.println(myobj.x);
}
}



//81.parameterized Constructor ex 2
public class Main {
int modelyear;
String modelname;
double price;
public Main(int year,String name,double amt){
modelyear=year;
modelname=name;
price=amt;
}
public static void main(String args[]){
Main myobj=new Main(1989,"Mustang",789332.564);
System.out.println(myobj.modelyear+" "+myobj.modelname+" "+myobj.price);
}
}



//82.abstract

//file1: Main.java
abstract class Main {
public String fname="john";
public int age = 24;
public abstract void study();
}

class Student extends Main{
public int graduation_year = 2018;
public void study(){
System.out.println("Studying all day long");
}
}

//file 2: Second.java

class Second {
public static void main(String args[]){
Student myobj=new Student();
System.out.println("Name: "+myobj.fname);
System.out.println("Age: "+myobj.age);
System.out.println("graduation year: "+myobj.graduation_year);
myobj.study();
}
}




//83.private

//file1: Person.java
public class Person{
private String name;
public String getname(){
return name;
}

public void setname(String newname){
this.name=newname;
}
}

//file2: Main.java
public class Main {
public static void main(String args[]){
Person myobj = new Person();
myobj.setname("John");
System.out.println(myobj.getname());
}
}


//84.Protected
//file1:Vehicle.java
class Vehicle{
protected String brand="ford";
public void honk(){
System.out.println("tuut, tuut!");
}
}

//file2:Car.java
class Car extends Vehicle {
private String modelname = "Mustang";
public static void main(String args[]){
Car myobj = new Car();
System.out.println(myobj.brand+" "+myobj.modelname);
}
}


//85.polymorphism
class Animal{
public void animalsound(){
System.out.println("the animal makes a sound");
}
}

class Pig extends Animal{
public void animalsound(){
System.out.println("The pig says: wee wee");
}
}

class Dog extends Animal{
public void animalsound(){
System.out.println("The dog says: bow wow");
}
}

class Main{
public static void main(String[] args) {
Animal myanimal =new Animal();
Animal mypig = new Pig();
Animal mydog = new Dog();

myanimal.animalsound();
mypig.animalsound();
mydog.animalsound();
}
}



//also works when the object is created as
public class Main {
public static void main(String[] args) {
Animal myAnimal = new Animal();
Pig myPig = new Pig();
Dog myDog = new Dog();

myAnimal.animalSound();
myDog.animalSound();
myPig.animalSound();
}
}




//86.nested classes:

class MyOuter{
int x = 5;
class MyInner{
int y = 10;
}
}

public class Main {
public static void main(String[] args) {
MyOuter outer = new MyOuter();
MyOuter.MyInner inner = outer.new MyInner();
System.out.println(outer.x + " " + inner.y);
}
}
 

//87.static class

class MyOuter{
int x = 5;
static class MyInner{
int y = 10;
}
}

public class Main {
public static void main(String[] args) {
MyOuter.MyInner inner = new MyOuter.MyInner();
System.out.println(inner.y);
}
}
 

//88.calling methods:

class MyOuter{
int x = 5;
public class MyInner{
public int myInnerMethod(){
return x;
}
}
}

public class Main {
public static void main(String[] args) {
MyOuter outer = new MyOuter();
MyOuter.MyInner inner = outer.new MyInner();
System.out.println(inner.myInnerMethod());
}
}
 

//89.Abstract Class:

//File1: Animal.java
abstract class Animal {
public abstract void animalSound();
public void sleep(){
System.out.println("zzZZ");
}
}

//File2: Pig.java

public class Pig extends Animal{
public void animalSound(){
System.out.println("Oink, oink");;
}
}

//File3: Main.java

public class Main {
public static void main(String[] args) {
Pig myPig = new Pig();
myPig.animalSound();
myPig.sleep();
}
}
 

//90.Interface:

//File1: Animal.java:

interface Animal {
public void animalSound();
public void sleep();
}

//Pig.java:

public class Pig implements Animal{
public void animalSound(){
System.out.println("Oink, oink");;
}
public void sleep(){
System.out.println("zzZZ");
}
}

//Main.java:

public class Main {
public static void main(String[] args) {
Pig myPig = new Pig();
myPig.animalSound();
myPig.sleep();
}
}
 

//91.Multiple implement:

interface FirstInterface {
public void myMethod();
}

interface SecondInterface{
public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
public void myMethod(){
System.out.println("Its My method");
}

public void myOtherMethod(){
System.out.println("This is my other method");
}
}

public class Main1{
public static void main(String[] args) {
DemoClass d = new DemoClass();
d.myMethod();
d.myOtherMethod();
}
}
 

//92.enum:

enum Level{
    LOW,
    MEDIUM,
    HIGH
    }
    
    public class Main {
    public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    System.out.println(myVar);
    }
    }
     

//93.Enumeration inside a class:

public class Main {
enum Level{
LOW,
MEDIUM,
HIGH
}
public static void main(String[] args) {
Level myVar = Level.MEDIUM;
System.out.println(myVar);
}
} 

//94.Using Enum for switch statements:

public class Main {
enum Level{
LOW,
MEDIUM,
HIGH
}
public static void main(String[] args) {
Level myVar = Level.MEDIUM;

switch (myVar) {
case HIGH:
System.out.println("High level");
break;

case MEDIUM:
System.out.println("Medium level");
break;

case LOW:
System.out.println("Low level");
break;
}
}
}
 


//95.Iterating through stuff in an enum:

public class Main {
enum Level{
LOW,
MEDIUM,
HIGH
}
public static void main(String[] args) {
for(Level i: Level.values()){
System.out.println(i);
}
}
}
 

//96.Printing date:

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
LocalDate myObj = LocalDate.now();
System.out.println(myObj);
}
}
