package mypackage;

public class methods {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    public static void main(String[] args) {
        methods obj1 = new methods();
        obj1.privateMethod();  // Compilation error: private access modifier
        obj1.defaultMethod();  // Accessible within the same package
        obj1.protectedMethod();  // Accessible within the same package and subclasses
        obj1.publicMethod();  // Accessible anywhere

        System.out.println(obj1.privateVar);  // Compilation error: private access modifier
        System.out.println(obj1.defaultVar);  // Accessible within the same package
        System.out.println(obj1.protectedVar);  // Accessible within the same package and subclasses
        System.out.println(obj1.publicVar);  // Accessible anywhere
    }
}

package mypackage2;

import mypackage.methods;

public class MyClass2 extends methods{
    public static void main(String[] args) {
        MyClass2 obj2 = new MyClass2();
        obj2.privateMethod();  // Compilation error: private access modifier
        obj2.defaultMethod();  // Accessible within the same package
        obj2.protectedMethod();  // Accessible within the same package and subclasses
        obj2.publicMethod();  // Accessible anywhere

        // System.out.println(obj2.privateVar);  // Compilation error: private access modifier
        // System.out.println(obj2.defaultVar);  // Compilation error: default access modifier is not accessible outside the package
        System.out.println(obj2.protectedVar);  // Accessible within the same package and subclasses
        System.out.println(obj2.publicVar);  // Accessible anywhere
    }
}

