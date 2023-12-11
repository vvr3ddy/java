### HashMap Functionality

A `HashMap` in Java is part of the Collections Framework and implements the `Map` interface. It is used to store key-value pairs. The keys are unique, and each key maps to exactly one value. The elements in a `HashMap` are not ordered, and the order may change over time.

**Key Features**:
- **Fast Access**: Provides constant-time performance for basic operations like `get` and `put`, assuming the hash function disperses elements properly across the buckets.
- **Null Values**: Allows one null key and multiple null values.
- **Unordered**: The elements are not ordered in any predictable way.
- **No Duplicate Keys**: Each key can map to at most one value.

**Commonly Used Methods**:
- `put(Key k, Value v)`: Inserts a key-value pair into the map.
- `get(Object key)`: Returns the value to which the specified key is mapped, or `null` if the map contains no mapping for the key.
- `remove(Object key)`: Removes the mapping for the specified key from the map if present.
- `containsKey(Object key)`: Returns `true` if the map contains a mapping for the specified key.
- `keySet()`: Returns a `Set` view of the keys contained in the map.
- `values()`: Returns a `Collection` view of the values contained in the map.

**Example**:
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 40);
        map.put("Banana", 10);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Price of Banana: " + map.get("Banana"));

        // Removing a key-value pair
        map.remove("Cherry");

        // Iterating over key-value pairs
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

### Print the First Non-Repeated Character

To print the first non-repeated character in a string, you can use a `HashMap` to store the count of each character and then iterate through the string to find the first character with a count of one.

**Idiomatic Java Code**:
```java
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(); // Preserves insertion order

        // Count each character
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("No non-repeated character found");
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedChar(input);
        System.out.println("The first non-repeated character is: " + result);
    }
}
```

In this code, a `LinkedHashMap` is used to count the occurrences of each character while maintaining the insertion order. Then, we iterate through the map entries to find the first character that occurs only once.
