/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

/**
 *
 * @author User
 */
public interface HashtableInterface<K, V> {
    public V add(K key, V value);
    public V remove(K key);
    public V getValue(K key);
    public boolean contains(K key);
    public boolean isEmpty();
    public int getSize();
     public void clear();
}

