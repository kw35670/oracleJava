package chap7;

public class s1 {
    public static void main(String[] args) {
        System.out.println("Foo()");
        Foo f1 = new Foo();
        
        System.out.println("Foo(\"helle\")");
        Foo f2 = new Foo("hey");
        
        System.out.println("Foo(\"bye\"), 200");
        Foo f3 = new Foo("bye", 200);
    }
}
class Foo {
    String s;
    int i;
    
    public Foo() {
        this("hello");
    }
    
    public Foo(String s) {
        this(s, 1);
    }

    public Foo(String s, int i) {
        this.s = s;
        this.i = i;
        System.out.println("String:" + this.s);
        System.out.println("int:" + this.i);
    }
}