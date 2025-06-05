package Latihans.BattleShip;

public class Square {
    public static void main(String[] args) {
        int statusCode = 200;
        String message = switch (statusCode) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            default -> "Unknown";
        };
        System.out.println(message);
    }
}
