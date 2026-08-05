# HashMap vs LinkedHashMap

## What is HashMap?

`HashMap` is a Java collection that stores data as **key-value pairs**.

- Average lookup: **O(1)**
- Does **not** maintain any order.
- Allows **one null key** and multiple null values.
- Not synchronized.

### Example

```
Map<Integer, String> map = new HashMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

### Output

```
{2=B, 1=A, 3=C}
```

> The order is **not guaranteed** and may vary.

---

# What is LinkedHashMap?

`LinkedHashMap` extends `HashMap`.

It stores key-value pairs like `HashMap` but also maintains the order of entries.

It internally uses:

- Hash Table
- Doubly Linked List

This provides:
- Fast lookup (**O(1)**)
- Predictable iteration order

---

## Internal Structure

```
          Hash Table

 1 ------------> Node
 2 ------------> Node
 3 ------------> Node


        Doubly Linked List

Head

3 ⇄ 1 ⇄ 2

Tail
```

- Hash Table → Fast lookup
- Doubly Linked List → Maintains order

---

# LinkedHashMap Example

```
Map<Integer, String> map = new LinkedHashMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
```

Output

```
{3=C, 1=A, 2=B}
```

Insertion order is preserved.

---

# Difference Between HashMap and LinkedHashMap

| Feature | HashMap | LinkedHashMap |
|----------|----------|---------------|
| Ordering | No order | Maintains insertion/access order |
| Lookup | O(1) | O(1) |
| Internal DS | Hash Table | Hash Table + Doubly Linked List |
| Memory | Less | Slightly more |
| Iteration | Unpredictable | Predictable |
| Null Key | One allowed | One allowed |
| Null Values | Multiple allowed | Multiple allowed |

---

# Why LinkedHashMap Uses More Memory

Each node stores two additional references:

```
before
after
```

These pointers create the doubly linked list.

---
# HashMap vs LinkedHashMap vs TreeMap

| Feature | HashMap | LinkedHashMap | TreeMap |
|----------|----------|---------------|----------|
| Order | No | Insertion / Access | Sorted |
| Lookup | O(1) | O(1) | O(log n) |
| Internal DS | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |
| Null Key | Yes | Yes | No (natural ordering) |
| Memory | Less | More | Moderate |
| Best Use | Fast lookup | Ordered iteration / LRU Cache | Sorted data |

---

# WeakHashMap

`WeakHashMap` is a `Map` implementation where **keys are stored as weak references**.

If a key is **no longer referenced anywhere else in the application**, the **Garbage Collector (GC)** can automatically remove that entry from the map.

---

## Internal Data Structure

* Hash Table
* Keys stored as **Weak References**

---

## Example

```
Map<Object, String> map = new WeakHashMap<>();

Object key = new Object();

map.put(key, "Java");

System.out.println(map.size()); // 1

key = null;

System.gc();

