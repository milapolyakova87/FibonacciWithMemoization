package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithMemoization {

    // Хэш-таблица для хранения уже вычисленных значений Фибоначчи
    private static Map<Integer, Long> memo = new HashMap<>();

    // Метод для вычисления n-го числа Фибоначчи с использованием мемоизации
    public static long fibonacci(int n) {
        // Базовые случаи
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Проверяем, было ли уже вычислено это значение
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Рекурсивно вычисляем значение
        long result = fibonacci(n - 1) + fibonacci(n - 2);

        // Сохраняем результат в хэш-таблице
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 50; // Пример: вычисление 50-го числа Фибоначчи

        // Вычисляем и выводим результат
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}