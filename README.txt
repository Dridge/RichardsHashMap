This is Richards version of hashmap, used to gain more knowledge of how
hashmaps work and one day improve on the basic functionality.

We need an unsorted, unordered Map.

It will implement the map interface.

It should permit null values and allow one null key. (Unlike Hashtable)

It will not be synchronised. (Unlike Hashtable)

There should be some concept of "capacity" and "load factor", the latter
is between 0 and 1 and is used to gauge at what percentage of capacity
should the Map rehash all objects in the map.

Needs a way of hashing for a unique code that also ensures equality for
the same objects, or objects with exactly the same values

Must consistently return the same hashcode every time

Should be able to store the key-value pair with an Entry inner class