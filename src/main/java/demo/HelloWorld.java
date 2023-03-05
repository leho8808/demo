package demo;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHello());
    }
}
