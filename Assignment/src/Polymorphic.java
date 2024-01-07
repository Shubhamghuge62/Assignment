package com.extra;

//Shape class representing a basic shape
class Shape {
 // Method to draw a shape (to be overridden by subclasses)
 public void draw() {
     System.out.println("Drawing a shape");
 }
}

//Circle class, a subclass of Shape, representing a circle
class Circle extends Shape {
 // Overriding the draw method to specify how to draw a circle
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

//Polymorphic class to demonstrate polymorphism with the Shape and Circle classes
public class Polymorphic {
 public static void main(String[] args) {
     // Creating a polymorphic object: a Shape reference pointing to a Circle object
     Shape myShape = new Circle();

     // Calling the draw method using polymorphism
     // The actual method called depends on the runtime type of the object (Circle in this case)
     myShape.draw();
 }
}
