package Hashtable;

import java.util.*;

public class HashTable<K,V> {

    private ArrayList<HashNode<K, V>> bucketsArr;

    private int buckets;

    private int size;

    public HashTable() {
        bucketsArr = new ArrayList<>();
        buckets = 10;
        size = 0;

        for (int index = 0; index < buckets; index++) {
            bucketsArr.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        int index = hashCode % buckets;

        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }


    public void add(K key, V value) {

        int tableIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketsArr.get(tableIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        size++;
        head = bucketsArr.get(tableIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketsArr.set(tableIndex, newNode);

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketsArr;
            bucketsArr = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;

            for (int index = 0; index < buckets; index++) {
                bucketsArr.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketsArr.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }
        return null;
    }

    public boolean contains(K key) {
        if (key == null){
            throw new IllegalArgumentException("not null");
        }
        return getValue(key) != null;
    }


    public String  repeatedWord(String strings){

        String lowerCased = strings.toLowerCase(Locale.ROOT);
        String [] stringArr = lowerCased.split(" ");
        HashTable<String, Integer> hashMap = new HashTable<String, Integer>();


        for (String element : stringArr){

            if(element.contains(",")){
                element = element.substring(0, element.length()-1);
            }

            if(!element.equals("")){

                int counter = hashMap.getValue(element) != null ? hashMap.getValue(element) : 0;

                if (counter == 1){
                    return element;
                }
                hashMap.add(element, counter + 1);
            }
        }

        return "None";
    }

    public HashMap<Integer,Integer> hashMap = new HashMap<>();
    public List<Integer> list = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree firstTree, BinaryTree secondTree){

        if (firstTree.getRoot() == null || secondTree.getRoot()  == null) {
            return null;
        }

        treeTraversal(secondTree.getRoot() );

        nodesComparison(firstTree.getRoot() );

        return list;
    }

    public void treeTraversal(TreeNode treeNode) {

        if (treeNode != null) {

            int counter = 0 ;
            if(hashMap.get(treeNode.getKey()) == null){
                counter = 1;
            }else{
                counter = counter +1;
            }

            hashMap.put(treeNode.getKey(),counter);

            treeTraversal(treeNode.getLeft());
            treeTraversal(treeNode.getRight());
        }
    }

    public void nodesComparison(TreeNode treeNode){
        if (treeNode != null) {
            if (hashMap.get(treeNode.getKey()) != null){
                list.add(treeNode.getKey());
            }
            nodesComparison(treeNode.getLeft());
            nodesComparison(treeNode.getRight());
        }

    }


    public static List<String> leftJoin(HashMap<String, String> hashTableOne, HashMap<String, String> hashTableTwo) {

        if (hashTableOne.keySet().isEmpty()) {
            return null;
        }
        List<String> list = new ArrayList<>();
        for (String node : hashTableOne.keySet()) {

            list.add("[ " + node + ", " + hashTableOne.get(node) + ", " + hashTableTwo.get(node) + " ]");
        }
        return list;
    }


    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketsArr +
                '}';
    }
}
