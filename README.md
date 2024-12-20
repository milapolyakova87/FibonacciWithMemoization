# Fibonacci with Memoization

Эта программа вычисляет n-е число последовательности Фибоначчи с использованием рекурсии и мемоизации для повышения эффективности.

## Описание задачи

Последовательность Фибоначчи определяется следующим образом:
- `F(0) = 0`
- `F(1) = 1`
- `F(n) = F(n-1) + F(n-2)` для `n > 1`.

Программа использует рекурсивный подход для вычисления чисел Фибоначчи, но применяет мемоизацию (сохранение уже вычисленных значений) для ускорения вычислений.

## Пример

### Ввод:

50

### Вывод:

Fibonacci(50) = 12586269025

## Как работает программа
### Рекурсия:

Программа использует рекурсивный подход для вычисления чисел Фибоначчи.

### Базовые случаи:

F(0) = 0

F(1) = 1

Рекурсивно вычисляется F(n) = F(n-1) + F(n-2).

### Мемоизация:

Для ускорения вычислений используется HashMap, который хранит уже вычисленные значения чисел Фибоначчи.

Если значение для данного n уже есть в HashMap, оно возвращается сразу, без повторного вычисления.

### Эффективность:

Без мемоизации рекурсивное вычисление чисел Фибоначчи имеет экспоненциальную сложность (O(2^n)).

С мемоизацией сложность снижается до линейной (O(n)), так как каждое число вычисляется только один раз.

### Преимущества мемоизации
Значительно ускоряет вычисления для больших значений n.

Уменьшает количество повторных вычислений, что делает программу более эффективной.

## Требования
Java Development Kit (JDK) 8 или выше.

## Контакты
Если у вас есть вопросы или предложения, свяжитесь со мной в телеграм @M1laPolyakova
