package se.lexicon;

public class App {

    private String[] names = new String[] {"James", "John Smith", "Ginny", "Georgia"};

    public String findname(String nameToFind) {
        for (String name : names) {
            if (name.equalsIgnoreCase(nameToFind)) {
                return name;
            }
        }
        return "Error: No match!";
    }
}
