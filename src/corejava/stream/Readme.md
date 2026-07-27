# 🔥 Most Asked Java Stream Theory Interview Questions

## 1. What is a Stream in Java?
- A Stream is a sequence of elements for processing data.
- It does not store data.
- Supports functional and declarative programming.
- Used for pipelines like filter → map → collect.

---

## 2. Difference between Collection and Stream
- Collection stores data; Stream processes data.
- Collection is eager; Stream is lazy.
- Stream cannot be reused.
- Stream does not modify original data.

---

## 3. What is lazy evaluation in Streams?
- Intermediate operations are not executed immediately.
- Execution happens only when a terminal operation is called.

---

## 4. What are intermediate and terminal operations?

### Intermediate operations:
- filter()
- map()
- sorted()
- distinct()

### Terminal operations:
- collect()
- forEach()
- reduce()
- count()

---

## 5. Can a Stream be reused?
- ❌ No.
- A stream is consumed once a terminal operation is executed.

---

## 6. Difference between map() and flatMap()
- map() → 1-to-1 transformation
- flatMap() → 1-to-many + flattens structure

---

## 7. Difference between filter() and map()
- filter() → selects elements based on condition
- map() → transforms elements

---

## 8. What is the purpose of collect()?
- Converts Stream into Collection.
- Terminal operation.
- Used with Collectors like toList(), groupingBy(), etc.

---

## 9. Difference between findFirst() and findAny()
- findFirst() → returns first element (deterministic)
- findAny() → returns any element (useful in parallel streams)

---

## 10. What is Optional in Streams?
- Used to avoid NullPointerException.
- Represents presence or absence of value.

---

## 11. What is parallel stream?
- stream() → sequential processing
- parallelStream() → multi-threaded processing

---

## 12. When to use parallel stream?
- Large datasets
- CPU-intensive operations
- Independent operations

Avoid when:
- Small datasets
- Order matters

---

## 13. What is reduce()?
- Used to aggregate elements into a single result.
- Examples: sum, max, concatenation.

---

## 14. Difference between map and reduce
- map → transforms data
- reduce → aggregates data

---

## 15. What are Collectors?
- Utility class used with collect().
- Examples:
    - groupingBy()
    - joining()
    - counting()

---

## 16. What is groupingBy?
- Groups elements based on a classifier.
- Returns Map<K, List<V>>.

---

## 17. What is partitioningBy?
- Splits data into two groups (true/false).
- Based on a predicate.

---

## 18. Are Streams mutable or immutable?
- Streams are immutable.
- They do not modify the source data.

---

## 19. What is a Stream pipeline?
- Source → Intermediate operations → Terminal operation

Example:
- List → filter → map → collect

---

## 20. Advantages of Streams
- Cleaner and readable code
- Less boilerplate
- Functional programming style
- Supports parallel processing
- Declarative approach