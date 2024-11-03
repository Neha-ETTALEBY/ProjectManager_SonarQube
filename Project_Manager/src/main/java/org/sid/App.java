package org.sid;

/**
 * Hello world!
 *
 */
import java.util.logging.Logger;

class App {

    Logger logger = Logger.getLogger(getClass().getName());

    public void doSomething() {
        // ...
        logger.info("My Message");  // Compliant, output via logger
        // ...
    }
}