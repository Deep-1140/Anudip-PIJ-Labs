class Rectangle {
    // Member variables
    double width;
    double height;

    // Enum declaration
    enum Color {
        RED, GREEN, BLUE
    }

    // Member variable of type color
    Color boxColor;

    public static void main(String[] args) {
        // Print the enum value
        System.out.println(Color.BLUE);
    }
}
