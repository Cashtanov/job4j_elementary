package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                Math.max(first, second),
                max(second, third, fourth)
        );
    }

    public static void main(String[] args) {
        int result = Max.max(5, 2);
        System.out.println(result);
    }
}
