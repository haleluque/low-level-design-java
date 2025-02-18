package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.example;

/**
 * The Observer Pattern defines a one-to-many relationship between objects (Subjects) so that when one object changes state,
 * all its dependents (Observers) are notified and updated automatically.
 * It's often used to implement distributed event-handling systems. Also, it's called Publisher/Subscriber pattern
 * <p>
 * Benefits of the Observer Pattern
 * - Loose Coupling: The subject does not need to know about the specific Observer.
 * - Scalability: New Observers can be implemented or removed without changing the Subject
 * - Flexibility: Observers can be added or removed at runtime
 * <p>
 * Use cases:
 * - Event Listeners: GUI frameworks use Observer Pattern to implement events like button clicks, input changes etc.
 * - Stock Price Monitoring: When stock prices changes, multiple systems are notified.
 * - New publishing Systems: News articles are published (subject) and users (Observers) are notified.
 * - Social Media
 * - Logging System
 */
public class Main {
    public static void main(String[] args) {
        //Create a publisher
        WeatherStationSubjectWeatherStation weatherStation = new WeatherStationSubjectWeatherStation();

        //Create subscribers
        DisplayDeviceObserver displayDeviceObserver = new DisplayDeviceObserver("samsung");
        MobileDevice mobileDevice = new MobileDevice();

        //Attach - Loose coupling
        weatherStation.attach(displayDeviceObserver);
        weatherStation.attach(mobileDevice);

        //Set temp
        weatherStation.setTemperature(25);

        //Detach
        weatherStation.detach(mobileDevice);

        //Set temp
        weatherStation.setTemperature(30);
    }


}
