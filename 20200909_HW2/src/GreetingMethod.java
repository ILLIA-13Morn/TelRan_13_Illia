public class GreetingMethod {
    public static void main(String[] args) {
        //static void greeting(String[] names){}
        //you have a String array, for example {Petya, Kolya, Olya, Katya}.
        //Write a method that will ask the user what is his name, if this name is in the array,
        // then the method print: “Hello, name!”.
        //And if the name is not in the array - "Sorry, we don't know each other".
        String[] names = {"Petya", "Kolya", "Olya", "Katya"};
                String input = "Maksym";
        greeting(names, input);
    }

        private static void greeting (String[]names, String input){
            for (String name : names) {
                if (input == name) {
                    System.out.println("Hallo ," + input);
                return;
            }
        }
        System.out.println("Sorry, we don't know each other");
    }
}


