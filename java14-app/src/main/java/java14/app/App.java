package java14.app;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().getResult(0));
    }

    public String getResult(int value) {
        return switch (value) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            default -> "OTHER";
        };
    }
}
