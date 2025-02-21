package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.example;

/**
 * The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.
 * It’s used to create a representative object (the proxy) that controls access to another object.
 * Proxies can be used for various purposes like lazy initialization, access control, logging, or remote object representation.
 * <p>
 * - Subject Interface: This defines the common interface for both the RealSubject and the Proxy.
 * - RealSubject: The actual object that the proxy represents.
 * - Proxy: The proxy object that controls access to the RealSubject.
 * <p>
 * Benefits:
 * - Lazy initialization
 * - Access Control
 * - Additional Behavior (logging, catching)
 * - Separation of concerns
 */
public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("dog.png");
        Image img2 = new ProxyImage("cat.png");
        // loaded lazily when needed
        img1.display();
        img1.display();// second time is not loaded from disk, cached
        img2.display();
    }
}
