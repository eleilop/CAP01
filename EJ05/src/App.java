public class App {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static void main(String[] args) throws Exception {
        System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Lunes","Martes","Miérc.","Jueves","Viernes");
        System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "=====","======","======","======","=======");
        System.out.printf(BLUE+"%-8s"+CYAN+"%-8s%-8s"+BLUE+"%-8s"+GREEN+"%-8s%n", "PROG","LM","LM","PROG","FOL");
        System.out.printf(BLUE+"%-8s"+CYAN+"%-8s%-8s"+BLUE+"%-8s"+GREEN+"%-8s%n", "PROG","LM","LM","PROG","FOL");
        System.out.printf(BLUE+"%-8s"+RED+"%-8s"+BLUE+"%-8s%-8s"+GREEN+"%-8s%n", "PROG","BD","PROG","PROG","FOL");
        System.out.printf(YELLOW+"%-8s"+RED+"%-8s"+BLUE+"%-8s"+RED+"%-8s"+YELLOW+"%-8s%n", "SI","BD","PROG","BD","SI");
        System.out.printf("%-8s"+PURPLE+"%-8s"+RED+"%-8s%-8s"+YELLOW+"%-8s%n", "SI","ED","BD","BD","SI");
        System.out.printf("%-8s"+PURPLE+"%-8s"+RED+"%-8s"+PURPLE+"%-8s"+YELLOW+"%-8s%n"+RESET, "SI","ED","BD","ED","SI");
    }
}