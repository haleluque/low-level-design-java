package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.CommandPattern.example;

/**
 * The Command Pattern encapsulates a request as an object,
 * thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of requests.
 * It also provides support for undoable operations.
 * <p>
 * - Command: Interface for executing operations
 * - Invoker: Sends the command
 * - Receiver: Performs the operation
 * <p>
 * This pattern is particularly useful for implementing features like undo/redo, logging, and transactions
 * in your applications
 */
public class Main {
    public static void main(String[] args) {
        //receiver
        TextEditor textEditor = new TextEditor();

        //Commands
        BoldCommand boldCommand = new BoldCommand(textEditor);
        ItalicCommand italicCommand = new ItalicCommand(textEditor);

        //Calling the invoker, execute commands
        Button button = new Button();
        button.setCommand(boldCommand);
        button.pressButton();

        button.setCommand(italicCommand);
        button.pressButton();
    }
}
