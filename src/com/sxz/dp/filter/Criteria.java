/**
 * 
 */
package com.sxz.dp.filter;

import java.util.List;

/**
 * 为标准创建 一个接口
 * @author BG243085
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person>persons);
}
