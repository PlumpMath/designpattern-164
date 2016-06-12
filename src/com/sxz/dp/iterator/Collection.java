/**
 * 
 */
package com.sxz.dp.iterator;

/**
 * @author BG243085
 *
 */
public interface Collection<T> {
	void add(T obj);
	Iterator<T> iterator();
}
