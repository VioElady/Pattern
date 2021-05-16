package structuralPatterns.proxy;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        System.out.println("***Demo: Proxy pattern");
        AbstractSubject proxy = new Proxy("test.txt", Arrays.asList("Bob", "Mark", "Fred"));
        System.out.println(proxy.getContent());
        System.out.println(proxy.getLine(47));
        proxy.rename("Alice", "test_1.txt");
        proxy.rename("Fred", "test_1.txt");
    }
}