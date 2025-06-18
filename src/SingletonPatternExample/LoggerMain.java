public class LoggerMain {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Same logger instance used.");
        } else {
            System.out.println("Different logger instances created.");
        }
    }
}
