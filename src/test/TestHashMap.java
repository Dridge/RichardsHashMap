import junit.framework.TestCase;
import main.MyHashMap;

/**
 * Created with Intellij IDEA
 * Creator: Richard
 * Date: 20/06/2017
 */
public class TestHashMap extends TestCase {
    private final MyHashMap hashmap = new MyHashMap();

    public void testAnEmptyMap() {
        assertTrue(new MyHashMap().size() == 0);
        assertTrue(new MyHashMap().isEmpty());
    }

    public void testAddingToMap() {

    }

    public void testAddingToHashMap() {
        hashmap.put("key1","value1");
        assertNotNull(hashmap.get("key1"));
        assertTrue("value1".equals(hashmap.get("key1")));
    }

    public void testRemovingFromHashMap() {
        String key = "key2";
        String value = "value2";
        hashmap.put(key, value);
        hashmap.remove(key);
    }

    public void testIsNotEmptyHashMap() {
        String key = "key3";
        String value = "value3";
        hashmap.put(key, value);
        assertFalse(hashmap.isEmpty());
        assertFalse(hashmap.size() != 0);
    }

}
