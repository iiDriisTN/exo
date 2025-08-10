public class LogLevels {
    
    public static String message(String logLine) {
        int colon = logLine.indexOf(':');
        return logLine.substring(colon +1).trim();
    }

    public static String logLevel(String logLine) {
        int x = logLine.indexOf('[')+1;
        int y = logLine.indexOf(']');
        return logLine.substring(x,y).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
