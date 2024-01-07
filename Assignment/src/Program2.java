package com.extra;

class A1 {
    // Private method that cannot be overridden by child classes
    private void nonOverridableMethod() {
        System.out.println("This method cannot be overridden by child classes.");
    }

    // Public method that can be used within the same class
    public void useNonOverridableMethod() {
        nonOverridableMethod();
    }
}

class B1 extends A1 {
	
    
    // Uncommenting the code below will cause a compilation error
    /*
    @Override
    private void nonOverridableMethod() {
        System.out.println("This won't compile!");
    }
    */
}

public class Program2 {
    public static void main(String[] args) {
        // Creating an instance of class A
        A1 a = new A1();

        // Using the nonOverridableMethod from class A
        a.useNonOverridableMethod();

        // Creating an instance of class B
        B1 b = new B1();

        // Using the nonOverridableMethod from class B with try-catch block
        b.useNonOverridableMethod();
    }
}
