
package edu.ppsu.devops;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet("DevOps"));
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}