System.out.println(map.size()); // May become 0
```

Since there is no strong reference to `key`, the GC can remove it along with its value.

---

## HashMap vs WeakHashMap

| Feature          | HashMap          | WeakHashMap                             |
| ---------------- | ---------------- | --------------------------------------- |
| Key Reference    | Strong Reference | Weak Reference                          |
| GC Removes Entry | ❌ No             | ✅ Yes (if key has no strong references) |
| Null Key         | One allowed      | One allowed                             |
| Null Values      | Multiple allowed | Multiple allowed                        |
| Thread Safe      | No               | No                                      |
| Internal DS      | Hash Table       | Hash Table + Weak References            |

---

## Use Cases

* Caching
* Metadata associated with objects
* Memory-sensitive applications
* Avoiding memory leaks

---

## Interview Question

**Q: What happens if the key has no strong reference?**

**Answer:** The Garbage Collector can reclaim the key, and the corresponding map entry is automatically removed.

---

## Time Complexity

| Operation     | Complexity   |
| ------------- | ------------ |
| put()         | O(1) average |
| get()         | O(1) average |
| remove()      | O(1) average |
| containsKey() | O(1) average |

---

## Key Point for Interviews

> **HashMap** keeps entries until you remove them explicitly.
> **WeakHashMap** allows the Garbage Collector to automatically remove entries when their keys are no longer strongly referenced elsewhere.
----

# Frequently Asked Interview Questions

## 1. Why does LinkedHashMap use a Doubly Linked List?

To maintain insertion or access order while still providing O(1) lookup.

---

## 2. Why not use only a HashMap?

HashMap provides O(1) lookup but does not maintain any order.

---

## 3. Why not use only a LinkedList?

Searching for a key in a LinkedList takes O(n).

---

## 4. Can LinkedHashMap implement an LRU Cache?

Yes.

Configure:

```
new LinkedHashMap<>(capacity, 0.75f, true)
```

and override:

```
removeEldestEntry()
```

---

## 5. Is LinkedHashMap thread-safe?

No.

Use:

```
Collections.synchronizedMap(new LinkedHashMap<>());
```

or use `ConcurrentHashMap` if ordering is not required.

---
# Difference between hashtable and concurrent hashmap and synchronized map

| Feature          | Hashtable                           | `Collections.synchronizedMap()`                                      | ConcurrentHashMap                                          |
| ---------------- | ----------------------------------- | -------------------------------------------------------------------- | ---------------------------------------------------------- |
| Thread Safety    | Yes                                 | Yes                                                                  | Yes                                                        |
| Locking          | Entire table is locked              | Entire map is locked                                                 | Fine-grained locking / CAS                                 |
| Read Operations  | Synchronized                        | Synchronized                                                         | Mostly lock-free                                           |
| Write Operations | One thread at a time                | One thread at a time                                                 | Multiple threads can update different buckets concurrently |
| Performance      | Slower                              | Slower                                                               | Faster under concurrent access                             |
| Null Key         | Not allowed                         | Same as underlying map (e.g., `HashMap` allows one null key)         | Not allowed                                                |
| Null Value       | Not allowed                         | Same as underlying map (e.g., `HashMap` allows multiple null values) | Not allowed                                                |
| Iterator         | Fail-fast (`Enumeration` is legacy) | Must manually synchronize during iteration                           | Weakly consistent (no `ConcurrentModificationException`)   |
| Introduced       | Java 1.0                            | Java 1.2                                                             | Java 5                                                     |
| Use Case         | Legacy synchronized map             | Making an existing map thread-safe                                   | High-performance concurrent applications                   |

# Time Complexity Cheat Sheet

## Searching Algorithms

| Algorithm     | Best | Average  | Worst    | Space |
| ------------- | ---- | -------- | -------- | ----- |
| Linear Search | O(1) | O(n)     | O(n)     | O(1)  |
| Binary Search | O(1) | O(log n) | O(log n) | O(1)  |

---

# Sorting Algorithms

| Algorithm      | Best        | Average     | Worst       | Space    | Stable  |
| -------------- | ----------- | ----------- | ----------- | -------- | ------- |
| Bubble Sort    | O(n)        | O(n²)       | O(n²)       | O(1)     | ✅ Yes   |
| Selection Sort | O(n²)       | O(n²)       | O(n²)       | O(1)     | ❌ No    |
| Insertion Sort | O(n)        | O(n²)       | O(n²)       | O(1)     | ✅ Yes   |
| Merge Sort     | O(n log n)  | O(n log n)  | O(n log n)  | O(n)     | ✅ Yes   |
| Quick Sort     | O(n log n)  | O(n log n)  | O(n²)       | O(log n) | ❌ No    |
| Heap Sort      | O(n log n)  | O(n log n)  | O(n log n)  | O(1)     | ❌ No    |
| Counting Sort  | O(n + k)    | O(n + k)    | O(n + k)    | O(n + k) | ✅ Yes   |
| Radix Sort     | O(d(n + k)) | O(d(n + k)) | O(d(n + k)) | O(n + k) | ✅ Yes   |
| Bucket Sort    | O(n + k)    | O(n + k)    | O(n²)       | O(n + k) | Depends |

> **k** = Range of input values
> **d** = Number of digits

---

# Java Collections Time Complexity

## List

| Collection | get() | add() End | add(index) | remove(index) | contains() | Internal DS        |
| ---------- | ----- | --------- | ---------- | ------------- | ---------- | ------------------ |
| ArrayList  | O(1)  | O(1)*     | O(n)       | O(n)          | O(n)       | Dynamic Array      |
| LinkedList | O(n)  | O(1)      | O(n)       | O(n)          | O(n)       | Doubly Linked List |

> *Amortized O(1)

---

## Stack

| Operation | Complexity |
| --------- | ---------- |
| push()    | O(1)       |
| pop()     | O(1)       |
| peek()    | O(1)       |
| search()  | O(n)       |

---

## Queue

| Collection    | offer()/add() | poll()/remove() | peek() | Internal DS    |
| ------------- | ------------- | --------------- | ------ | -------------- |
| PriorityQueue | O(log n)      | O(log n)        | O(1)   | Binary Heap    |
| ArrayDeque    | O(1)          | O(1)            | O(1)   | Circular Array |

---

## Set

| Collection    | add()    | remove() | contains() | Ordering        | Internal DS    |
| ------------- | -------- | -------- | ---------- | --------------- | -------------- |
| HashSet       | O(1)     | O(1)     | O(1)       | No              | HashMap        |
| LinkedHashSet | O(1)     | O(1)     | O(1)       | Insertion Order | LinkedHashMap  |
| TreeSet       | O(log n) | O(log n) | O(log n)   | Sorted          | Red-Black Tree |

---

## Map

| Collection        | put()    | get()    | remove() | Ordering                 | Internal DS                     |
| ----------------- | -------- | -------- | -------- | ------------------------ | ------------------------------- |
| HashMap           | O(1)     | O(1)     | O(1)     | No                       | Hash Table                      |
| LinkedHashMap     | O(1)     | O(1)     | O(1)     | Insertion / Access Order | Hash Table + Doubly Linked List |
| TreeMap           | O(log n) | O(log n) | O(log n) | Sorted by Key            | Red-Black Tree                  |
| Hashtable         | O(1)     | O(1)     | O(1)     | No                       | Hash Table                      |
| ConcurrentHashMap | O(1)     | O(1)     | O(1)     | No                       | Concurrent Hash Table           |

---

# Tree Traversal

| Traversal         | Time | Space |
| ----------------- | ---- | ----- |
| Inorder           | O(n) | O(h)  |
| Preorder          | O(n) | O(h)  |
| Postorder         | O(n) | O(h)  |
| Level Order (BFS) | O(n) | O(n)  |

> **h** = Height of the tree

---

# Graph Traversal

| Algorithm | Time     | Space |
| --------- | -------- | ----- |
| BFS       | O(V + E) | O(V)  |
| DFS       | O(V + E) | O(V)  |

> **V** = Vertices
> **E** = Edges

---

# Frequently Asked Interview Problems

| Problem                                  | Time                     | Space       |
| ---------------------------------------- | ------------------------ | ----------- |
| Reverse Array                            | O(n)                     | O(1)        |
| Reverse String                           | O(n)                     | O(1)        |
| Palindrome Check                         | O(n)                     | O(1)        |
| Two Sum (HashMap)                        | O(n)                     | O(n)        |
| Character Frequency (HashMap)            | O(n)                     | O(n)        |
| Remove Duplicates (HashSet)              | O(n)                     | O(n)        |
| Move Zeros                               | O(n)                     | O(1)        |
| Rotate Array (Reverse Method)            | O(n)                     | O(1)        |
| Maximum Subarray (Kadane's Algorithm)    | O(n)                     | O(1)        |
| Longest Consecutive Sequence             | O(n)                     | O(n)        |
| Binary Search                            | O(log n)                 | O(1)        |
| Merge Two Sorted Arrays                  | O(n + m)                 | O(n + m)    |
| LRU Cache (HashMap + Doubly Linked List) | get(): O(1), put(): O(1) | O(capacity) |

---

## ⭐ Must Remember for Java Interviews

| Collection        | Internal Data Structure         |
| ----------------- | ------------------------------- |
| ArrayList         | Dynamic Array                   |
| LinkedList        | Doubly Linked List              |
| Vector            | Dynamic Array                   |
| Stack             | Vector                          |
| HashMap           | Hash Table                      |
| LinkedHashMap     | Hash Table + Doubly Linked List |
| TreeMap           | Red-Black Tree                  |
| HashSet           | HashMap                         |
| LinkedHashSet     | LinkedHashMap                   |
| TreeSet           | Red-Black Tree                  |
| PriorityQueue     | Binary Heap                     |
| ArrayDeque        | Circular Array                  |
| ConcurrentHashMap | Concurrent Hash Table           |

