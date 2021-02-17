package de.telran.operation;

public class LowerCase implements IStringOperation{
    private static String name = "to Lower Case";

    @Override
    public String operate(String input) {
        return input.toLowerCase();
    }

    @Override
    public String getName() {
        return "lower_case";
    }
}
