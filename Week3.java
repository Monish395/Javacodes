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
