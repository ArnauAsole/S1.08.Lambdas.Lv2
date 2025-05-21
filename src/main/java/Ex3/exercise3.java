package Ex3;

public class exercise3 {
    public static void main(String[] args) {
        Operation add = () -> 5 + 3;
        Operation subtract = () -> 5 - 3;
        Operation multiply = () -> 5 * 3;
        Operation divide = () -> 5f / 3;

        System.out.println("Addition: " + add.operacio());
        System.out.println("Subtraction: " + subtract.operacio());
        System.out.println("Multiplication: " + multiply.operacio());
        System.out.println("Division: " + divide.operacio());
    }
}

