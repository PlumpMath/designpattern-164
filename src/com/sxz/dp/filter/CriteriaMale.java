/**
 * 
 */
package com.sxz.dp.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BG243085
 *
 */
public class CriteriaMale implements Criteria {

	/* (non-Javadoc)
	 * @see com.sxz.dp.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}
