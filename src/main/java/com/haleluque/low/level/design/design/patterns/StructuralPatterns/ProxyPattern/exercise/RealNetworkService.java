package com.haleluque.low.level.design.design.patterns.StructuralPatterns.ProxyPattern.exercise;

/**
 * Real Subject class
 */
public class RealNetworkService implements NetworkService {
    @Override
    public String fetchData(String input) {
        return "Data fetched from remote server for input: " + input;
    }
}
