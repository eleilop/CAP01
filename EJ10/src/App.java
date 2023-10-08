public class App {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String GREY = "\033[0;2m";    // GREY
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE_BC
    public static void main(String[] args) throws Exception {
        System.out.printf(PURPLE+"%s%n", "███████████████████████████████████████");
        System.out.printf(PURPLE+"%s"+RED+"%s"+PURPLE+"%s%n", "█████████████████████████", "██", "████████████");
        System.out.printf(PURPLE+"%s"+RED+"%s"+PURPLE+"%s%n", "███████████████████████", "██", "██████████████");
        System.out.printf(PURPLE+"%s"+RED+"%s"+PURPLE+"%s%n", "█████████████████████████", "██", "████████████");
        System.out.printf(PURPLE+"%s%n", "███████████████████████████████████████");
        System.out.printf(PURPLE+"%s"+PURPLE_BACKGROUND+"%s"+BLUE+"%s"+PURPLE+"%s%n", "███", "Eloy Leiva López███", "████████████", "█████");
        System.out.printf(PURPLE+"%s"+BLUE+"%s"+PURPLE+"%s"+BLUE+"%s"+PURPLE+"%s%n", "██████████████████████", "████████", "██", "██", "█████");
        System.out.printf(PURPLE+"%s"+BLUE+"%s"+PURPLE+"%s%n", "██████████████████████", "████████████", "█████");
        System.out.printf(PURPLE+"%s"+BLUE+"%s"+PURPLE+"%s%n", "██████████████████████", "████████", "█████████");
        System.out.printf(GREY+"%s"+BLUE+"%s"+GREY+"%s%n", "██████████████████████", "████████", "█████████");
        System.out.printf(GREY+"%s%n", "███████████████████████████████████████");
        System.out.printf(GREY+"%s%n", "███████████████████████████████████████");
    }
}
