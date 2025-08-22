package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    // (Suma de dos enteros)
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    // (Verificar si un número es par o impar)
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    // (Máximo de dos números)
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Factorial of a Number
    // (Factorial de un número)
    public int factorial(int n) {
        if (n < 0) return -1; // caso inválido
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Count Characters in a String
    // (Contar caracteres en un string)
    public int countChars(String input) {
        return (input == null) ? 0 : input.length();
    }

    // 6. Reverse a String
    // (Invertir un string)
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 7. Check Prime Number
    // (Verificar si un número es primo)
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    // (Encontrar el elemento más pequeño en un array)
    public int findMin(int[] array) {
        if (array == null || array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    // (Suma de elementos en un array)
    public int arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    // (Convertir de Celsius a Fahrenheit)
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 11. Sum of Elements in a List
    // (Suma de elementos en una lista)
    public int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    // (Encontrar el elemento más grande en una lista)
    public int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) max = num;
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    // (Filtrar números pares de una lista)
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) evens.add(num);
        }
        return evens;
    }

    // 14. Concatenate Two Lists
    // (Concatenar dos listas)
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // 15. Check if List Contains Element
    // (Verificar si la lista contiene un elemento)
    public boolean listContains(List<String> list, String element) {
        return list.contains(element);
    }

    // 16. Convert Strings to Uppercase
    // (Convertir strings a mayúsculas)
    public List<String> toUpperCase(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.toUpperCase());
        }
        return result;
    }

    // 17. Remove Duplicates from a List
    // (Eliminar duplicados de una lista)
    public List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    // 18. Convert List to Set for Unique Elements
    // (Convertir lista a conjunto para elementos únicos)
    public Set<Integer> listToSet(List<Integer> list) {
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    // (Verificar si un mapa contiene una clave)
    public boolean mapContainsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    // (Verificar si un mapa contiene un valor)
    public boolean mapContainsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    // (Iterar sobre un mapa y devolver lista de pares clave -> valor)
    public List<String> iterateMap(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.add(entry.getKey() + " -> " + entry.getValue());
        }
        return result;
    }
}
