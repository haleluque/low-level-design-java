package com.haleluque.low.level.design.design.patterns.CreationalPatterns.SingletonPattern.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {

    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warn(String message) {
        log("WARN", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.printf("%s [%s]: %s%n", timestamp, level, message);
    }
}
