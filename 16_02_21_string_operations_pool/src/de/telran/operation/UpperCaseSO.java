package de.telran.operation;

public class UpperCaseSO implements IStringOperation{

    private static String name = "to Upper Case";

    @Override
    public String operate(String input) {
        return input.toUpperCase();
    }

    @Override
    public String getName() {
        return "upper_case";
    }
}
